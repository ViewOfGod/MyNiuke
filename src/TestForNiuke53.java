/**
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class TestForNiuke53 {
    public static boolean isNumeric(char[] str) {
        if(null==str||str.length==0)
            return false;
        if(str.length==1&&(str[0]>57||str[0]<48))
            return false;
        if (!(str[0] == 43 || str[0] == 45 || (str[0] >= 48 && str[0] <= 57)))
            return false;
        int doc = 0;
        int enm=0;
        for (int i = 1; i < str.length; i++) {
            System.out.println(str[i]);
            if(str[i] != '.'&&str[i] != 'e' && str[i] != 'E'&&str[i]!='-'&&str[i]!='+'&&(!(str[i] <= 57 && str[i] >= 48)))
                return false;
            if (str[i] == '.') {
                doc++;
                if (i >= str.length - 1) {
                    return false;
                }else {
                    i++;
                    continue;
                }
            }
            if (str[i] == 'e' || str[i] == 'E') {
                enm++;
                if (i >= str.length - 1) {
                    return false;
                } else if (!((str[i + 1] <= 57 && str[i + 1] >= 48) || str[i + 1] == '-' || str[i + 1] == '+')) {
                    return false;
                }else {
                    i++;
                    continue;
                }
            }
            if (str[i] > 57 || str[i] < 48) {
                return false;
            }

        }
        if (doc > 1||enm>1)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(5e2);
//        char a = '+', b = '-', c = '0', d = '9';
//        int n1 = a;
//        int n2 = b;
//        int n3 = c;
//        int n4 = d;
//
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);
//        System.out.println(n4);
        char[] chars = {'1', '.', '1','e','+','6'};
        boolean b = isNumeric(chars);
        System.out.println(b);

    }
}
