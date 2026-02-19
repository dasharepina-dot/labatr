import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество строк в массиве");
        int row = scan.nextInt();
        System.out.println("Введите количество столбцов в массиве");
        int col = scan.nextInt();
        int [][] array = new int[row][col];
        System.out.println("Введите элементы в массив");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("элемент [%d][%d] = ", i, j);
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Введённый массив (неотсортированный):");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        metOd(array);
        System.out.println("Массив (отсортированный по строкам):");
        for (int w = 0; w < row; w++) {
            for (int v = 0; v < col; v++) {
                System.out.print(array[w][v]+" ");
            }
            System.out.println();
        }
    }
    public static void metOd(int[][] array) {
        for (int i=0; i< array.length;i++) {
            heapSort(array[i]);
        }
    }
    public static void heapSort(int[] array) {
        int n = array.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heapify(array, i--, n);
        }
        while (n>0){
            array[n-1] = pop (array,n);
            n--;
        }
    }
    public  static int pop (int [] array,int size){
        if (size<=0) return -1;
        int top = array[0];
        array[0] = array[size-1];
        heapify (array,0,size-1);
        return top;
    }
    static void heapify(int[] array, int i, int size) {
        int left = LEFT(i);
        int right = RIGHT(i);
        int largest = i;
        if (left < size && array[left] < array[largest]) largest = left;
        if (right < size && array[right] < array[largest]) largest = right;
        if (largest != i) {
            swap(array, i, largest);
            heapify(array, largest, size);
        }
    }
    static int LEFT(int i){
        return 2*i+1;
    }
    static int RIGHT(int i){
        return 2*i+2;
    }
    static void swap(int[]array,int i, int j){
        int swap = array[i];
        array[i]=array[j];
        array[j]=swap;
    }
}
