package Opgave_1;

public class Opgave1DobbelArray {

    public static void main(String[] args) {
        int[][] values = {{0, 4, 3, 9, 6}, {1, 3, 5, 2, 2}, {3, 3, 1, 0, 1}, {0, 0, 9, 7, 1}};

        DobbelArrayMethods da = new DobbelArrayMethods();
        System.out.println("Værdien af tabellen udskrives");
        da.udskrivArray(values);

        //1.1
        //Der returnerer værdien på plads (row,col) i numbers
        System.out.println("Expected result: 1");
        System.out.println(da.getValueAt(values, 2, 2));

        //1.2
        //Der opdaterer værdien på plads (row,col) i numbers til value
        da.setValueAt(values, 2, 2, 4);
        System.out.println("Expected result: 4");
        System.out.println(da.getValueAt(values, 2, 2));

        //1.3
        // Beregn summen af alle tal i row
        System.out.println("Expected result: 22");
        System.out.println(da.sumRow(values, 0));

        //1.4
        //Der returnerer summen af tallene i kolonnen col
        System.out.println("Expected result: 4");
        System.out.println(da.sumCol(values, 0));

        //1.5
        //Der returnerer summen af alle tallene i numbers
        System.out.println("Expected result: 63");
        System.out.println(da.sum(values));

    }
}
