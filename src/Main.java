public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98;
        double meters = 1.87;
        int bmi = service.calculate(kg, (int) meters);
        System.out.println(bmi);
    }
}