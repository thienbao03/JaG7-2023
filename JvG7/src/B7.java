
public class B7 {
	static void SNT5(String[] args) {
        int count = 0;
        System.out.println("Liệt kê tất cả số nguyên tố có 5 chữ số:");
        for (int i = 10001; i < 99999; i+=2) {
            if (B5.KtrSNT(i)) {
                System.out.println(i);
                count++;
            }
        }
	}
}
