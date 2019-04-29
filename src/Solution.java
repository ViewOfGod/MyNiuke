import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        ArrayList<Integer>list=listn();
        if(null!=list){
            System.out.println(list);
        }


//        int[][] array = {};//{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}
//        boolean b = Find2(16, array);
//        System.out.println(b);

        String ss = "hello123world456ni hao ya987";

//        String s1=ss.replace(" ","20%");
//        String s2=ss.replaceAll("[0-9]","P");
//        System.out.println(s2);

//        Pattern p = Pattern.compile("[0-9]");//先编译
//        Matcher m = p.matcher(ss);
//        String snew = m.replaceAll("P");
//        System.out.println(snew);
//        StringBuffer s = new StringBuffer();
//        s.append("hello world");
//        String ss= replaceSpace(s);
//        System.out.println(ss);
    }
    //{67,0,24,58}
    public static ArrayList<Integer> listn() {
        ListNode listNode = null;

        ListNode listNode1 = new ListNode(67);
        ListNode listNode2 = new ListNode(0);
        ListNode listNode3 = new ListNode(24);
        ListNode listNode4 = new ListNode(58);
//        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
//        listNode4.next = listNode5;
//        if (null == listNode) {
//           return new ArrayList();
//        }
        ListNode li = listNode1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (null != li.next) {
            arrayList.add(li.val);
            li = li.next;
        }
        arrayList.add(li.val);
        ArrayList<Integer> arrayList2 = new ArrayList<>(arrayList.size());
        arrayList2.addAll(arrayList);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            arrayList2.set(arrayList.size() - 1-i, arrayList.get(i));
        }
        return arrayList2;
    }


    public static String replaceSpace(StringBuffer str) {
        StringBuffer sreponse = new StringBuffer();
        String s = str.toString();
        String[] ss = s.split("\\ ");
        for (int i = 0; i < ss.length - 1; i++) {
            sreponse.append(ss[i]);
            sreponse.append("%20");
        }
        sreponse.append(ss[ss.length - 1]);
        return sreponse.toString();
    }

    public static String rep(StringBuffer str) {


        StringBuffer snew = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                snew.append("%20");
            } else {
                snew.append(str.charAt(i));
            }
        }
        return snew.toString();
    }

    //最蠢的双重for循环遍历整个二维诶数组
    public boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (target == array[i][j])
                    return true;
            }
        }
        return false;
    }

    public static boolean Find2(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0)
            return false;
        int i = array.length - 1, j = array[0].length - 1;
        if (array[i][j] < target)
            return false;
        i = 0;
        j = 0;
        while (array[i][j] < target && i < array.length && j < array[0].length) {
            i++;
            j++;
        }
        if (i == array.length)
            i--;
        if (j == array[0].length)
            j--;
        if (array[i][j] == target)
            return true;
        for (int m = 0; m < i; m++) {
            for (int n = j; n < array[0].length; n++) {
                if (array[m][n] == target)
                    return true;
            }
        }
        for (int m = i; m < array.length; m++) {
            for (int n = 0; n < j; n++) {
                if (array[m][n] == target)
                    return true;
            }
        }
        return false;
    }


    int[] findb(int[][] array, int target, int[] a) {
        int i = a[0];
        int j = a[1];
        while (array[i][j] < target && i < array.length && j < array[0].length) {
            i++;
            j++;
        }
        if (array.length < array[0].length) {
            i--;
            while (array[i][j] < target && j < array[0].length) {
                j++;
            }
        }
        if (array.length > array[0].length) {
            j--;
            while (array[i][j] < target && j < array.length) {
                i++;
            }
        }
        a[0] = i;
        a[1] = j;
        return a;
    }

}