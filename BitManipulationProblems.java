public class BitManipulationProblems {    
    public static int setTheIthBit(int num, int index) {
        return num | (1<<index);
    }

    public static int checkIthBitIsSetUsingLeftShift(int num, int index) {
        return num & (1<<index);
    }

    public static int checkIthBitIsSetUsingRightShift(int num, int index) {
        return (num >> index) & 1;
    }

    public static void main(String[] args) {
        System.out.println(BitManipulationProblems.setTheIthBit(10, 0));
        System.out.println(BitManipulationProblems.setTheIthBit(10, 2));

        System.out.println(BitManipulationProblems.checkIthBitIsSetUsingLeftShift(10, 0));
        System.out.println(BitManipulationProblems.checkIthBitIsSetUsingLeftShift(10, 2));

        System.out.println(BitManipulationProblems.checkIthBitIsSetUsingRightShift(10, 0));
        System.out.println(BitManipulationProblems.checkIthBitIsSetUsingRightShift(10, 2));

    }
}
