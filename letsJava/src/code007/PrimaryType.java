package code007;

public class PrimaryType {
    public static void main(String[] args) {
        byte minByteVar = -128;
        byte maxByteVar = 127;
        System.out.println(minByteVar);
        System.out.println(maxByteVar);

        short minShortVar = -32768;
        short maxShortVar = 32767;
        System.out.println(minShortVar);
        System.out.println(maxShortVar);

        int minIntVar = -2147483648;
        int maxIntVar = 2147483647;
        System.out.println(minIntVar);
        System.out.println(maxIntVar);

        long minLongVar = -9223372036854774808L;
        long maxLongVar = 9223372036854774807L;
        System.out.println(minLongVar);
        System.out.println(maxLongVar);

        float floatVar = 100.0000000661F;
        System.out.println(floatVar);

        double doubleVar = 100.0000000666;
        System.out.println(doubleVar);

        boolean booleanVar = true;
        System.out.println(booleanVar);

        char charVar = 'a';
        System.out.println(charVar);

    }
}
