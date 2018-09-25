import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int number = in.nextInt();
		
		int remainder = number;
		int tens = 1;
		int countDigits = 1;
		boolean checkIncrease = true;
		
		if (number < 10) {
			System.out.println("Введите целое двузначное число");
		}
		
		while (remainder >= 10) {
			remainder = remainder/10;
			countDigits++;
			tens *=10;
		}
		int[] array = new int[countDigits];
		for ( int i = 0; i < countDigits; i++) {
			array[i] = number/tens;
			number -= tens*array[i];
			tens /= 10;
			if (countDigits - i == 2) {
				i++;
				array[i] = number%10;
			}
		}
		for (int i = 0; i < array.length-1; i++) {
			if (array[i] >= array[i+1) {
				checkIncrease = false;
				break;
			}
		}
		System.out.println( checkIncrease ? "Введеное Вами число возрастает":"Введеное Вами число не возрастает");
		
	}
}