import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int j=-1;
		int val=0;
		int arr[]=new int[n];
		for (int i=0;i<n;i++){
		    int num=sc.nextInt();
		    if (num==x){
		        if (val!=num){
		            val=num;
		            j=i;
		        }
		    }
		    arr[i]=num;
		}if (j==-1){
		    System.out.print(0);
		}else{
		int cnt=0;
		for (int i=j+1;i<n;i++){
		    if (arr[i]%x==0 && arr[i]>x){
		        cnt++;
		    }
		}
		System.out.print(cnt);
		}
	}
}
