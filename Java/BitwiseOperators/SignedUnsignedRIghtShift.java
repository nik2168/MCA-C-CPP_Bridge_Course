
public class SignedUnsignedRIghtShift {
    public static void main(String[] args) {
        // unsigned -> only positive
        // signed -> negative and positive both
         // unsigned and signed right  >>> & >> shift operators
        int a = -2;
        int b = 2;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a >>> b);
        System.out.println(Integer.toBinaryString(a >> b));

    }
}
