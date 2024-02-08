import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int cnt=1;
		while(cnt<=n){
		    System.out.print(cnt+" ");
		    i++;
		    cnt=i*i;
    }
	}
}
