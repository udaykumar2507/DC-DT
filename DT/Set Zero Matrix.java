import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		int[] row=new int[r];
		int[] col=new int[c];
		for(int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        mat[i][j]=sc.nextInt();
		        if(mat[i][j]==0){
		            row[i]=1;
		            col[j]=1;
		        }
		    }
		}
		for (int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        if (row[i]==1|| col[j]==1){
		            System.out.print(0+" ");
		        }else{
		            System.out.print(mat[i][j]+" ");
		        }
		    }
		    System.out.println();
		}
	}
}
