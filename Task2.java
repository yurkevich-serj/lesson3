public class Task2 {
	public static void main(String[] args) {
		int[] array = { 3,3,5,3,5,1011,11,1011,11,8};

		boolean[] repeatCheck = new boolean[array.length];
		for (int i = 0; i < array.length; i++) {
			int count = 1;
			for (int j = i+1; j < array.length; j++) {
				if ( array[i] == array[j] && !repeatCheck[i]) {
					count++;
					repeatCheck[j] = true;
				}
			}

			if ( !repeatCheck[i]){
				System.out.println ( array[i]+ " - " + count);
			}
		}
	}
}