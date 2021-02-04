
class base {
	public base() {
	}

	public void showBase() {
		System.out.println("in showBase");
	}
}

class middle extends base {
	public middle() {
		// TODO Auto-generated constructor stub
	}

	public void showBase() {
		System.out.println("in showMiddle");
		
	}
}

class child extends middle {
	public child() {
		super.showBase();
		showBase();
	}

	public void showBase() {
		System.out.println("in showChild");
	}
}

public class CheckSuper {
	public static void main(String[] args) {
		child c = new child();
	}

}
