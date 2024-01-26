import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		HashMap<Integer,Integer>mpp=new HashMap<>();
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    mpp.put(i,fac_count(arr[i]));
		}
		mpp.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry->System.out.print(arr[entry.getKey()]+" "));
		System.out.print("Hello");
	}
	private static int fac_count(int n){
	    int cnt=0;
	    for (int i=1;i<=n;i++){
	        if (n%i==0){
	            cnt++;
	        }
	    }
	    return cnt;
	}
}
