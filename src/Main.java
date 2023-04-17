public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(4, 6));
        System.out.println(calc.mult(-2, -7));
        System.out.println(calc.pow(2, 3));
    }
}