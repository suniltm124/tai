package taii;

import java.util.Scanner;

public class reversearr {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter the array size");
	int n=s.nextInt();
	System.out.println("enter the elements");
	int [] a=new int[n];
	for (int i = 0; i < a.length; i++) {
		a[i]=s.nextInt();
	}
	for (int i = a.length-1; i >=0 ; i--) {
		System.out.println(a[i]);
	}
}
}
