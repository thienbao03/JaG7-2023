
public class B4 {
	public static int UCLN(int a, int b) {
		while(a != b) {
			if (a > b) a -= b;
			else b -= a;
		}
		return a;
	}
	 static int BCNN(int a, int b) {
			return (a*b)/UCLN(a,b);
		}
}
