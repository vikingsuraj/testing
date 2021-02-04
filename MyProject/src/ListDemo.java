public class ListDemo {

	public int calculate() {
		System.out.println("calculation");

		try {
			int i=10/0;

		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
			return 0;
		} finally {
			return 1;
		}

	}

	public static void main(String[] args) {
		ListDemo ld = new ListDemo();
		ld.calculate();

	}

}
