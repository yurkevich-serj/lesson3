import java.util.Scanner; 

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите 10 целых чисел в массив");
		int[] array = new int[10];
		for ( int i = 0; i < 10; i++) {
			array[i] = in.nextInt();
		}
		for ( int i =0; i < 5; i++) {
			int temp;
			temp = array[i];
			array[i] = array[9-i];
			array[9-i] = temp;
		}
		for ( int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
	}
}