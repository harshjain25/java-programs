import java.util.*;

public class arraysumpair {
            static int eval(int a, char op, int b)
            {
                if (op == '+') {
                    return a + b;
                }
                if (op == '-') {
                    return a - b;
                }
                if (op == '*') {
                    return a * b;
                }
                return Integer.MAX_VALUE;
            }

            // This function evaluates all possible values and
            // returns a list of evaluated values.
            static Vector<Integer> evaluateAll(String expr, int low, int high) {
                Vector<Integer> res = new Vector<Integer>();
                if (low == high) {
                    res.add(expr.charAt(low) - '0');
                    return res;
                }
                if (low == (high - 2)){
                    int num = eval(expr.charAt(low) - '0', expr.charAt(low + 1), expr.charAt(low + 2) - '0');

                    res.add(num);
                    return res;
                }
                for (int i = low + 1; i <= high; i += 2) {
                    Vector<Integer> l = evaluateAll(expr, low, i - 1);
                    Vector<Integer> r = evaluateAll(expr, i + 1, high);
                    for (int s1 = 0; s1 < l.size(); s1++) {
                        for (int s2 = 0; s2 < r.size(); s2++) {
                            int val = eval(l.get(s1), expr.charAt(i), r.get(s2));
                            res.add(val);
                        }
                    }
                }
                Collections.sort(res);
                return res;
            }

            public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                String expr = sc.next();
                int len = expr.length();
                Vector<Integer> ans = evaluateAll(expr, 0, len - 1);

                for (int i = 0; i < ans.size()-1; i++)
                {
                    System.out.print(ans.get(i)+" ");
                }
                System.out.print(ans.lastElement());
            }
        }


