import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        Long arr[]=new Long[s.length];
        for (int i=0;i<s.length;i++){
            arr[i]=Long.parseLong(s[i]);
        }
        long a=0;
        long b=0;
        long min=Long.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                long sum=arr[i]+arr[j];
                if (sum<min && sum>0){
                    min=sum;
                    a=arr[i];
                    b=arr[j];
                }
            }
        }
        if (min==Long.MAX_VALUE){
            System.out.print(-1);
        }else {
            System.out.print(a+" "+b);
        }
	}
}