import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [123];
		int vis[]=new int [123];
		String s=sc.nextLine();
		for (int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    arr[c]++;
		}int cnt=0;
		for (int i:arr){
		    if (i>=1){
		        cnt++;
		    }
		}
		int []fibonacci=fibo(cnt);
		int cnt1=0;
		for (int i=0;i<fibonacci.length;i++){
		    for (int j=0;j<arr.length;j++){
		        if (fibonacci[i]==arr[j] && vis[j]==0){
		            cnt1++;
		            vis[j]=1;
		            break;
		    }
		}
		}
		if (cnt==cnt1){
		    System.out.print("YES");
		}else{
		    System.out.print("NO");
		}
    }
	private static int[] fibo(int n){
	    int arr[]=new int [n];
	    int fir=0;
	    int sec=1;
	    int i=1;
	    arr[0]=1;
	    while(i<n){
	        arr[i]=fir+sec;
	        fir=sec;
	        sec=arr[i];
	        i++;
	    }
	    return arr;
	    
	}
}
