import java.util.HashMap;
import java.util.Map;

public class TestForNiuke44 {
    //大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13, 随机从一副牌中抽出5张，如果牌能组成顺子就输出true，否则就输出false
    public boolean isContinuous(int[] numbers) {
        if(numbers.length!=5)
            return false;
        int min = 13;
        int max = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0)
                count++;
            if (numbers[i] > 0) {
                if (numbers[i] < min)
                    min = numbers[i];
                if (numbers[i] > max)
                    max = numbers[i];
            }
            if (numbers[i] != 0 && map.containsKey(numbers[i])) {
                return false;
            }else {
                map.put(numbers[i],1);
            }
        }
        if ((max - min) < 5) {
            return true;
        } else {
            return false;
        }
    }
}
