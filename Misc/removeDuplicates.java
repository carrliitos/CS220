import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class removeDuplicates {
	public static void main(String[] args) {
		String path = "actionsList.csv";
		List<Actions> actions;

		try {
			actions = readActionsFromFile(path);
		}catch(FileNotFoundException f) {
			System.out.println("File not found");
			return;
		}catch(IOException e) {
			System.out.println("Error while reading the file");
			return;
		}


		try {
			writeActionsToFile(actions, "NewActions.csv");
			System.out.println("Successfully wrote to a new csv file.");
		}catch(IOException e) {
			System.out.println("Could not write to new one");
			return;
		}
	}

	private static List<Actions> readActionsFromFile(String path) throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		ArrayList<Actions> actions = new ArrayList<>();

		reader.readLine();

		String line;
		while((line = reader.readLine()) != null) {
			String[] columns = line.split(",");
			String a = columns[0];
		
			Actions action = new Actions(a);
			actions.add(action);
		}
		reader.close();
		return actions;
	}

	private static void writeActionsToFile(List<Actions> actions, String path) throws IOException {
		File file = new File(path);
		if(!file.exists()) {
			file.createNewFile();
		}

		BufferedWriter writer = new BufferedWriter(new FileWriter(path));

		writer.write("action");
		writer.newLine();
		for (int i = 0; i < actions.size(); i++) {
			Actions action = actions.get(i);
			String a = action.getAction();
			
			String line = String.join(",", a);

			writer.write(line);
			writer.newLine();
		}
		writer.close();
	}
}