package Opgave_5_heltalskvadratroden;

public class KvadratApp {

    public static void main(String[] args) {
        Kvadrat k = new Kvadrat();

        System.out.println("kvadratrod i heltal for 1-125");
        for (int i = 1; i <= 125; i++) {
            System.out.println(i + " " + k.findKvadrat(i));
        }

        System.out.println("n : 3");
        System.out.println(k.findKvadrat(3));
        System.out.println("*****");
        System.out.println("n : 15");
        System.out.println(k.findKvadrat(15));
        System.out.println("*****");
        System.out.println("n : 16");
        System.out.println(k.findKvadrat(16));
        System.out.println("*****");
        System.out.println("n : 25");
        System.out.println(k.findKvadrat(25));
        System.out.println("*****");
        System.out.println("n : 30");
        System.out.println(k.findKvadrat(30));
        System.out.println("*****");
    }
}
