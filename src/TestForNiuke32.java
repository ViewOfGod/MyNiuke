public class TestForNiuke32 {
    public static int GetUglyNumber_Solution(int index) {
        int count=0;
        int num=1;
        while (count<index){
            if(chou(num++)){
                count++;
            }
        }
        return num-1;
    }

    public static boolean chou(int index) {
        float f = index;
        while (f / 2 == Math.ceil(f / 2)) {
            f = f / 2;
        }
        while (f / 5 == Math.ceil(f / 5)) {
            f = f / 5;
        }
        while (f / 3 == Math.ceil(f / 3)) {
            f = f / 3;
        }
        if (f == 1) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n=GetUglyNumber_Solution(21);
        System.out.println(n);
    }

}
