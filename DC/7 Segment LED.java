import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]={6,2,5,5,4,5,6,3,7,6};
		while(n!=0){
		    int ind=n%10;
		    sum+=arr[ind];
		    n/=10;
		}
		System.out.print(sum);
	}
}
