public class productofarray238 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,4};

    }
    public static int[] prod(int[] arr){
        int[] left=new int[arr.length];
        left[0]=1;
        for(int i=0;i<left.length;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        int[] right=new int[arr.length];
        int n=arr.length;
        right[n-1]=1;
        for(int i=n-2 ;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<right.length;i++){
            left[i]=left[i]*right[i];
        }
        return left;
    }
}
