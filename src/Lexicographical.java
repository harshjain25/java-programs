public class Lexicographical {
    public static void lexica(int initial,int end){
        if(initial>end){
            return;
        }
        System.out.println(initial);
        int i=0;
        if(initial==0){
            i=1;
        }
        while(i<10){
            lexica(initial*10+i,end);
            i++;
        }
    }
}
