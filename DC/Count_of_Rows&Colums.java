import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int sum1=0;
		int sum2=0;
		int cnt=0;
		int arr[][]=new int[n][n];
		for (int i=0;i<n;i++){
		    for (int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		for (int i=0;i<n;i++){
		    for (int j=0;j<n;j++){
		        sum1+=arr[i][j];
		        sum2+=arr[j][i];
		    }
		    if (sum1==sum2){
		        cnt++;
		    }
		    sum1=0;
		    sum2=0;
		}
		System.out.print(cnt);

	}
}
