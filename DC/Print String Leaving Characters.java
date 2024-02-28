import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		String s=new Scanner (System.in).next();
		int len=s.length()-1;
		int i=2;
		while(len>=0){
		    System.out.print(s.charAt(len));
		    len=len-i;
		    i++;
		}

	}
}
