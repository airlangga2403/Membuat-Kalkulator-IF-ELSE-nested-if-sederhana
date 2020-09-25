import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        float a,b,operator,hasil;

        System.out.print("Masukkan Nilai = ");
        a = input.nextFloat();

        System.out.print("Masukkan Operator = ");
        operator =input.next().charAt(0);

        System.out.print("Masukkan Nilai = ");
        b = input.nextFloat();



        if (operator == '+'){
            //penjumlahan
            hasil = a + b;
            System.out.println("Hasil dari Penjumlahan adalah " + hasil);
        } else if (operator == '-'){
            hasil = a - b;
            System.out.println("Hasil dari Pengurangan adalah " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("Hasil dari Perkalian adalah " + hasil);
        } else if (operator == '/'){
           if (b == 0){
                System.out.println("Hasil dari pembagian 0 adalah tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil dari Pembagian adalah " + hasil);
        } 
	} else {
            System.out.println("Operator yang anda masukkan salah");
        }










    }
}