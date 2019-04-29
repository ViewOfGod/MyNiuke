import java.util.ArrayList;

public class TestForNiuke12 {


    public static void main(String[] args) {
        int[] array = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        reOrderArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void reOrderArray(int[] array) {

//        ArrayList<Integer> oldList = new ArrayList<Integer>();
//        ArrayList<Integer> oppList = new ArrayList<Integer>();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                count++;
            }
        }
        int [] oldArray=new int[count];
        int [] oppArray=new int[array.length-count];

        int m=0,n=0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                oldArray[m]=array[i];
                m++;
            } else {
                oppArray[n]=array[i];
                n++;
            }
        }
        for (int i = 0; i < count; i++) {
            array[i] = oldArray[i];
        }
        for (int i = count, j = 0; i < array.length; i++, j++) {
            array[i] =oppArray[j];
        }


    }
}
