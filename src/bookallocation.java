//import java.util.Scanner;
//
//public class bookallocation {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int page [] ={10,20,30,40};
//        int nos=2;
//    }
//    public static int minpage(int [] page,int nos){
//        int hi=0;
//        for(int i=0;i<page.length;i++){
//            hi+=page[i];
//        }
//        int lo=0;
//        int ans=0;
//        while(lo<=hi){
//            int mid=(lo+hi)/2;
//            if (isItPossible(page,mid,nos)==true){
//                ans=mid;
//                hi=mid-1;
//                else{
//                    lo=mid+1;
//                }
//            }
//            return ans;
//        }
//    }
//
//    private static boolean isItPossible(int[] page, int mid, int nos) {
//        int s=0;
//        int reapapge=0;
//        int i=0;
//        while(i<page.length){
//            if(reapapge+page[i]<=mid){
//                reapapge
//            }
//        }
//    }
//}
