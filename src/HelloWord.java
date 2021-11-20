import java.util.Locale;

/** Craig Kem Castro Pairazaman.
 * Una variable está compuesto por :
 * -Tipo de dato
 * -Nombre de la variable
 *
 * Tipo de Dato:
 * Primitivo y Referenciados
 *
 * Primitivo:
 * Contienen un solo valor y son: entero, flotante, characters, booleanos , etc
 *
 * boolean:
 * -Este es el tipo mas simple de un solo bit
 * -Un boolean expresa un valor de verdad, puede ser VERDADERO o FALSO
 * -Para especificar un literal boolean, se usan las palabras claves -> true o false.
 *
 * char:
 * Usa el código UNICODE y ocupa cada caracter 16 bits.
 *
 * enteros:
 * Son 4 tipos byte shot int y long
 * Un entero es un número del conjunto z={... -2, -1, 0, 1, 2 ...}
 *
 * byte enteroByte= 127;
 * ->entre -128 - 127
 *
 * shot enteroByte= 32767;
 * ->entre -32768 - 32767
 *
 * int enteroInt=2147483647;
 * ->entre -2147483648 - 2147483647
 *
 * long enteroLong= 9223372036854775807L
 * ->entre - 9223372036854775808 -  9223372036854775807
 *
 * reales:
 * Son dos tipos float y double
 *
 * float realFloat= 3.1416f;
 *
 * double realDouble= 4.7029235E3;
 *
 * Referenciados: Arreglos, clases e interfaces.
 *
 * Reglas para definir nombres de variables:
 * Por convención, los nombres de las variables empiezan con una letra minúscula
 * Debe ser un juego de caracteres comprendido en la codificación Unicode
 * No puede ser el mismo que una palabra clave(reservadas del lenguaje)
 * o el nombre de un valor booleando (true or false)
 * No deben tener el mismo nombre que otras variables cuyas declaraciones aparezcan en el mismo ambito.
 * Si una variable está compuesta de mas de una palabra, como 'nombreDato'
 * las palabras se ponen juntas y cada palabra después de la primera empieza
 * con una letra mayúscula.
 * Pueden comenzar por una letra, un subrayado o un simbolo de dolar,
 * siendo los siguientes caracteres letras o digitos.
 */

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

        String name = null;

        if (numberOne>10){
            name="Craig";
        }
        System.out.println("name= "+ name);
    }
}
