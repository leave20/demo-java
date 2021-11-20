import javax.swing.*;

public class NumericalSystem {
    public static void main(String[] args) {

//        int numberDecimal = 500;
        String numberStr=JOptionPane.showInputDialog(null,"Inside number");
        int numberDecimal=Integer.parseInt(numberStr);

        System.out.println("numberDecimal= " + numberDecimal);
        System.out.println("number binary: " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal));

        int numberBinary = 0b111110100;
        System.out.println("numberBinary= " + numberBinary);
        System.out.println("number octal: " + numberBinary + " = " + Integer.toOctalString(numberBinary));

        int numberOctal = 0764;
        System.out.println("numberOctal= " + numberOctal);
        System.out.println("number octal: " + numberOctal + " = " + Integer.toOctalString(numberOctal));

        int numberHex = 0x1e;
        System.out.println("numberHex= " + numberHex);

        String message = "number binary " + numberDecimal + " = " + Integer.toBinaryString(numberDecimal);
        message += "\nnumber octal " + numberDecimal + " = " + Integer.toOctalString(numberDecimal);
        message += "\nnumber hexadecimal " + numberDecimal + " = " + Integer.toHexString(numberDecimal);


        JOptionPane.showMessageDialog(null, message);
    }
}
