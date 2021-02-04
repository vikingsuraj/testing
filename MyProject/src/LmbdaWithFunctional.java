
@FunctionalInterface
interface function1 {
	int sum(int a, int b);
}

@FunctionalInterface
interface functional2 {
	int sum(int a, int b);
}

public class LmbdaWithFunctional implements function1, functional2 {
	public static void main(String[] args) {

		function1 function = (a, b) -> a + b;
	
		System.out.println(	function.sum(100, 20)); 

	}

	@Override
	public int sum(int a, int b) {
		return 0;
	}
}
