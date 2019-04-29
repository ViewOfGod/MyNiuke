import java.util.ArrayList;

public class TestForNiuke18 {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        ArrayList<Integer> list=printMatrix(input);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }


    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        if (null == matrix)
            return new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        int hnum = matrix.length;//行数
        int lnum = matrix[0].length;//列数
        int num;//外围圈数
        if (hnum < lnum) {
            num = hnum / 2;
        } else {
            num = lnum / 2;
        }
        for (int i = 0; i < num; i++) {//打印外围
            //打印第i圈
            for (int j = i; j < matrix[0].length - i; j++) {
                list.add(matrix[i][j]);
            }
            for (int j = i + 1; j < matrix.length - i; j++) {
                list.add(matrix[j][matrix[0].length - 1 - i]);
            }
            for (int j = matrix[0].length - i - 2; j > i - 1; j--) {
                list.add(matrix[matrix.length - 1 - i][j]);
            }
            for (int j = matrix.length - i - 2; j > i; j--) {
                list.add(matrix[j][i]);
            }
        }
        boolean b1 = (matrix.length & 1) == 1;//行数为奇数
        boolean b2 = (matrix[0].length & 1) == 1;//列数为奇数
        //行少，行数为奇，剩一行
        if ((hnum <= lnum) && (b1)) {
            for (int i = num; i < lnum - num; i++) {
                list.add(matrix[num][i]);
            }
        }
        //列少，列数为奇，剩一列
        if ((hnum > lnum) && (b2)) {
            for (int i = num; i < hnum - num; i++) {
                list.add(matrix[i][num]);
            }
        }

        return list;
    }

}
