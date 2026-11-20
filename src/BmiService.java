public class BmiService {
    public int calculate(int kg, double meters) {
        double bmi = kg / (meters * meters);
        return (int) bmi;
    }
}

