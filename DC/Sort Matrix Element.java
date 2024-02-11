import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[]=new int[(r*c)];
		int k=0;
		for (int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        arr[k]=sc.nextInt();
		        k++;
		    }
		}
		Arrays.sort(arr);
		k=0;
	    for (int i=0;i<r;i++){
	        for (int j=0;j<c;j++){
	            System.out.print(arr[k]+" ");
	            k++;
	        }
	        System.out.println();
	    }
		

	}
}
