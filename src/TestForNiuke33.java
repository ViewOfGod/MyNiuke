import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，
 * 全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.
 */
public class TestForNiuke33 {
    public static int FirstNotRepeatingChar(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                count = 1;
            } else {
                count = map.get(str.charAt(i));
                count++;
            }
            System.out.println(str.charAt(i) + "  " + i);
            map.put(str.charAt(i), count);
        }

        Iterator iter = map.entrySet().iterator();
        int num = -1;
        int numb = str.length();

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            char key = (char) entry.getKey();
            int val = (int) entry.getValue();
            System.out.println("key: " + key + "  val: " + val);
            if (val == 1) {
                for (int i = 0; i < str.length(); i++) {
                    if (key == str.charAt(i)) {
                        System.out.println(i);

                        if (i < numb) {
                            numb = i;
                        }
                    }
                }
                num = numb;

            }
        }

        return num;
    }

    public static void main(String[] args) {
        String s = "NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp";
        int count = FirstNotRepeatingChar(s);
        System.out.println(count);
    }

}
