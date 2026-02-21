package exceptionhandlingdemo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class IOException {

	public static void main(String[] args) { 
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java Notes\\demo.txt"));
			String data = "";
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}

		// TODO Auto-generated method stub

	}

}
