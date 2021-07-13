package tar_4;

import Ext_1.MyConsole;

public class q7 {

	public static void main(String[] args) {
		System.out.println(" enter 3 numbers and i will do some order ");
		double arr[] = new double[3];
		double temp = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = MyConsole.readDouble("Please enter arr [" + i + "] =");
		}
		if (arr[0] > arr[2]) {
			temp = arr[2];
			arr[2] = arr[0];
			arr[0] = temp;
		}
		if (arr[1] > arr[2]) {
			temp = arr[2];
			arr[2] = arr[1];
			arr[1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			if (i == 0)
				System.out.print(arr[i]);
			else
				System.out.print(" < " + arr[i]);
		}
	}

}
