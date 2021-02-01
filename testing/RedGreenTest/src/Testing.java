import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Testing {

  // I wrote the file like this to show the progression from the top 
  // to the bottom to show the 
  // Red/Green cycle and refactored at the bottom. 

  //** RED *// 
  // public long sumSquares(int start, int end) {
  // }

  // @Test
  // public void sumSquaresReturns(){
  //   App app = new App();
  //   assertEquals(app.sumSquares(0,0), 0);
  // }
    
  // // ** GREEN *//  
  // public long sumSquares(int start, int end) {
  //     return 0;
  // }

  // @Test
  // public void sumSquaresReturnsZero(){
  //   App app = new App();
  //   assertEquals(app.sumSquares(0,0), 0);
  // }
    
  // //** RED */  
  //   public long sumSquares(int begin, int end) {
  //     long count = 0;
  //     for (long i = begin; i <= end; i++) {
  //         count = count + (i * i);
  //     }
  //     return count;
  // }

  //     // @Test
  // public void sumSquaresReturns5(){
  //   App app = new App();
  //   assertEquals(app.sumSquares(1,2), 5);
  // }

  // //** GREEN */  
  // public long sumSquares(int begin, int end) {
  //   long count = 0;
  //   for (long i = begin; i <= end; i++) {
  //       count = count + (i * i);
  //   }
  //   return count;
  // }

  // @Test
  // public void sumSquaresReturnsFive(){
  //   App app = new App();
  //   assertEquals(app.sumSquares(1,2), 5);
  // }

  // //** GREEN AND REFACTOR */  
  // public long sumSquares(int begin, int end) {
  //   long count = 0;
  //   while(begin <= end){
  //     count = count + (begin * begin);
  //     begin ++;
  //   }
  //   return count;
  // }

  @Test
  public void sumSquaresReturns14(){
    App app = new App();
    assertEquals(app.sumSquares(1,3), 14);
    
  }

}
