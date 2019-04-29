public class TestForNiuke6 {
    public static void main(String[] args) {

    }


    public int minNumberInRotateArray(int[] array) {

        if(array.length==0)
            return 0;
        int i=0;
        while (array[i]<=array[i+1]){
            i++;
        }
        return array[i+1];
    }
}
