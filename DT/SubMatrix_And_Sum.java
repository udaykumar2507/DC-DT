import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		for (int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int sum=0;
		if (x1>r-1 || x2>r-1 ||y1>c-1 || y2>c-1){
		    System.out.print(-1);
		}
		else{
		for (int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        if (i>=x1 && j>=y1 && j<=y2 && i<=x2 ){
		            System.out.print(arr[i][j]+" ");
		            sum+=arr[i][j];
		            if (j==y2){
		                System.out.println();
		            }
		        }
		    }
		    }
		    System.out.print(sum);
		}
    }
}
