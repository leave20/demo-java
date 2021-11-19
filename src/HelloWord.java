import java.util.Locale;

public class HelloWord {
    public static void main(String[] args) {
        String greet="Hello word from Java";
        System.out.println(greet.toUpperCase(Locale.ROOT));
        int numberOne=10;
        boolean value=true;
        int numberTwo=5;
        if (!value){
            System.out.println("number = " + numberOne);
            numberTwo=30;
        }
        System.out.println("numberTwo = "+ numberTwo);

        var numberThree= 50;
        System.out.println(numberThree);
    }
}
