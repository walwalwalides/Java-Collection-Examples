package Solution;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	
	public void read()
	{

		  BufferedReader objReader = null;
		  try {
		   String strCurrentLine;
		   objReader = new BufferedReader(new FileReader("test.txt"));
		   while ((strCurrentLine = objReader.readLine()) != null) 
		   {
		   System.out.println(strCurrentLine); 
		   }

		  } 
		  catch (IOException e) 
		  {
		   e.printStackTrace();
		  } 
		  finally {
		   try {
		    if (objReader != null)
		     objReader.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   }
		  }
		 }
	
	
	
	
}
		

