/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class TestForNiuke49 {
    public int StrToInt(String str) {
        if(null==str||str.length()==0)
            return 0;
        int num = 0;//返回值
        boolean flag = true;//表示负数,不带默认为正

        if (str.charAt(0) == '+') {
            flag = true;
        } else if (str.charAt(0) == '-') {
            flag = false;
        } else if (str.charAt(0) > 48 && str.charAt(0) < 57) {
            num = str.charAt(0) - 48;
        } else {
            return 0;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > 48 && str.charAt(i) < 57) {
                num = num * 10 + (str.charAt(i) - 48);
            } else {
                return 0;
            }
        }
        if(!flag)
            num=0-num;
        return num;
    }

    public static void main(String[] args) {
        String s = "+a01239";//0-48,1-49,9-57
        if (s.charAt(0) == '+')
            System.out.println("+");
        if (s.charAt(1) < 48 || s.charAt(1) > 57)
            System.out.println("false");
        char c1 = s.charAt(0);
        System.out.println(c1);
    }
}
