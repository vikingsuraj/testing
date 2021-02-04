import java.util.LinkedHashMap;
import java.util.Scanner;

public class StringPoolDemo {

	public static void main(String[] args) {

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		for (Character character : input.toCharArray()) {
			if (map.containsKey(character))
				map.put(character, map.get(character) + 1);
			else
				map.put(character, 1);
		}

		System.out.println(map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get());

		sc.close();

	}

}
