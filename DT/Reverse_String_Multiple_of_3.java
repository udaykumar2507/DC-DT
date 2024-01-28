import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		String s1="";
		for (int i=s.length()-1;i>=0;i--){
		    s1+=s.charAt(i);
		}
		int j=2;
		for (int i=0;i<s1.length();i++){
		    if (i==j){
		        System.out.print(s1.charAt(i));
		        j+=3;
		    }
		}

	}
}
