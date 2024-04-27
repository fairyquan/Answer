package dp;

import java.util.Arrays;

public class MathUtils {

    /**
     * 快速幂
     *
     * @param a 底数(a!=0)
     * @param n 指数(n>=0)
     * @return a^n
     */
    public static long fastPow(int a, int n) {
        long ans = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= a;
            }
            a *= a;
            n >>= 1;
        }
        return ans;
    }

    /**
     * 矩阵快速幂
     *
     * @param A 方阵
     * @param n 指数(n>=0)
     * @return A^n
     */

    public static long[][] matrixFastPow(long[][] A, int n) {
        long[][] res = new long[A.length][A.length];
        for (int i = 0; i < A.length; i++) {//构造单位阵
            res[i][i] = 1;
        }
        while (n > 0) {
            if ((n & 1) == 1) {
                res = matrixMultiply(res, A);
            }
            n >>= 1;
            A = matrixMultiply(A, A);
        }
        return res;
    }

    /**
     * n阶矩阵相乘
     *
     * @param A n阶矩阵
     * @param B n阶矩阵
     * @return A*B
     */
    public static long[][] matrixMultiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        long[][] A={{1,1},{1,0}};
        System.out.println(Arrays.deepToString(matrixFastPow(A,8)));
    }

}
