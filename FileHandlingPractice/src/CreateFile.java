import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File file=new File("Chiku.txt");
		if (file.exists()) {
			System.out.println("File is Already Created....!!!!");
		}
		else {
			try {
				file.createNewFile();
				
				System.out.println("File is created......!");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
