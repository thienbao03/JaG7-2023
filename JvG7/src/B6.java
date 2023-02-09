
public class B6 {
	static void FirstSNT (int n) {
		int tmp = 0;
		int count = 0;
		while(count < n) {
			if (B5.KtrSNT(tmp)) {
				System.out.print(tmp + " ");
				count += 1;
			}
			tmp += 1;
		}
	}
}
