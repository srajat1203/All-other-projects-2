

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloworld
 */



@WebServlet("/helloworld")
public class helloworld extends HttpServlet {
	private String message;
	
	String name = "";
	String n = "";
	String first = "";
	String last = "";
	String fname = "";
	String lname = "";

	  public void init() throws ServletException
	  {
	      // Do required initialization
 
	   
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  
		  try
			{
		    	Class.forName("oracle.jdbc.driver.OracleDriver");
				
		    	String url = "jdbc:oracle:thin:testuser/password@localhost"; 


				//properties for creating connection to Oracle database
				Properties props = new Properties();
				props.setProperty("user", "testdb");
				props.setProperty("password", "password");
			    message = "Login Form";
		    	
		    	Connection conn = DriverManager.getConnection(url,props);

				String sql ="select CUSTOMER_ID, CUST_FIRST_NAME, CUST_LAST_NAME from " + "DEMO_CUSTOMERS";

				//creating PreparedStatement object to execute query
				PreparedStatement preStatement = conn.prepareStatement(sql);

				ResultSet result = preStatement.executeQuery();
				while(result.next())
				{
					int id = result.getInt("CUSTOMER_ID");
					fname = result.getString("CUST_FIRST_NAME");
					lname = result.getString("CUST_LAST_NAME");
					name = fname + " " + lname;
					n += "<tr><td>" + name + "</td><tr>";
				

					first += "<a href =\" details?customerID=" + id + "\">" + fname + "</a></br>";
					last += lname + "<br>";
					
				}	
			}
		    catch (Exception e)
			{
				e.printStackTrace();
			}
		  
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      //PrintWriter out = response.getWriter();
	      //out.println("<h1>" + message + "</h1>"); 
	    
	      
	      
	      request.setAttribute("first",first);
	      request.setAttribute("last", last);
	      
	      getServletContext()
	      	.getRequestDispatcher("/output.jsp")
	      	.forward(request, response);
	 
	   } 

	   public void destroy() 
	   { 
	     // do nothing. 
	   } 

}
