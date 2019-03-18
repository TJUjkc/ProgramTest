package triangle;

import static org.junit.Assert.assertEquals;
import org.junit.*;

public class test_solve {
	@Test
	public void test_result(){
		solve s=new solve();
		assertEquals(true,s.result(26));
		assertEquals(true,s.result(27));
		assertEquals(false,s.result(-1));
		assertEquals(false,s.result(100));
		assertEquals(false,s.result(19));
	}
}
