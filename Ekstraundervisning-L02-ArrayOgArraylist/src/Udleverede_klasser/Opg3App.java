import java.util.ArrayList;
import java.util.List;


        //Lav en Opg3App klasse med en main()-metode. I denne skal du oprette en ArrayList<String> med biler
public class Opg3App {
    public static void main(String[] args) {
        ArrayList<String> maerker = new ArrayList<>(
                List.of("Ford", "VW", "Fiat", "Opel", "Peugeot")
        );

        //Anvend en for-each-løkke til at udskrive alle elementerne i listen med hvert element på en linje for
        //sig selv.
        for (String maerke : maerker){
            System.out.println(maerker.indexOf(maerke) + " " + maerker.get(maerker.indexOf(maerke)));
        }

        System.out.println("*****************************");

        //Anvend en for-løkke (med indeks) til at udskrive alle elementerne i listen med hvert element på en
        //linje for sig selv.
        for (int i = 0; i < maerker.size(); i++){
            System.out.println(maerker.get(i));
        }

        System.out.println("*****************************");





    }
}
