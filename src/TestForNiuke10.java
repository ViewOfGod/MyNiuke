public class TestForNiuke10 {
    public static void main(String[] args) {
//        int a=-2;
//        int b=-1;
//        int c=a^b;
//        System.out.println(c);
//        System.out.println((-3)&(1));
        int num = NumberOf1(-11);
        System.out.println(num);
    }

    public static int NumberOf1(int n) {


//        int resp = 0;
//        if (n >= 0) {
//
//            while (n > 0) {
//                if (n % 2 == 1) {
//                    resp = resp + 1;
//                }
//                n = n >> 1;
//            }
//            return resp;
//        } else {
        int resp = 0;
            while (n !=0) {
                if ((n&(1))== 1) {
                    resp = resp + 1;
                }
                n = n >>> 1;
            }
            return resp;
//        }
    }
}
