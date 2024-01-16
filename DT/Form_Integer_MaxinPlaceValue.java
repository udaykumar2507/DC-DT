import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE;;
		for (int i=0;i<n;i++){
		    max=Math.max(max,len(arr[i]));
		}
		int max1=Integer.MIN_VALUE;
		int i=0;
		String ans="";
		while(i<max){
		    max1=0;
		    for (int j=0;j<n;j++){
		        int val=(int)Math.pow(10,i);
		        int unit_dig=(arr[j]/val)%10;
		        max1=Math.max(max1,unit_dig);
		    }
		    i++;
		    ans+=(max1+"");
		}
		rev(ans);
		System.out.print("Hello");
	}
	private static int  len(int n){
	    int cnt=0;
	    while(n>0){
	        cnt++;
	        n/=10;
	    }
	    return cnt;
	}
  	private static void rev(String s ){
	    for (int i=s.length()-1;i>=0;i--){
	        System.out.print(s.charAt(i));
	    }
	}
}
