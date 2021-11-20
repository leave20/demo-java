public class CharPrimitive {
    public static void main(String[] args) {
        char character = '\u0040';
        char decimal = 64;
        System.out.println("character: " + character);
        System.out.println("decimal: " + decimal);
        System.out.println("decimal = character: " + (decimal == character));

        System.out.println("");
        System.out.println("");

        char symbol = '@';
        System.out.println("symbol= " + symbol);
        System.out.println("symbol = character: " + (symbol == character));
        System.out.println("value in byte: " + Character.BYTES);
        System.out.println("value in Bites: " + Character.SIZE);
        System.out.println("max value is: " + Character.MAX_VALUE);
        System.out.println("min value is: " + Character.MIN_VALUE);

        char space = '\u0020';
        char backspace = '\b';
        char tabulator = '\t';
        char newLine = '\n';
        char returnCar = '\r';

        System.out.println("");
        System.out.println("");

        System.out.println("value in byte: " + System.lineSeparator() + Character.BYTES);
        System.out.println("value in byte:" + newLine + Character.BYTES);
        System.out.println("value in Bites: " + Character.SIZE);
        System.out.println("min value is: " + Character.MIN_VALUE);
        System.out.println("max value is: " + Character.MAX_VALUE);
    }
}
