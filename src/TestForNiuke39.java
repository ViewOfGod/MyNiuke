//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestForNiuke39 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], 2);
            } else {
                map.put(array[i], 1);
            }
        }
        int[] num=new int[2];
        int n=0;
        Iterator iter=map.entrySet().iterator();
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry) iter.next();
            int key = (int) entry.getKey();
            int val = (int) entry.getValue();
            if(val==1){
                num[n]=key;
                n++;
            }
        }
        num1[0]=num[0];
        num2[0]=num[1];

    }
}
