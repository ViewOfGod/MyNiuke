public class TestForNiuke11 {
    public static void main(String[] args) {
        System.out.println(2 ^ 3);
    }


    public double Power(double base, int exponent) {
        double resp = 1;
        if (exponent == 0) {
            return resp;
        }

        if (exponent < 0) {
            exponent = 0 - exponent;
            for (int i = 0; i < exponent; i++) {
                resp = resp * base;
            }
            resp=1/resp;
        }else {
            for (int i = 0; i < exponent; i++) {
                resp = resp * base;
            }
        }
        return resp;
    }
}
