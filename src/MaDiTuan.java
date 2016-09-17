public class MaDiTuan {
	static int count = 0;
	static int n = 5;
	static int a[] = { -2, -1, 1, 2, 2, 1, -1, -2 };
	static int b[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
	static int bang[][] = new int[n][n];

	public static void main(String[] args) {
		khoiTao();
		int x = 0;
		int y = 0;

		bang[x][y] = 1;
		diTuan(1, x, y);
		System.out.println("Co " + count + " dap an.");
	}

	public static void khoiTao() {
		for (int i = 0; i < bang.length; i++) {
			for (int j = 0; j < bang.length; j++) {
				bang[i][j] = 0;
			}
		}
	}

	public static void ghiNhan() {
		for (int i = 0; i < bang.length; i++) {
			for (int j = 0; j < bang.length; j++) {
				System.out.print(bang[i][j] + "      ");
			}
			System.out.println();
		}

		System.out.println("*********************************");
	}

	public static void diTuan(int i, int x, int y) {
		for (int j = 0; j < 8; j++) {
			int u = x + a[j];
			int v = y + b[j];

			if (0 <= u && u < n && 0 <= v && v < n && bang[u][v] == 0) {
				bang[u][v] = i + 1;
				if (i + 1 == n * n) {
					count++;
					ghiNhan();
				} else {
					diTuan(i + 1, u, v);
				}
				bang[u][v] = 0;
			}
		}
	}

}
