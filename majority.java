class majority{
	static int majo(int arr[],int len){
		//int len=arr.length;
		int max=0,index=-1;
		for(int i=0;i<len;i++){
			int c=0;
			for(int j=0;j<len;j++){
				if(arr[i]==arr[j]){
					c=c+1;
				}

			}
			if(c>max){
				max=c;
				index=i;
			}
		}
		return arr[index];
	}

	public static void main(String args[]){
		int arr[]={1, 2, 2, 3, 5, 5, 5};
		int len=arr.length;
		System.out.println(majo(arr,len));
	}
}
