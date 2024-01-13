import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int temp=n;
		int c=0;
		while(temp>0){
		    c++;
		    temp/=10;
		}
		int half=c/2;
		int val=(int)Math.pow(10,half);
		System.out.print((int)(n/val)*(n%val));
	}
}
