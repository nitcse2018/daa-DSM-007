import java.io.*;

public class CharStream {

	public CharStream() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	    try {
	    	//initialize the file pointers
			FileReader fr = new FileReader(".//src//input.txt");
			FileWriter fw = new FileWriter(".//src//output.txt");
			
			//read from one file and write to other
			int i;
			while((i = fr.read()) != -1) {
				fw.write(i);
			}
			
			//close the files
			fr.close();
			fw.close();
			
			System.out.println("success....");
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	}

}
