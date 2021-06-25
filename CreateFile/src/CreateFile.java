


import java.io.File;


public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		File myobj = new File("filename.txt");
		if(myobj.delete()) {
	System.out.println("successfully deleted"+myobj.getName());
	
	}
		else {
			System.out.println("failed to delete the file");
		}
	}

}
