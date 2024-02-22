import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		char arr[]=sc.next().toCharArray();
		Arrays.sort(arr);
		if ((arr[1]-arr[0])==arr[2]-arr[1]){
		    System.out.print(arr[arr.length-1]);
		}else{
		    System.out.print(arr[0]);
		}
    }
}
	
