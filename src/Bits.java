import java.util.BitSet;

public class Bits {

    private BitSet bt = new BitSet();

    public void BitSet(int nbits) {
        try {
            bt = new BitSet(nbits);
            System.out.println(bt.toString());
        } 
        catch (NegativeArraySizeException err) {
            System.out.println(err.toString());
        }
    }
    // Creates a bit set whose initial size is large enough to explicitly
    // represent bits with indices in the range 0 through nbits-1. All bits are initially false.
    // Parameters: nbits - the initial size of the bit set
    // Throws: NegativeArraySizeException - if the specified initial size is negative
    public void set(int bitIndex){

        try {
            bt.set(bitIndex, true);
            System.out.println(bt.toString() + " set at " + bitIndex);
        } 
        catch (IndexOutOfBoundsException err) {
            System.out.println(err.toString());
        }
    }
    //Sets the bit at the specified index to true.
    //Parameters: bitIndex - a bit index
    //Throws: IndexOutOfBoundsException - if the specified index is negative
    public boolean get(int bitIndex){
        try {
            bt.get(bitIndex);
            System.out.println( bt.toString() + " got at " + bitIndex);
            return true;
        } 
        catch (IndexOutOfBoundsException err) {
            System.out.println(err.toString());
            return false;
        }    
    }
    //Returns the value of the bit with the specified index. The value
    //is true if the bit with the index bitIndex is
    //currently set in this BitSet; otherwise, the result is false.
    //Parameters: bitIndex - the bit index
    //Returns: the value of the bit with the specified index
    //Throws: IndexOutOfBoundsException - if the specified index is negative
    public void flip(int bitIndex){
        try {
            bt.flip(bitIndex);
            System.out.println(bt.toString() + " flipped to " + bitIndex);

        } 
        catch (IndexOutOfBoundsException err) {
            System.out.println(err.toString());
        }    
    }
    //Sets the bit at the specified index to the complement of its current value.
    //Parameters: bitIndex - the index of the bit to flip
    //Throws: IndexOutOfBoundsException - if the specified index is negative
    @Override
    public String toString(){
        return bt.toString();
    }

    public static void main(String[] args) {
        
        Bits bit = new Bits();
        Bits bit2 = new Bits();
        
        bit.set(0);
        bit.set(1);
        bit.set(2);

        bit2.set(3);
        bit2.set(4);
        bit2.set(5);    


    }
}


