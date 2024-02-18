import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for (int i=0;i<s.length();i++){
		    if (s.charAt(i)>='a' && s.charAt(i)<='j'){
		        System.out.print(s.charAt(i));
		    }else{
		        System.out.print("*");
		    }
		}
    }
}
