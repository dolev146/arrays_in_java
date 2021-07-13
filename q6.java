package tar_4;

import Ext_1.MyConsole;

public class q6 {

	public static void main(String[] args) {
		System.out.println(" give me number , ill give you rnadomaly numbers that devided by 3 . ");
		int n = MyConsole.readInt("Enter number : ");
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * n);
			while (arr[i] == 0)
				arr[i] = (int) (Math.random() * n);
			while (arr[i] % 3 != 0) {
				arr[i] = (int) (Math.random() * n) + 1;
			}
			System.out.print(arr[i] + ", ");

		}

	}

}
