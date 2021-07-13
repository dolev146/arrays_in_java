
package tar_4;

import Ext_1.MyConsole;

public class q4 {

	public static void main(String[] args) {
		System.out.println(
				" give me number an i will give you a array in size of your num and random number from 0 - n . ");
		int n = MyConsole.readInt("Enter number : ");
		int even = 0;
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * n);
			System.out.print(arr[i] + "| ");
			if (arr[i] % 2 == 0) {
				even++;
			}
		}
		System.out.println();
		System.out.println("there are " + even + " even numbers ");
	}

}
