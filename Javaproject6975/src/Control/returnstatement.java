package Control;

public class returnstatement {
	public int show(int c, int d) {
		return c + d;
	}

	public static void main(String[] args) {
		returnstatement obj = new returnstatement();

		System.out.println(" ---" + obj.show(10, 20));
	}

}
