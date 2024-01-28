import java.util.*;
public class Hello {
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char c=sc.nextLine().charAt(0);
		int c1=0;
		int c2=0;
		for (int i=0;i<s1.length();i++){
		    if (s1.charAt(i)==c){
		        c1++;
		    }
		}
		for (int i=0;i<s2.length();i++){
		    if (s2.charAt(i)==c){
		        c2++;
		    }
		}
		if (c1>c2){
		    System.out.print(s1);
		}else if (c2>c1){
		    System.out.print(s2);
		}else if (c1==c2){
		   System.out.print(s1);
		}
	}
}
