import java.io.*;
import java.util.Scanner;

public class Main {

    public static class Mokiniai {
        String vardas;
        int metai;
        double vidurkis;

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("U1.txt"));
            int n = sc.nextInt();
            sc.nextLine();
            Mokiniai[] mokiniai = new Mokiniai[n];
            for (int i = 0; i < n; i++) {
                mokiniai[i] = new Mokiniai();
                mokiniai[i].vardas = sc.next();
                mokiniai[i].metai = sc.nextInt();
                mokiniai[i].vidurkis = sc.nextDouble();
                sc.nextLine();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("Vardas: " + mokiniai[i].vardas + " Metai: " + mokiniai[i].metai + " Vidurkis: "
                        + mokiniai[i].vidurkis);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}