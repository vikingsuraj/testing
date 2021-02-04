
public class RecurionTesting {
	static int count = 0;

	public static void main(String[] args) {

		int i = callme();
		System.out.println(i);
	}

	private static int callme() {

		System.out.println("hello");

		if (++count > 10)
			return 0;

		count += callme();

		return count;
	}

}
