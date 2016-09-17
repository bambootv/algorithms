
public class NhiPhan {
	
	static int[] x = new int[3];
	
	public static void ghiNhan() {
		for (int i = 0; i < 3; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	
	public static void nhiPhan(int i) {
		for (int j = 0; j < 2; j++) {
			x[i] = j;
			if (i == 2) {
				ghiNhan();
			} else { 
				nhiPhan(i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		nhiPhan(0);
	}
}
