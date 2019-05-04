/**
 * 。对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class TestForNiuke42 {
    public static String LeftRotateString(String str, int n) {
        if(null==str)
            return null;
        if(str.length()==0)
            return new String();
        char[] chars=new char[str.length()];
        char[]sub=new char[n];
        for(int i=0;i<str.length();i++){
            chars[i]=str.charAt(i);
        }
        for(int i=0;i<n;i++){
            sub[i]=str.charAt(i);
        }
        for(int i=0;i<str.length()-n;i++){
            chars[i]=chars[i+n];
        }
        for(int i=str.length()-n,j=0;i<str.length();i++,j++){
            chars[i]=sub[j];
        }
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<str.length();i++){
            stringBuffer.append(chars[i]);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s="abcdefg";
        String s1=LeftRotateString(s,2);
        System.out.println(s1);

    }


}
