//原来把句子单词的顺序翻转
public class TestForNiuke43 {

    public static String ReverseSentence(String str) {
        if (null == str)
            return null;
        if (str.length() == 0)
            return new String();
        if (str.length() == 1)
            return str;
        String[] strings = str.split(" ");
        if(strings.length==0)
            return str;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = strings.length - 1; i >= 0; i--) {
            stringBuffer.append(strings[i]);
            if (i != 0) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "    ";
        String resp = ReverseSentence(s);
        System.out.println(resp);
    }
}
