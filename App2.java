import java.lang.reflect.Array;
import java.util.*;

public class App2 {

    public static void main(String Args[]) {
        List Mnome = new ArrayList<>();
        List Fnome = new ArrayList<>();
        List Inome = new ArrayList<>();

        Scanner leia2 = new Scanner(System.in);
        System.out.print("Quais os nomes?(nome -m/f,) ");
        String nome2 = leia2.nextLine();
        String[] nome2Sep = nome2.split(",\\s");
        for (int x = 0; x < nome2Sep.length; x++) {
            Inome.add(nome2Sep[x]);
        }
        for (int x = 0; x < Inome.size(); x++) {
            String temp = Inome.get(x).toString();
            String[] temp2 = temp.split("-");


            if (temp2[1].equals("m")) {
                Mnome.add(temp2[0]);
            } else if (temp2[1].equals("f")) {
                Fnome.add(temp2[0]);

            }


        }
        Collections.sort((Fnome));
        Collections.sort((Mnome));
        Collections.sort((Inome));
        System.out.println("Lista original: " + Inome);
        System.out.println("Nomes femininos: " + Fnome);
        System.out.println("Nomes masculinos: " + Mnome);
    }
}
