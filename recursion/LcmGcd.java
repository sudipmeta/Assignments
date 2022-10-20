package recursion;

public class LcmGcd {
	public  static int hcf(int num1, int num2) {
		if (num1 == 0)
			return num2;
		return hcf(num2 % num1, num1);
	}
	public static int lcm(int a, int b) {
		
		return (a*b)/hcf(a,b);
	}
public static void main(String args[]) {
	System.out.println(hcf(16, 8));
	System.out.println(lcm(16,8));
}
}
