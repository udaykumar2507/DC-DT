import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.next();
        int arr[]=new int [123];
        for (int i=0;i<s1.length();i++){
            arr[s1.charAt(i)]++;
        }
        for (int i=0;i<s2.length();i++){
            arr[s2.charAt(i)]++;
        }
        int flag=0;
        for (int i=65;i<91;i++){
            if (arr[i]!=1){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.print("no");
        }else{
            System.out.print("yes");
        }

	}
}
