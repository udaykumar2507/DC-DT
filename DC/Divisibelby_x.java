import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n]; 
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int y=sc.nextInt();
		boolean flag=false;
		for (int i=0;i<n;i++){
		    if (count(arr[i])==x){
		        if (arr[i]%y==0){
		            flag=true;
		            System.out.print(arr[i]+" ");
		        }
		    }
		}
		if (flag==false){
		    System.out.print(-1);
		}
		

	}
	private static int count(int n){
	    int count=0;
	    while(n>0){
	        count++;
	        n/=10;
	    }
	    return count;
	}