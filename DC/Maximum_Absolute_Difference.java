import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int i=0;
		int j=1;
		int sum=Integer.MIN_VALUE;
		while(j<n){
		    if (Math.abs(arr[i]-arr[j])>sum){
		        sum=Math.abs(arr[i]-arr[j]);
		    };
		    i++;
		    j++;
		}
		System.out.print(sum);
	}
}
