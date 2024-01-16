import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toBinaryString(n);
		String x=Integer.toBinaryString(Integer.parseInt(s));
		System.out.print("   "+x);

	}
}
