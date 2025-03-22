public class TestBinaryOperator {
    
    public static void main(String[] args) {
        System.err.println(BinaryOperator.andOperator(0, 0));
        System.err.println(BinaryOperator.andOperator(0, 5));
        System.err.println(BinaryOperator.andOperator(4, 4));
        System.err.println(BinaryOperator.andOperator(10, 7));

        System.out.println("------------------------------------------------------------");

        System.err.println(BinaryOperator.orOperator(0, 0));
        System.err.println(BinaryOperator.orOperator(0, 5));
        System.err.println(BinaryOperator.orOperator(4, 4));
        System.err.println(BinaryOperator.orOperator(10, 7));

        System.out.println("------------------------------------------------------------");

        System.err.println(BinaryOperator.xorOperator(0, 0));
        System.err.println(BinaryOperator.xorOperator(0, 5));
        System.err.println(BinaryOperator.xorOperator(4, 4));
        System.err.println(BinaryOperator.xorOperator(10, 7));

        System.out.println("------------------------------------------------------------");

        System.err.println(BinaryOperator.leftShiftOperator(0, 0));
        System.err.println(BinaryOperator.leftShiftOperator(0, 5));
        System.err.println(BinaryOperator.leftShiftOperator(1, 4));
        System.err.println(BinaryOperator.leftShiftOperator(1, 0));

        System.out.println("------------------------------------------------------------");

        System.err.println(BinaryOperator.rightShiftOperator(0, 0));
        System.err.println(BinaryOperator.rightShiftOperator(0, 5));
        System.err.println(BinaryOperator.rightShiftOperator(32, 4));
        System.err.println(BinaryOperator.rightShiftOperator(1, 0));

        System.out.println("------------------------------------------------------------");

        System.err.println(BinaryOperator.notOperator(0));
        System.err.println(BinaryOperator.notOperator(1));
        System.err.println(BinaryOperator.notOperator(32));
        System.err.println(BinaryOperator.notOperator(-1));

        System.out.println("------------------------------------------------------------");
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toBinaryString(-10));

    }
    
}
