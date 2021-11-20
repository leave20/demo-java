public class IntegerPrimitive {
    public static void main(String[] args) {
        byte numberByte = 127;
        System.out.println("numberByte= " + numberByte);
        System.out.println("number in byte :" + Byte.BYTES);
        System.out.println("number in Bites :" + Byte.SIZE);
        System.out.println("max value in byte :" + Byte.MAX_VALUE);
        System.out.println("min value in byte :" + Byte.MIN_VALUE);

        System.out.println("");
        System.out.println("");

        short numberShort=32767;
        System.out.println("numberShort= "+ numberShort);
        System.out.println("number in byte:" + Short.BYTES);
        System.out.println("number in Bites: "+ Short.SIZE);
        System.out.println("max value in short: "+Short.MAX_VALUE);
        System.out.println("min value in short: "+Short.MIN_VALUE);

        System.out.println("");
        System.out.println("");

        int numberInt=2147483647;
        System.out.println("numberInt= "+ numberInt);
        System.out.println("number in byte: "+ Integer.BYTES);
        System.out.println("number in bites: "+ Integer.SIZE);
        System.out.println("max value in int: "+ Integer.MAX_VALUE);
        System.out.println("min value in int: "+ Integer.MIN_VALUE);

        System.out.println("");
        System.out.println("");

        long numberLong=9223372036854775807L;
        System.out.println("numberLong= "+ numberLong);
        System.out.println("number in byte: "+ Long.BYTES);
        System.out.println("number in bites: "+ Long.SIZE);
        System.out.println("max value in long: "+ Long.MAX_VALUE);
        System.out.println("min value in long: "+ Long.MIN_VALUE);

    }
}
