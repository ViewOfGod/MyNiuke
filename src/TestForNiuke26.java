import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 */
public class TestForNiuke26 {

    public static void main(String[] args) {
        String str = "abc";
//        System.out.println("字符串长度是："+str.length()+"========================");
//        System.out.println(str.charAt(0));
        ArrayList<String> strings = Permutation(str);



        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            System.out.println(s);
        }
    }


    public static ArrayList<String> Permutation(String str) {
        if (null == str) {
            return null;
        }
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<StringBuffer> stringBuffers = new ArrayList<>();
        StringBuffer s = new StringBuffer();

        if (str.length() == 1) {
            stringBuffers.add(s.append(str.charAt(0)));
            stringArrayList.add(s.toString());
            return stringArrayList;
        }

        for (int i = 0; i < str.length(); i++) {
            stringBuffers = bufferArrayList(stringBuffers, str.charAt(i));
        }
        for (int i = 0; i < stringBuffers.size(); i++) {
            String si = stringBuffers.get(i).toString();
            stringArrayList.add(si);
        }
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(stringArrayList);									//将list集合中的所有元素添加到lhs
        stringArrayList.clear();										//清空原集合
        stringArrayList.addAll(lhs);
        return stringArrayList;
    }

    public static ArrayList<StringBuffer> bufferArrayList(ArrayList<StringBuffer> s, char c) {
        ArrayList<StringBuffer> respList = new ArrayList<>();

        if (null == s || s.size() == 0) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(c);
            respList.add(stringBuffer);
            return respList;
        }
        for (int i = 0; i < s.size(); i++) {
            ArrayList<StringBuffer> list = stringBuffers(s.get(i), c);
            respList.addAll(list);
        }
        return respList;
    }

    //对某一个String，返回其能生成的所有结果
    public static ArrayList<StringBuffer> stringBuffers(StringBuffer s, char c) {
        ArrayList<StringBuffer> sb = new ArrayList<>();
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(s);
        stringBuffer.append(c);
        sb.add(stringBuffer);
        for (int i = 0; i < s.length(); i++) {
            StringBuffer s1 = new StringBuffer();
            for (int j = 0; j < i; j++) {
                s1.append(s.charAt(j));
            }
            s1.append(c);
            for (int j = i; j < s.length(); j++) {
                s1.append(s.charAt(j));
            }
            sb.add(s1);
        }
        return sb;
    }


}
