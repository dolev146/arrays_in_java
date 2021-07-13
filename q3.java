package tar_4;

import Ext_1.MyConsole;

public class q3 {

	public static void main(String[] args) {
		System.out.println("I will invert your number ");
		int n = MyConsole.readInt("please enter your number ");
		int dig = 0, calc = n;
		while (calc != 0) {
			dig = dig + 1;
			calc = calc / 10;
		}

		int arr[] = new int[dig];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n = n / 10;
			System.out.print(arr[i] + ",");
		}

	}

}
