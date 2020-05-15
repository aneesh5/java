import java.util.*;
class shopping{
	public static void main(String args[]){
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int cost=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		int toys=0;
		for(int i=0;i<arr.length;i++){
			if(cost>arr[i]){
				cost=cost-arr[i];
				toys++;
			}
		}
		System.out.println(toys);
	}
}