import java.util.Scanner;

class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, indeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz(m) : ");
        boy = input.nextDouble();
        System.out.print("Kilonuz(kg) : ");
        kilo = input.nextDouble();

        indeks = kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz : " + indeks);

    }
}