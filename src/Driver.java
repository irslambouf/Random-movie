import java.util.Random;

public class Driver {

	public static void main(String[] args) {
		int random = new Random().nextInt(4);
		String[] films = {"Black Mass", "Spotlight", "Sicario", "Legend"};
		System.out.println(films[random]);
	}

}
