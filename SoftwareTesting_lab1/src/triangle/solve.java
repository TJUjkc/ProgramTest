package triangle;

import java.util.Scanner;

public class solve {
	int numofcoins[]= {1,1,2,3};
	int coins[]= {50,20,5,1};
	public boolean result(int x) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<numofcoins[i];j++) {
				if(x>=coins[i]) {
					x-=coins[i];
				}
				if(x==0) return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt();;
		solve s = new solve();
		boolean ans = s.result(x);
		if(ans==true)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}

