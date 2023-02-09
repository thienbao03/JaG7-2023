
public class B3 {
	public static long Fibo(int n) {
		long f0 = 0, f1 = 1;
		long f2 = 1;
		for(int i = 2;i<=n;i++)
			if (n<1)
				return 0;
		for(int i = 2;i<n;i++)
		{
			f2= f0+f1;
			f0=f1;
			f1=f2;	
		}
		return f2;
	}
}
