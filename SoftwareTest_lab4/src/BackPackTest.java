import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BackPackTest {
	@Test
	public void test() {
		/*BackPack bp = new BackPack();
		int w[] = new int[]{3,4,5};
		int p[] = new int[]{4,5,6};
		int c[][] = new int[][]{{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
		int [][]result = bp.BackPack_Solution(10,3,w,p);
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=10;j++) {
				assertEquals(c[i][j], result[i][j]);
			}
		}*/
		BackPack bp = new BackPack();
		int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int result[][] = new int[][]{{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
        int c[][] = bp.BackPack_Solution(m, n, w, p);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
            	assertEquals(result[i][j],c[i][j]);
            }
        }
	}
}
