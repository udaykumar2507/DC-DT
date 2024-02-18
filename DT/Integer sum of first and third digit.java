import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.next();
		int sum=n.charAt(0)+n.charAt(2)-'0'*2;
		System.out.print(n.contains(sum+"")?"yes":"no");

	}
}
