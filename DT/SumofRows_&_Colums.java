import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum1=0;
        int sum2=0;
        int x=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i==x||i+1==x){
                   sum1+=mat[x-1][j]; 
                }
                if (j+1==x||j==x){
                    sum2+=mat[i][x-1];
                }
            }
        }
        System.out.print(sum1+" "+sum2);
	}
}
