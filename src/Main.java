public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double metrs=1.87;
        double kilograms=98;
        System.out.println((int) service.calculate(metrs,kilograms));

    }
}
