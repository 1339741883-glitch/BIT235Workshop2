public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 5000.00;
        double rate = 0.04;
        int years = 10;

        double amount = principal * Math.pow(1 + rate, years);

        System.out.println("Principal: $" + principal);
        System.out.println("Annual interest rate: " + (rate * 100) + "%");
        System.out.println("Period: " + years + " years");
        System.out.println("Final amount: $" + String.format("%.2f", amount));
    }
}
