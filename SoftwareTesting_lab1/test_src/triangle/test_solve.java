package triangle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith (Parameterized.class)
public class test_solve {
	public int x;
	public boolean result;
	
	public test_solve(int x, boolean result){
		this.x = x;
		this.result = result;
	}
	
	@Parameters
	public static Collection<Object[]> calcValues(){
		return Arrays.asList(new Object [][] {{26, true}, {19, false}});
	}
	
	@Test
	public void test_result(){
		solve s = new solve();
		assertEquals(result, s.FindResult(x));
	}
	
}
