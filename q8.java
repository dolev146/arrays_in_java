package tar_4;

import Ext_1.MyConsole;

public class q8 {

	public static void main(String[] args) {
		System.out.println(" give me a number and will sum with array ");
		int num = MyConsole.readInt(" please enter your number : ");
		int temp = num;
		int size = 0;
		int sum = 0;

		while (temp != 0) {
			temp = temp / 10;
			size++;
		}
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = num % 10;
			num = num / 10;
			sum += arr[i];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == arr.length - 1)
				System.out.print(arr[i]);
			else
				System.out.print(" + " + arr[i]);
		}
		System.out.println();
		System.out.println("the sum of the digis is = " + sum);
	}

}
