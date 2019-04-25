import java.util.Arrays;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BubbleSortTest {
	@Test
	public void test() {
		int arr[] = new int[]{1,6,2,2,5};
		int ans[] = new int[]{1,2,2,5,6};
        BubbleSort.BubbleSort(arr);
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<5;i++) {
        	assertEquals(ans[i],arr[i]);
        }
	}
}
