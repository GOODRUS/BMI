public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 185; // Рост в сантиметрах
        double bmi = service.calculate(height);
        System.out.println(bmi);
    }
}