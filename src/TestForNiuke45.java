import java.util.ArrayList;

/**
 * 首先,让n个小朋友（编号从0—n-1）围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
 * 每次喊到m-1的那个小朋友可以在礼品箱中任意的挑选礼物,并且不再回到圈中,
 * 从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友
 * 问：最后一个小朋友的编号
 */

public class TestForNiuke45 {
    public static int LastRemaining_Solution(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        while (list.size() >=m) {


        }
        while (list.size()!=1){
            list.remove((m%list.size())-1);
        }
        return 0;
    }

    public static void main(String[] args) {
        LastRemaining_Solution(10, 3);
    }
}
