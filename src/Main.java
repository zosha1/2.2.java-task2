public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 52; //kg
        double height = 1.65; //m
        double bmi = service.calculate(weight, height);
        System.out.println(String.format("%.2f",bmi));
    }
}
