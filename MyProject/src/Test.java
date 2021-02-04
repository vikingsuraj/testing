
interface baseinterface {
	void show();
}

interface midbase {
	void show();
}

interface chidinterface extends midbase, baseinterface {

	default void callme() {
		show();
	}

}

public class Test implements chidinterface {

	void testing() {
		chidinterface.super.callme();
		System.out.println("hello");
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.testing();
	}

	@Override
	public void show() {

	}

}
