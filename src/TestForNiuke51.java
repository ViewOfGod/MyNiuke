/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class TestForNiuke51 {

    public int[] multiply(int[] A) {
        if (null == A || A.length == 0)
            return null;
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = 1;
            for (int j = 0; j < i; j++) {
                B[i] = B[i] * A[j];
            }
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; i < A.length; j++) {
                B[i] = B[i] * A[j];
            }

        }
        return B;
    }

}