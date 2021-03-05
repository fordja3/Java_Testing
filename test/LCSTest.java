import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LCSTest {

	LCS lcs = new LCS();

	@Test
	public void testLcs() throws Exception {
		
		// skip first for loop
		String a = "";
        String b = "ACGGCGGATACG";

		String out = LCS.lcs(a, b);

		assertEquals(out, "") ;


		// skip second for loop
		String c = "ACGGCGGATACG";
		String d = "";

		String test = LCS.lcs(c, d);

		assertEquals(test, "") ;

		// skip for loops and while loop
		String e = "";
		String f = "";

		String tester = LCS.lcs(e, f);

		assertEquals(tester, "") ;

		// returns nothing because the char are in different cases
		String g = "RACECAR";
		String h = "racecar";

		String tst = LCS.lcs(g, h);

		assertEquals(tst, "") ;	

		// runs through and matches all characters
		String i = "PASSPORT";
		String j = "TROPSSAP";

		String tstr = LCS.lcs(i, j);

		assertEquals(tstr, "PSSP") ;	

		// returns nothing because no characters exist in both string x and in string y
		String k = "abcdefg";
		String l = "hijklmnop";

		String valid = LCS.lcs(k, l);

		assertEquals(valid, "") ;	

		// random non-sense string with various characters and cases
		String m = "!@#$%^&*()_+{}|:;',.//,.?'1234567890~`;) ";
		String n = "!@#$%^&*()_+{}|:;',.//,.?'0987654321~` ";

		String st = LCS.lcs(m, n);

		assertEquals(st, "!@#$%^&*()_+{}|:;',.//,.?'0~` ") ;	


	}

}
