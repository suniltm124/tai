package taii;

import java.util.Scanner;

public class CommonMultiples {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int a=s.nextInt();
	int b=s.nextInt();
	int c=a*b;
	int i=1;
	while(i<=n) {
	System.out.println(c*i++);
	}
}
}
