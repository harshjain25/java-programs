import java.util.Arrays;
import java.util.Scanner;

class TimeInterval{
    int start;
    int end;
    public TimeInterval(int start,int end){
        this.start=start;
        this.end=end;
    }
    public static boolean canAttendMeeting(TimeInterval[] arr){
        int start[]=new int[arr.length];
        int end[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            start[i]=arr[i].start;
            end[i]=arr[i].end;}
            Arrays.sort(start);
            Arrays.sort(end);
            for (int i = 0; i < start.length; i++) {
                if(start[i+1] >=end[i]){
                    return true;
                }
            }
            return false;
        }
    }

public class ABDemo2 {
    public static void main(String[] args) {
        TimeInterval arr[]=new TimeInterval[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new TimeInterval(sc.nextInt(),sc.nextInt());
        }
        System.out.println(TimeInterval.canAttendMeeting(arr));
    }
}
