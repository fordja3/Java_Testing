public class App {
    
    public long sumSquares(int begin, int end) {
        long count = 0;
        while(begin <= end){
            count = count + (begin * begin);
            begin ++;
        }
        return count;
    }

    public static void main(String[] args){
        App app = new App();
        System.out.println(" -- " + app.sumSquares(1,10) + " -- ");
    }

}
