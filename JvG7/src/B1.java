
public class B1 {
	static void PTB2(float a, float b, float c) {
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.print("PT vo nghiem");
		else if (delta == 0)
			System.out.print("PT co nghiem kep la: " + (-b/2*a));
		else {
			double x1 = (-b-Math.sqrt(delta))/2*a;
			double x2 = (-b+Math.sqrt(delta))/2*a;
			System.out.printf("PT co 2 nghiem x1 = %f, x2 = %f", x1,x2);
			
		}
	}
}
