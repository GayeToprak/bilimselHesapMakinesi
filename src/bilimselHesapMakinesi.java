import java.util.Scanner;

public class bilimselHesapMakinesi {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz:");
        n1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz:");
        n2 = inp.nextInt();

        System.out.println("1-toplama\n 2-çıkarma\n 3-çarpma\n 4-bölme\n 5-üs alma\n 6-mod alma\n 7- çıkış yap." );
        System.out.println("seçiminiz:");
        select = inp.nextInt();

        switch(select) {
            case 1:
                System.out.println("toplam:" + (n1 + n2));
                break;
            case 2:
                System.out.println("toplam:" + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) {
                    System.out.println("toplam:" + (n1 / n2));
                } else {
                    System.out.print("0 'a bölünmez.");
                }
                break;
            case 5:
                System.out.println("toplam:" + (n1 ^ n2));
                break;
            case 6:
                System.out.println("toplam:" + (n1 % n2));
                break;
            case 7:
                System.out.println("güle güle.");
                break;
            default:

                System.out.print("yanlış seçim yaptınız.");
        }
    }
}