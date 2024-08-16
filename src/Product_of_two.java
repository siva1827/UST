
public class Product_of_two {

	public static void main(String[] args) {
		int arr1[][]={{2,3},{1,2}};
        int arr2[][]={{2,4},{2,1}};
        int res[][]=new int[2][2];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                res[i][j]=0;
                for(int k=0;k<2;k++){
                    res[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }

	}

}
