import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LCSTest {

	LCS lcs = new LCS();

	@Test
	public void testLcs() throws Exception {
		
		String a = "GGCACCACG";
        String b = "ACGGCGGATACG";

		String out = LCS.lcs(a, b);

		assertEquals(out, "GGCAACG") ;

	}

	@Test
	public void testMain() throws Exception {

	}

}
