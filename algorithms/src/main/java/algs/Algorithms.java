package algs;

public class Algorithms {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int[] mergeSortedArrays(int[] num1, int[] num2) {
        //index out of bounds check
        int firstNum2 = num2[0];
        if (num1.length == 1 && num1[0] == 0) {
            return num2;
        }

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] > firstNum2) {
                int temp = firstNum2;
                num2[0] = num1[i];
                num1[i] = temp;
            }
        }
        return num1;
    }
}