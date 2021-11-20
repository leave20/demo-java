public class BooleanPrimitive {
    public static void main(String[] args) {

        boolean dataLogic = true;

        System.out.println("dataLogic: " + dataLogic);

        double d = 98765.43e-3;//98.76543
        float f = 12345e2f;//1234500.0

        System.out.println(d);
        System.out.println(f);

        dataLogic = d < f;
        System.out.println(dataLogic);
    }
}
