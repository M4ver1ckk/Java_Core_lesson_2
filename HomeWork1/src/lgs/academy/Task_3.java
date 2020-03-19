package lgs.academy;

public class Task_3 {
	public static void main(String[] args) {
		int[] mas = { 8, 9, 3, 7, 5, -6, 2, 10 };
		int max = mas[0], min = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max)
				max = mas[i];

			if (mas[i] < min)
				min = mas[i];
		}
		System.out.println("Максимальное число: " + max);
		System.out.println("Минимальное число: " + min);
	}

}