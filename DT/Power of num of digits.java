import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int n1=n;
        int len=0;
        while(n1!=0){
            len++;
            n1/=10;
        }
        int sum=0;
        while(n!=0){
            sum+=Math.pow(len,n%10);
            n/=10;
        }
        System.out.print(sum);
	}
}
