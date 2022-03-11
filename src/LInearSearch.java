public class LInearSearch {
    public int search(int[] arr,int n,int x){
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        LInearSearch ls=new LInearSearch();
        System.out.println(ls.search(arr,arr.length,5));
    }
}
