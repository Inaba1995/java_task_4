public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();

        double mHeight = 1.87;
        double kgWeight = 98;
        int bmi = bmiService.calculate(mHeight, kgWeight); // 28
        System.out.println(bmi);

        mHeight = 1.62;
        kgWeight = 79.5;
        bmi = bmiService.calculate(mHeight, kgWeight); // 30
        System.out.println(bmi);

        mHeight = 1.82;
        kgWeight = 83.3;
        bmi = bmiService.calculate(mHeight, kgWeight); // 25
        System.out.println(bmi);

    }
}