
import java.util.*;


/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class TN13_SX_CV {
    static class TwoNumber {
        int key, value;

        public TwoNumber(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            TwoNumber[] a = new TwoNumber[n+5];
            for (int i = 1; i <= n; i++) {
                a[i] = new TwoNumber(sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(a, 1, n + 1, new Comparator<TwoNumber>() {
                @Override
                public int compare(TwoNumber o1, TwoNumber o2) {
                    if (o1.getValue() == o2.getValue()) {
                        return o2.getKey() - o1.getKey();
                    }
                    return o1.getValue() - o2.getValue();
                }
            });
            int res = 0;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (res < a[i].getKey()) {
                    res = a[i].getValue();
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
