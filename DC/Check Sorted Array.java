import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int ans=0;
		if (arr[0]>arr[1]){
		for (int i=1;i<n;i++){
		    if (arr[i-1]<arr[i]){
		        ans=1;
		    }
		}else{
		    for (int i=1;i<n;i++){
		        if (arr[i-1]>arr[i]){
		            ans=1;
		        }
		    }
		}
		if (ans==1){
		    System.out.print("no");
		}else{
		    System.out.print("yes");
		}
		

	}
