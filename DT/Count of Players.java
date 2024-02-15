import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner cs=new Scanner (System.in);
		int n=sc.nextInt();
		Stack <String> stack=new Stack<>();
		while(n-- >0){
		    String country=sc.next();
		    if (stack.isEmpty()||stack.peek().compareTo(country)!=0){
		        stk.push(country);
		    }else{
		        stk.pop();
		    }
		}
		System.out.print(stack.size());
	}
}
