import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r_c=(n*2)+1;
		int cnt=1;
		for (int i=0;i<r_c;i++){
		    for (int j=0;j<r_c;j++){
		        if (i==n|| j==n){
		            System.out.print("+ ");
		        }else if (j<n){
		            System.out.print(j+1+" ");
		        }else if (j>n){
		           System.out.print(j-cnt+" ");
		           cnt+=2;
		        }
		    }
		    cnt=1;
		    System.out.println();
		}
	}
}
