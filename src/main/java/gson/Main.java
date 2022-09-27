package gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main extends Persona {
	public static void main(String[] args) {
		Persona p = new Persona();

		Scanner scanner = new Scanner(System.in);
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		int line3 = scanner.nextInt();

			p.setNombre(line1);
			p.setApellidos(line2);
			p.setEdad(line3);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			String json = gson.toJson(p);
			System.out.println(json);

	}

}
