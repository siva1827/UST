
public class Second_largest {

	public static void main(String[] args) {
		int arr[]={2,1,3,4,5,6,7,89,3,4};
        int max=0;
        int index=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        arr[index]=0;
        max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

	}

}
