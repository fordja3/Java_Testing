public class App {
    
    public long sumSquares(int begin, int end) {
        long count = 0;
        for (long i = begin; i <= end; i++) {
            count = count + (i * i);
        }
        return count;
    }

}
