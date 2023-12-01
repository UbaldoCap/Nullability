public class Main {
    public static void main(String[] args) {
        div(10,null);
        div(10, 5);
        div(10, 0);
    }
    public static void div (Integer numeratore, Integer denominatore) {
        int result;
        try {
            System.out.println(result = numeratore/ denominatore);
        } catch (NullPointerException e) {
            System.out.println("valori nulli");
        } catch (ArithmeticException e) {
            System.out.println("operazione impossibile");
        }
    }
}
