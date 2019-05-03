import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class TestForNiuke28 {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (null == input || input.length < k || k <= 0)
            return new ArrayList<>();
        ArrayList<Integer> resp = new ArrayList<>();
        for (int a : input) {
            if (resp.size() < k) {
                resp.add(a);
            } else {
                if (a < resp.get(k - 1)) {
                    resp.remove(k - 1);
                    resp.add(a);
                }
            }
            resp = sort(resp);
        }
        return resp;

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(list.size() - 1) < list.get(i))) {
                newList.add(list.get(list.size() - 1));
                break;
            }
            count++;
            newList.add(list.get(i));
        }
        for (int j = count; j < list.size() - 1; j++) {
            newList.add(list.get(j));
        }
        return newList;
    }

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 6, 2, 7, 3, 8};
        ArrayList<Integer> list = GetLeastNumbers_Solution(array, 4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
