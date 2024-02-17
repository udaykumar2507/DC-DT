import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int max=-1;
		for(int i=0;i<n;i++){
		    String s=sc.next();
		    if (ispalindrome(s)){
		        max=Math.max(max,s.length());
		    }
		}
		System.out.print(max);
	}
	private static boolean ispalindrome(String s){
	    int n=s.length();
	    for(int i=0;i<n/2;i++){
	        if (s.charAt(i)!=s.charAt(n-i-1)){
	            return false;
	        }
	    }
	    return true;
	}
}
