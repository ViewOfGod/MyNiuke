/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class TestForNiuke52 {

    public static boolean match(char[] str, char[] pattern) {
        if (null == str) {
            if (pattern.length != 0 && pattern[pattern.length - 1] != '*')
                return false;
        }

        if (str.length == 0) {
            if (pattern.length != 0 && pattern[pattern.length - 1] != '*')
                return false;
        }
        if(pattern[0]=='*')
            return false;
        int j = 0;
        int count = 0;
        int num=0;
        for (int i = 0; i < str.length; i++) {
            if (j > pattern.length - 1)
                return false;
            if (str[i] != pattern[j]) {
                if (pattern[j] != '.') {
                    if (!((pattern.length - 1) > (j + 2) && pattern[j + 1] == '*' && pattern[j + 2] == str[i])) {
                        if (pattern[j] == '*' && (str[i - 1] == str[i] || pattern[j - 1] == '.')) {
                            j--;
                            count++;
                        } else {
                            count = 0;
                        }
                    } else {
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            } else {
                count = 0;
            }

            j++;
            if (count > 0) {
                while (j<pattern.length&&pattern[j]==str[i]){
                    j++;
                    num++;
                }
            }
            if (i == str.length - 1) {
                if (pattern.length - j > 2) {
                    return false;
                } else if (pattern.length - j == 2 && pattern[pattern.length - 1] != '*') {
                    return false;
                } else if (pattern.length - j == 1 && pattern[pattern.length - 1] != '*') {
                    return false;
                }

            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[] test1 = {'a', 'a', 'a'};
        char[] test2 = {'a', '*', 'a'};
        boolean b = match(test1, test2);
        System.out.println(b);


    }
}
