import java.util.*;
class stockmax{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[]=new int[n];
		int profit=0;
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(int i=1;i<n;i++){
			if(arr[i]>arr[i-1]){
				profit=profit+arr[i]-arr[i-1];
			}
		}
		System.out.println(profit);
	}
}