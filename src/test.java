import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int [] A = {1,2,3};
        int [] B = {2,3,4,5};
        int [] C = {1,2,3,4};
        int [] D = {1,2,3,4,5,6};

        int[] resultAB = sumArrays1(A, B);
        int[] resultCD = sumArrays2(C, D);
        int[] result = Z(resultAB, resultCD);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sumArrays1(int[] A, int[] B) {
        int[] result = new int[A.length * B.length];
        int index = 0;
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j < B.length; j++) {
                result[index] = A[i] + B[j];
                index++;
            }
        }
        return result;
    }
    public static int[] sumArrays2(int[] С, int[] В) {
        int[] result = new int[С.length * В.length];
        int index = 0;
        for (int i = 0; i <С.length ; i++) {
            for (int j = 0; j < В.length; j++) {
                result[index] = С[i] + В[j];
                index++;
            }
        }
        return result;
    }
    public static int[] Z(int[] resultAB, int[] resultCD) {
        int[] result = new int[resultAB.length * resultCD.length];
        int index = 0;
        for (int i = 0; i <resultAB.length ; i++) {
            for (int j = 0; j < resultCD.length; j++) {
                result[index] = resultAB[i] / resultCD[j];
                index++;
            }
        }
        return result;
    }
}



