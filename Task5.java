import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 10 целых чисел в массив");
		int[] array = new int[10];
		for ( int i = 0; i < 10; i++) {
			array[i] = in.nextInt();
		}

		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if ( array[i] > array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for ( int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
}