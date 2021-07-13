package tar_4;

import Ext_1.MyConsole;

public class q2 {

	public static void main(String[] args) {
		System.out.println(
				" give me arr length  , i will give you randomaly numbers between 10-30 , with min and max values ");
		int size = MyConsole.readInt("Enter array size : ");
		int from = MyConsole.readInt("Enter start number : ");
		int to = MyConsole.readInt("Enter last number : ");
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (to - from + 1)) + from;
			System.out.print(arr[i] + "| ");

			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("max = " + max);
		System.out.println("min = " + min);
	}
}
