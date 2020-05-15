import java.util.Arrays;
class max_guests{
	static int find(int arr[],int exit[],int n){
		int i=0,j=0,index=-1,g=0,max=0;
		Arrays.sort(arr);
		Arrays.sort(exit);
		while(i<n){
			if(arr[i]>=exit[j]){
				g=g-1;
				j++;
			}
			else{
				g=g+1;
				i++;
			}
			if(g>max){
				max=g;
				index=i-1;
			}
		}
		return arr[index];
	}

	public static void main(String args[]){
	int arrl[] = {13, 28, 29, 14, 40, 17, 3 }; 
        int exit[] = {107, 95, 111, 105, 70, 127, 74}; 
        int n = arrl.length; 
        System.out.println(find(arrl, exit, n)); 
	}
}
