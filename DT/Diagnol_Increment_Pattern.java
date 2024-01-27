import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int start=0;
		int end=n-1;
		int cnt=1;
		for (int i=0;i<n;i++){
		    for (int j=0;j<n;j++){
		        if (start==j||end==j){
		            System.out.print(cnt+" ");
		            cnt++;
		        }else{
		            System.out.print("* ");
		        }
		    }
		    System.out.println();
		    start++;
		    end--;
		}
	}
}
