import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteCharData {
	public static void main(String[] args) {
		
		File file=new File("NEW.txt");
		if (file.exists()) {
			System.out.println("File Already Exists...!!");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("New File Created....!!!");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if (file.canWrite()) {
			try {
				FileWriter fileWriter=new FileWriter(file);
				fileWriter.write("sadanand wanole sadanand");
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		if (file.canRead()) {
			try {
				FileReader fileReader=new FileReader(file);
				Scanner scanner=new Scanner(file);
				while (scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

}
