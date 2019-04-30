import java.util.HashMap;
import java.util.Map;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */

public class TestForNiuke20 {

    public static void main(String[] args) {
        int[] in = {1, 2, 3, 4, 5};
        int[] out = {4, 5, 1, 3, 2};
        boolean resp = IsPopOrder(in, out);
        System.out.println(resp);
    }

    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        if (null == pushA || null == popA)
            return false;
        if (pushA.length != popA.length)
            return false;

        //思路：首先，我要获取其出栈顺序，然后判断这个顺序是否符合就OK
        Map<Integer, Integer> mapPush = new HashMap<>();
        for (int i = 1; i <= pushA.length; i++) {//元素数
            mapPush.put(pushA[i - 1], i);
        }
        //出栈顺序
        int[] outxu = new int[popA.length];
        for (int i = 0; i < popA.length; i++) {
            outxu[i] = mapPush.get(popA[i]);
            System.out.println(outxu[i]);
        }
        System.out.println("--------------------------------------");
        //校验该顺序是否为出栈顺序
        for (int i = 0; i < popA.length - 1; i++) {
            int count = 0;
            for (int m = i; m < popA.length; m++) {
                if (outxu[m] < outxu[i])
                    count++;
            }
            System.out.println(count);
            int[] a = new int[count];

            System.out.println("当前值"+i+"======================================");
            int x = 0;
            for (int j = i; j < popA.length; j++) {
                if (outxu[j] < outxu[i])
                    a[x++] = j;
            }
            for (int z = 0; z < count; z++) {
                System.out.println(a[z]);
            }
            System.out.println("===========================================");
            int k = a.length - 1;
            while (k > 0) {
                if (a[k] < a[k - 1])
                    return false;
                k--;
            }
        }
        return true;
    }

}
