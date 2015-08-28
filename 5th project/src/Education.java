import java.text.NumberFormat;

public class Education {
	//private String s1, s2, s3, s4, s5, s6, s7, s8, s9, s10;
	private String[] arr = new String [10];
	

	
	public void setEducation(String[] schools)
	{
		for(int i=0; i<10; i++)
		{
			arr[i] = schools[i];
		}
	}
	
	public String[] getEducation()
	{
		return arr;
	}
}
