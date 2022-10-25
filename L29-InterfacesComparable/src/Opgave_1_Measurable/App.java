package Opgave_1_Measurable;

import java.lang.reflect.Array;

public class App {
    public static void main(String[] args) {
        Chili c1 = new Chili("Mild",100);
        Chili c2 = new Chili("Medium",10000);
        Chili c3 = new Chili("SurSød",5000);

        Chili[] chilis = new Chili[3];

        chilis[0] = c1;
        chilis[1] = c2;
        chilis[2] = c3;

        System.out.println(c1.getNavn() + " " + c1.getStyrke());
        System.out.println(c2.getNavn() + " " + c2.getStyrke());
        System.out.println(c3.getNavn() + " " + c3.getStyrke());
        System.out.println("****************");

        System.out.println(max(chilis).getMeasure());
        System.out.println("****************");

        System.out.println(avg(chilis));
    }

    public static Measurable max(Measurable[] objects){
        double max = 0;
        Measurable result = null;
        for (Measurable obj : objects){
            if (max < obj.getMeasure()){
                max = obj.getMeasure();
                result = obj;
            }
        }
        return result;
    }

    public static double avg(Measurable[] objects){
        double sum = 0;
        for (Measurable obj : objects){
            sum = sum + obj.getMeasure();
        }
        return sum / objects.length;
    }

}
