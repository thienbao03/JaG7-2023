
public class B5 {
	static boolean KtrSNT(int n) {
        if (n < 2) {
            return false;
        }
        int CB2 = (int) Math.sqrt(n);
        for (int i = 2; i <= CB2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	static void InSNT(int n) {
		if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (KtrSNT(i)) {
                System.out.print(" " + i);
            }
        }
	}
}
