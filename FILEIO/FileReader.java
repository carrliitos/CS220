import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// what if the file is not there? -- that's why we have the throws exception

		//http://textfiles.com/100/captmidn.txt

		// read in the file
		File file = new File("/home/carlitos/Documents/School/Java/FILEIO/captmidn.txt");

		Scanner scan = new Scanner(file);
		// System.out.println(scan.nextLine()); 		// reads the first line of the file

		/*
		while(scan.hasNextLine()){
			System.out.println(scan.nextLine());		// reads all the lines	
		}
		*/

		String fileContent = "";
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}

		FileWriter writer = new FileWriter("/home/carlitos/Documents/School/Java/FILEIO/newfile.txt");
		writer.write(fileContent);
		writer.close();
	}
}
