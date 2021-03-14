import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Function;

public class MutationRunner {

    private static ArrayList<Function<String,String>> mutators;

    @BeforeAll
    public static void chooseMutators() {
        mutators = new ArrayList();
        mutators.add(Mutators.deleteRandomCharacter);
        mutators.add(Mutators.flipRandomCharacter);
        mutators.add(Mutators.insertRandomCharacter);
    }

    @Test
    public void generateMutantsTest() {
        MutationFuzzer fuzzer = new MutationFuzzer(
                new String[] {"http://www.google.com"},
                mutators);
        fuzzer.runs( (fuzzStr) -> {
            System.out.println(fuzzStr);
            return Fuzzer.Outcome.PASS;
        },25);
    }


    @Test
    public void mutationDecoderTest() {
        MutationFuzzer fuzzer = new MutationFuzzer(
                new String[] {"http://www.google.com/abcd/123","http://www.abcd.com/%12","http://www.abcd.com/1+2"},
                mutators);
        Fuzzer.Outcome[] outcomes = fuzzer.runs( (fuzzStr) -> {
            try {
                System.out.println(fuzzStr);
                String s = URLDecoder.cgi_decode(fuzzStr);
                return Fuzzer.Outcome.PASS;
            }
            catch (ParseException e) {
                return Fuzzer.Outcome.PASS;
            }
            catch (Exception e) {
                return Fuzzer.Outcome.FAIL;
            }
        },1000);
        assert(Arrays.stream(outcomes)
                .filter(x -> x.equals(Fuzzer.Outcome.FAIL))
                .count() == 0);
    }

}
