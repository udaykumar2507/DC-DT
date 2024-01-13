import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		char charr[][]=new char[r][c];
		for(int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        charr[i][j]=sc.next().charAt(0);
		    }
		}
		for (int i=0;i<r;i++){
		    for (int j=0;j<c;j++){
		        if(i%2==1){
		            System.out.print(charr[i][c-j-1]);
		        }else{
		            System.out.print(charr[i][j]);
		        }
		    }
		}
	}
}
