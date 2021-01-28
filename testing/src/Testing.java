import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class Testing {



    // RED
    // public long sumSquares(int start, int end) {
    // }

    // GREEEN
    // public long sumSquares(int start, int end) {
    //     return 0;
    // }

    // RED

  @Test
  public void sumSquaresReturnsFive(){
    App app = new App();
    assertEquals(app.sumSquares(1,2), 5);
  }
    
}
