package tar_4;

import Ext_1.MyConsole;

public class q5 {

	public static void main(String[] args) {
		System.out.println("give me a number, and i will tell you if it symmerty or asymtery ");
		int n = MyConsole.readInt("please enter your number ");
		int arr[] = new int[n];
		boolean sym = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = MyConsole.readInt("Please enter arr [" + i + "] =");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[arr.length - i - 1]) {
				sym = true;
			} else {
				sym = false;
			}
		}
		System.out.println();
		if (sym)
			System.out.println("is symmetry");
		else
			System.out.println("is asymmery");
	}

}
