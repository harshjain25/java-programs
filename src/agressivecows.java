import java.util.Arrays;
import java.util.Scanner;

public class agressivecows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int nos = sc.nextInt();
            int noc = sc.nextInt();
            int[] stalls = new int[nos];
            for (int i = 0; i < stalls.length; i++) {
                stalls[i]=sc.nextInt();
            }
            Arrays.sort(stalls);
            System.out.println(largestMinimumDistance(stalls,noc));
        }
    }

    public static int largestMinimumDistance(int[] stalls, int noc) {
        int lo = 0;
        int ans = 0;
        int hi = stalls[stalls.length - 1] - stalls[0];
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isItPossible(stalls, mid, noc) == true) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isItPossible(int[] stalls, int mid, int noc) {
        int cow = 1;
        int pos = stalls[0];
        int i = 1;
        while (i < stalls.length)
        {
            if(stalls[i]-pos>=mid)
            {
            cow++;
            pos = stalls[i];
            }
        if (cow >= noc)
        {
            return true;
        }
        i++;
    }
    return false;
}


}
