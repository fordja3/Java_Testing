import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParameterTest {
  
  @ParameterizedTest
  @MethodSource("firstEl")
  void firstElementTest1(int[] a, int b, int c)
  {
    Finder finder = new Finder();
    assertEquals(finder.firstElement(a, b), c);
  }
  
  private static Stream<Arguments> firstEl()
  {
    return Stream.of
    ( 
      Arguments.of(new int[]{1,2,3,4,5,6}, 3, 2),
      Arguments.of(new int[]{1,1,1,1,2,1,1}, 2, 4),
      Arguments.of(new int[]{1,2,3,4,5,6,7}, 8, -1),
      Arguments.of(new int[]{3,2,4,3,2,7,5,2,-1}, -1, 8)
    );
  }
    
}
    
    
       

