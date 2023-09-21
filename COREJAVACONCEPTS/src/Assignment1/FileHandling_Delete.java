package Assignment1;
import java.io.File;
import java.io.IOException;
public class FileHandling_Delete {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try
		{
			File myFile = new File("file1.txt");
			if(myFile.exists())
			{
				myFile.delete();
				System.out.println("File deleted Successfully...");
;			}
			else
			{
				System.out.println("File DO NOT Exist");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
