public class XepHau {
	static int n = 8;
	static int x[] = new int[n];
	// x[i] = j: Con hau tai vi tri hang i cot j

	static int cot[] = new int[n];
	static int cheoChinh[] = new int[2 * n];
	static int cheoPhu[] = new int[2 * n];
	static int count = 0; 

	public static void main(String[] args) {
		xephau(0);
		System.out.print("Co " + count + " cach xep hau.");
	}

	public static void ghiNhan() {
		count++;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == x[i]) {
					System.out.print(" 0 ");
				} else {
					System.out.print(" + ");
				}
			}
			System.out.println();
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public static void xephau(int i) {
		for (int j = 0; j < n; j++) {
			if (cot[j] == 0 && 
					cheoChinh[i - j + n] == 0 && 
					cheoPhu[i + j] == 0) {
				x[i] = j;
				cot[j] = 1;
				cheoChinh[i - j + n] = 1;
				cheoPhu[i + j] = 1;
				if (i == n - 1) {
					ghiNhan();
				} else {
					xephau(i + 1);
				}
				cot[j] = 0;
				cheoChinh[i - j + n] = 0;
				cheoPhu[i + j] = 0;
			}
		}
	}
}
