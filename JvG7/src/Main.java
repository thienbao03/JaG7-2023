import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int a,b,c,n;
		do {
			Menu();
			System.out.print("Nhap lua chon: ");
			int luachon = input.nextInt();
			switch(luachon) {
			case 1:
				System.out.print("Nhap a: ");
				a = input.nextInt();
				System.out.print("Nhap b: ");
				b = input.nextInt();
				System.out.print("Nhap c: ");
				c = input.nextInt();
				B1.PTB2(a, b, c);
				break;
			case 2: 
				System.out.print("Nhap n: ");
				int gt = input.nextInt();
				System.out.printf("Giai thua cua %d: %d\n", gt, B2.GT(gt));
				break;
			case 3:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				System.out.printf("So Fibonacci thu %d: %d\n",gt,B3.Fibo(n));
				break;
			case 4:
				System.out.print("Nhap a: ");
				a = input.nextInt();
				System.out.print("Nhap b: ");
				b = input.nextInt();
				System.out.printf("Uoc chung lon nhat cua %d va %d: %d",a,b,B4.UCLN(a, b));
				System.out.printf("\nBoi chung nho nhat cua %d va %d: %d\n",a,b,B4.BCNN(a,b));
				break;
			case 5:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				System.out.printf("Cac so nguyen to nho hon %d: ",n);
				B5.InSNT(n);
				break;
			case 6:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				System.out.printf("\n%d so nguyen to dau tien: ", gt);
				B6.FirstSNT(n);
				break;
			case 7:
				System.out.print("Cac so nguyen to co 5 chu so: ");
				B7.SNT5(args);
				break;
			case 8:
				System.out.println("Nhap n: ");
				n = input.nextInt();
				System.out.printf("Tong cac chu so cua %d: %d\n",gt, B8.TongChuso(n));
				break;
			case 9:
				B9.in();
				break;
			case 10:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				B10.lietKe(n);
				break;
			default:
				flag = false;
				break;
		}
	}while(flag);
}
	static void Menu () {
		System.out.printf("%-6s\n", "[1]");
		System.out.printf("%-6s\n", "[2]");
		System.out.printf("%-6s\n", "[3]");
		System.out.printf("%-6s\n", "[4]");
		System.out.printf("%-6s\n", "[5]");
		System.out.printf("%-6s\n", "[6]");
		System.out.printf("%-6s\n", "[7]");
		System.out.printf("%-6s\n", "[8]");
		System.out.printf("%-6s\n", "[9]");
		System.out.printf("%-6s\n", "[10]");
		
	}
}
