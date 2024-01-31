import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int sum=0;
		long prod=1;
		for (int i=0;i<n;i++){
		    sum=0;
		    prod=1;
		    for (int j=1;j<=n1;j++){
		        if (i%2==0){
		            if (j==n1){
		                System.out.print(j);
		                sum+=j;
		            }else{
		            System.out.print(j+"+");
		            sum+=j;
		            }
		        }else{
		            if (j==n1){
		             System.out.print(j);
		             prod*=j;
		            }else{
		            System.out.print(j+"*");
		            prod*=j;
		            }
		        }
		    }
		    if(i%2==0){
		        System.out.print("="+sum);
		    }else{
		        System.out.print("="+prod);
		    }
		    n1--;
		   System.out.println(); 
    }
    }
}
