import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		
		File file=new File("chiku.txt");
		if (file.exists()) {
			file.delete();
			System.out.println("File deleted .....!!!!");
		}
		else {
			System.out.println("File not Found....!!!");
		}
		
	}

}
