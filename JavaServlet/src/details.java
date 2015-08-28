

import java.io.IOException;
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
 * Servlet implementation class details
 */
@WebServlet("/details")
public class details extends HttpServlet {
private String message;
	
	String name = "";
	String n = "";
	String first = "";
	String last = "";
	String fname = "";
	String lname = "";
	String a1 = "";
	String a2 = "";
	String city = "";
	String state = "";
	String pc = "";
	String phone1 = "";
	String phone2 = "";
	String credit = "";
	String email = "";
	
	String p1 = "";
	String p2 = "";
	String p3 = "";
	String p4 = "";
	String p5 = "";
	String p6 = "";
	String p7 = "";
	String p8 = "";
	String p9 = "";
	String p10 = "";
	String p11 = "";
	
	

	  public void init() throws ServletException
	  {
	      // Do required initialization
 
	   
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  String action = request.getParameter("customerID");
		  int idno = Integer.parseInt(action);
		  //System.out.println(idno);
		  
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

				String sql ="select CUST_FIRST_NAME, CUST_LAST_NAME, CUST_STREET_ADDRESS1, CUST_STREET_ADDRESS2, CUST_CITY, CUST_STATE, CUST_POSTAL_CODE, PHONE_NUMBER1, PHONE_NUMBER2, CREDIT_LIMIT, CUST_EMAIL from " + "DEMO_CUSTOMERS " + "WHERE CUSTOMER_ID = ?";
				
				//creating PreparedStatement object to execute query
				PreparedStatement preStatement = conn.prepareStatement(sql);
				preStatement.setInt(1, idno);
				
				ResultSet result = preStatement.executeQuery();
				while(result.next())
				{
					
					fname = result.getString("CUST_FIRST_NAME");
					lname = result.getString("CUST_LAST_NAME");
					a1 = result.getString("CUST_STREET_ADDRESS1");
					a2 = result.getString("CUST_STREET_ADDRESS2");
					city = result.getString("CUST_CITY");
					state = result.getString("CUST_STATE");
					pc = result.getString("CUST_POSTAL_CODE");
					phone1 = result.getString("PHONE_NUMBER1");
					phone2 = result.getString("PHONE_NUMBER2");
					credit = result.getString("CREDIT_LIMIT");
					email = result.getString("CUST_EMAIL");
					
					
					
					
					
					//n += "<tr><td>" + name + "</td><tr>";
				

					p1 += fname + "<br>";
					p2 += lname + "<br>";
					p3 += a1 + "<br>";
					p4 += a2 + "<br>";
					p5 += city + "<br>";
					p6 += state + "<br>";
					p7 += pc + "<br>";
					p8 += phone1 + "<br>";
					p9 += phone2 + "<br>";
					p10 += credit + "<br>";
					p11 += email + "<br>";
					
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
	    
	      
	      
	      request.setAttribute("fname",p1);
	      request.setAttribute("lname", p2);
	      request.setAttribute("a1", p3);
	      request.setAttribute("a2", p4);
	      request.setAttribute("city", p5);
	      request.setAttribute("state", p6);
	      request.setAttribute("pc", p7);
	      request.setAttribute("phone1", p8);
	      request.setAttribute("phone2", p9);
	      request.setAttribute("credit", p10);
	      request.setAttribute("email", p11);
	      
	      
	      getServletContext()
	      	.getRequestDispatcher("/Detail.jsp")
	      	.forward(request, response);
	 
	   } 

	   public void destroy() 
	   { 
	     // do nothing. 
	   } 
}
