
public class Date_26_CountText_file {

	public static void main(String[] args) {
		// declaring string [] with initialized value

		String[] docs = { "anil.txt", "anil.pdf", "kumar.txt", "baral.pdf", "anil.xml", "sunil.txt", "doc.pdf" };

		// now im using loop to count how many txt is there
		int count = 0;
		for (int i = 0; i < docs.length; i++) {
			if (docs[i].endsWith(".txt"))
				count++;

		}
		System.out.println(count);

	}

}
