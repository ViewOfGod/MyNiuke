import java.util.ArrayList;

//有多少种连续的正数序列的和为100(至少包括两个数)
public class TestForNiuke40 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        int i = 1;
        int num = 0;
        ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
        for (int j = 1; j < sum/2+3; j++) {
            if (num == sum){
                if(j-i<1)
                    return new ArrayList<>();
                ArrayList<Integer>list=new ArrayList<>();
                for(int k=i;k<j;k++){
                    list.add(k);
                }
                lists.add(list);
            }
            num = num + j;

            while (num > sum) {
                num = num - i;
                i++;
            }
        }
        return lists;
    }


    public static void main(String[] args) {
        int s=3;
        ArrayList<ArrayList<Integer>>l=FindContinuousSequence(s);
        for(int i=0;i<l.size();i++){
            System.out.println("第"+(i+1)+"个： ");

            for(int j=0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+",");
            }
            System.out.println();
        }
    }
}
