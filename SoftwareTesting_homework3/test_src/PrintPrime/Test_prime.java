package PrintPrime;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_prime {

	@Test
	public void test() {
		Prime p = new Prime();
		String result = new String("Prime: 2\r\nPrime: 3\r\nPrime: 5\r\nPrime: 7\r\nPrime: 11\r\n");
		p.printPrimes(5);
        //assertEquals(result, p.printPrimes(5));
	}

}
