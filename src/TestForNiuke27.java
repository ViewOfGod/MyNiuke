import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class TestForNiuke27 {
    public static int MoreThanHalfNum_Solution(int[] array) {
        int num = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])) {
                num = 1;
            } else {
                num = map.get(array[i]);
                num++;
            }
            map.put(array[i], num);
        }

        Iterator iter = map.entrySet().iterator();
        while ((iter.hasNext())) {
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int)entry.getKey();
            int val = (int)entry.getValue();
            if(val>array.length/2){
                return key;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int [] array={1,2,3,2,2,2,5,4,2};
        int a=MoreThanHalfNum_Solution(array);
        System.out.println(a);
    }
}
