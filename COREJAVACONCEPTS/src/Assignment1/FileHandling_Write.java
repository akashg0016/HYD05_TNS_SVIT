package Assignment1;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling_Write {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
			FileWriter myWriter = new FileWriter("file1.txt");
			myWriter.write("WELCOME TO FILE HANDLING, lET'S LEARN HOW TO WRITE INTO A FILE");
		    myWriter.close();
		    System.out.println("Successfully written into the file");
		}
		catch(IOException e)
		{
			System.out.println("Error Occured!!!");
			e.printStackTrace();
		}
		
	}

}
