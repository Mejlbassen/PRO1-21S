package Opgave_4_GeometriskeFigurer;

public class App {
    public static void main(String[] args) {

        Cirkel c1 = new Cirkel("Cirkel", 10.5);
        Ellipse e1 = new Ellipse("Ellipse", 10, 15);
        Kvadrat k1 = new Kvadrat("Firkant", 10.5);
        Rektangel r1 = new Rektangel("Lang firkant", 10.5, 15.5);

        System.out.println("Cirkel");
        System.out.println(c1.beregnStørrelse());
        System.out.println("Ellipse");
        System.out.println(e1.beregnStørrelse());
        System.out.println("Kvadrat");
        System.out.println(k1.beregnStørrelse());
        System.out.println("Rektangel");
        System.out.println(r1.beregnStørrelse());


    }
}
