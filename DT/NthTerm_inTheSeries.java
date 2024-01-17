import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ans(n);
	}
	private static void ans(int n){
	    if (n==1 ||n==2){
	        System.out.print(n-1+3);
	    }else{
	        n=n-1;
	        ans((int)n/2);
	        System.out.print(n%2+3);
	    }
	}
}
