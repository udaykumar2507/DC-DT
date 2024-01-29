import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int arr[]=new int [123];
		for (int i=0;i<s1.length();i++){
		    arr[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length();i++){
		    arr[s2.charAt(i)]++;
		}
		boolean flag=true;
		for (int i=97;i<=122;i++){
		    if (arr[i]==0){
		        flag=false;
		        System.out.print((char)i);
		    }
		}
		if (flag){
		    System.out.print(-1);
		}
		
	}
}
