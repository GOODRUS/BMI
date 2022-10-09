public class BmiService {
    public double calculate(double height) {
        int mass = 95; // Масса в килограммах
        double bodyMassIndex = mass / Math.pow((height / 100), 2); // Индекс
        return bodyMassIndex;
    }
}
