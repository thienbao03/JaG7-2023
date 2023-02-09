
public class B10 {
	static boolean checkFibo(int n) {
		if (n ==0 || n == 1) return true;
		int f1 = 1;
		int f2 = 0;
		for (int i = 3; i<93; i++) {
			int f = f1 + f2;
			if (f == n) return true;
			f2 = f1;
			f1 = f;
		}
		return false;
	}
	static void lietKe(int n) {
		System.out.print("So Fibonacci nho hon n va la so nguyen to: ");
		for (int i=0; i<n ;i++) {
			if (B10.checkFibo(i))
				if (B5.KtrSNT(i))
				System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
