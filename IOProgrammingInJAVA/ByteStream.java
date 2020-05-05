import java.io.*;

public class ByteStream {

	public ByteStream() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try { 
			//Initialize the pointers
			FileInputStream fin = new FileInputStream(".//src//input.txt"); 
			FileOutputStream fout = new FileOutputStream(".//src//output.txt"); 
			
			//read from the input file and write to output file
			int i=0;
			while((i = fin.read())!= -1) {
				fout.write(i);
			}
			
			//don't forget to close the files
			fin.close();
			fout.close(); 
			System.out.println("success...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
