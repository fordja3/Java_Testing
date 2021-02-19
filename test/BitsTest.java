import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BitsTest {

	Bits bit = new Bits();

	@Test
	public void testBitSet() throws Exception {
		bit.BitSet(10);
		assertEquals(bit.toString(), "{}");

		NegativeArraySizeException err = new NegativeArraySizeException();
		bit.BitSet(-10);
		assertEquals(err.toString(), "java.lang.NegativeArraySizeException");
	}

	@Test
	public void testSet() throws Exception {
		bit.set(1);
		assertEquals(bit.toString(), "{1}");

		IndexOutOfBoundsException out = new IndexOutOfBoundsException();
		bit.set(-1);
		assertEquals(out.toString(), "java.lang.IndexOutOfBoundsException");
	}

	@Test
	public void testGet() throws Exception {
		bit.set(2);
		bit.get(2);
		assertEquals(bit.toString(), "{2}");
		assertEquals(bit.get(2), true);

		IndexOutOfBoundsException out = new IndexOutOfBoundsException();
		bit.get(-1);
		assertEquals(out.toString(), "java.lang.IndexOutOfBoundsException");
		assertEquals(bit.get(-2), false);
	}

	@Test
	public void testFlip() throws Exception {
		bit.set(2);
		bit.set(4);
		
		// flips them back to false
		bit.flip(2);
		bit.flip(4);
		assertEquals(bit.toString(), "{}");

		
		bit.set(1);
		bit.set(5);
		// flips them back to false
		bit.flip(1);
		bit.flip(5);
		
		// flips them back to true
		bit.flip(1);
		bit.flip(5);
		assertEquals(bit.toString(), "{1, 5}");


		IndexOutOfBoundsException out = new IndexOutOfBoundsException();
		bit.get(-1);
		assertEquals(out.toString(), "java.lang.IndexOutOfBoundsException");

	}

	@Test
	public void testMain() throws Exception {
		

	}

}
