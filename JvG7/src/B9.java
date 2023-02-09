
public class B9 {
	static boolean ThuanNghich(int n) {
		int tg = n;
		int tmp = 0;
		while(n>0) {
			tmp = tmp*10+ n%10;
			n/=10;
		}
		if (tmp == tg) return true;
		return false;
	}
	static void in() {
		int count = 0 ;
		for ( int i = 100000;i<= 999999;i++) {
			if (ThuanNghich(i)) {
				if (count%10 == 0) System.out.println("");
				count++;
				System.out.print(" "+i);
			}
		}
	}
}
