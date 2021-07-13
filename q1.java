package tar_4;

import Ext_1.MyConsole;

public class q1 {

	public static void main(String[] args) {
	System.out.println("give me number , and i will give you arrays with your number randomaly from 0 your number , and also how many digis .  ");
    int n = MyConsole.readInt("give me your number " ); 
    int arr[] = new int [n]; 
    int dig = 0;
    int countZero = 0;
    for (int i = 0; i < arr.length; i++) {
		arr [i] = (int)(Math.random()*n);
	System.out.print(arr[i]+" | ");
	if (arr[i] == 0 ) countZero ++; 
	while (arr[i] != 0 ) { 
		dig = arr[i]%10; 
		if (dig == 0  ) { 
			countZero ++;	
		}
		arr[i] = arr[i]/10; 
	}
	
	}
    System.out.println();
    System.out.println("there are "+countZero+" zeros in the array");
	}
}
