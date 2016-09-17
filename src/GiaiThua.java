public class GiaiThua {

	public static void main(String[] args) {
		System.out.println("5! = " + giaiThua(5));
	}

	public static double giaiThua(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * giaiThua(i - 1);
		}
	}

}
