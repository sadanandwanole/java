import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileNumber {
	public static void main(String[] args) throws IOException {
		File file=new File("chilu.txt");
		if (file.exists()) {
			System.out.println("File Is Already Present......!!1");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("File Created Succusefull....!!!");
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		try {
//			FileOutputStream fileOutputStream=new FileOutputStream(file);
//			fileOutputStream.write(300);;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
			try {
				FileInputStream fileInputStream=new FileInputStream(file);
				int read = fileInputStream.read();
				System.out.println(read);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
	}

}
