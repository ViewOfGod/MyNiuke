/**
 * 任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
 */
public class TestForNiuke30 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int num = 0;
        for (int i = 1; i <= n; i++) {
            num = num + num(i);
        }
        return num;
    }

    //对于某一个数，包含1的个数
    public int num(int a) {
        int num = 0;
        int m = a;
        while (m > 0) {
            if (m % 10 == 1)
                num++;
            m = m / 10;
        }
        return num;
    }
}
