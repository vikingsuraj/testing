import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Streams {
	public static void main(String[] args) {

		/*
		 * List<String> list = new ArrayList<String>(); Map<String, String> map = new
		 * HashMap<>();
		 * 
		 * map.put("1", "1"); map.put("2", "1"); map.put("3", "1"); String str = "abc";
		 * String str2 = "def"; System.out.println(str.equals(str = str2));
		 * System.out.println(str.equals(str2 = str)); System.out.println(8.9/4);
		 * System.out.println(8.9/4.3);
		 */

		/*
		 * float f=20.0f; float f1=(float) 2e41;
		 * 
		 * boolean b = false;
		 * 
		 * fun(b);
		 */

		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("suraj", 100);
		map.put("aman", 200);
		map.put("datta", 300);
		map.put("pawan", 400);

		List<String> list = map.entrySet().stream().map(x -> x.getKey()).collect(Collectors.toList());
		map.entrySet().stream().map(x -> x.getKey()).collect(Collectors.toList());
		System.out.println(list);
	}

	static void fun(boolean b) {

		if (b)
			if (b)
				if (b)
					System.out.println("true, true");
				else
					System.out.println("true false");
			else
				System.out.println("false false");
		else
			System.out.println("false false false");
	}
}
