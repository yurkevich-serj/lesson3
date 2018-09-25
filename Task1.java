import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 10 целых чисел в массив");
		int[] array = new int[10];
		int min = array[0];
		int max = array[0];
		int indexMin = 0;
		int indexMax = 0;
		for ( int i = 0; i < 10; i++) {
			array[i] = in.nextInt();
		}
		
		for (int i = 1; i < 10; i++) {
			if( array[i] > max) {
				max = array[i];
				indexMax = i;
			}
		}
		for (int i = 1; i < 10; i++) {
			if( array[i] < min) {
				min = array[i];
				indexMin = i;
			}
		}
		array[indexMin] = 0;
		array[indexMax] = 99;
		for ( int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
}