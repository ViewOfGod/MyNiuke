import java.util.ArrayList;

/**
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class TestForNiuke41 {
    public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        if (null == array || array.length==0||array.length == 1)
            return new ArrayList<>();
        if (array[array.length - 1] + array[array.length - 2] < sum)
            return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int j = array.length - 1;
        int i = 0;
        while (array[i] < sum / 2 && array[j] > sum / 2) {
            while (array[i] + array[j] < sum) {
                i++;
            }
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            while (array[i] + array[j] > sum) {
                j--;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int []array={};
        System.out.println(array.length);
        if(null==array)
            System.out.println("空");
//        ArrayList<Integer>list=FindNumbersWithSum(array,6);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
    }


}
