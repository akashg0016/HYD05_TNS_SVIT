package Assignment1;
import java.io.File;
import java.io.IOException;

public class FileHandling_Create {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			File myobj = new File("file1.txt");
			if(myobj.createNewFile())
			{
				System.out.println("File created" + myobj.getName());
			}
			else
			{
				System.out.println("File already exists");
				System.out.println( myobj.getAbsolutePath());
			}
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}

}
