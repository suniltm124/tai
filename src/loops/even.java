package loops;

import java.util.Scanner;

public class even {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int j=1;
	while(j<=n*2)
	{
		 if (j%2==0) {
			System.out.println(j);
		}
		 j++;
	}
}
}
