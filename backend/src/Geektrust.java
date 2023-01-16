import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Geektrust {

	public static void main(String[] args) {

		try {
			// the file to be opened for reading
			FileInputStream fis = new FileInputStream(args[0]);
			Scanner sc = new Scanner(fis); // file to be scanned

			CalculateToll newToll = new CalculateToll();

			// returns true if there is another line to read
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] inputArray = line.split(" ");

				if (inputArray[0].equalsIgnoreCase("FASTAG"))
					newToll.setFastag(inputArray[1], Integer.parseInt(inputArray[2]));

				else if (inputArray[0].equalsIgnoreCase("COLLECT_TOLL"))
					newToll.setCollectToll(inputArray[1], inputArray[2]);

				else {
					newToll.setPrintCollection();
				}
			}
			sc.close(); // closes the scanner
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
