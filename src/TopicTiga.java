import java.util.Scanner;

public class TopicTiga {
    String globalVariable = "ini global variable";

    public static void main(String[] args) {
        System.out.println("=== Tipe Data ===");
        char tandaTanyaInAscii = '\77';
        System.out.println(tandaTanyaInAscii);

        System.out.println("== Tipe data round number ===");
        byte numByter = 10;
        short numShort = 1000;
        int numInt = 10000;
        long numLong = 10000000;

        System.out.println("=== tipe data fraction number ===");
        float numFloat = 10.5f;
        double numDouble = 444.7d;

        System.out.println("=== Tipe data boolean ===");
        boolean bool = true;

        System.out.println("=== kalkulator ===");
        System.out.print("Masukkan nilai pertama: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println();
        System.out.print("Masukkan nilai kedua: ");
        int b = input.nextInt();
        System.out.println("Hasil penjumlahan dari " + a + " dan " + b + " adalah= " + addition(a, b));
        input.close();
    }

    /**
     * fungsi untuk membantu pemahaman mengenai local variable
     */
    public void localVar(){
        String localVariable = "ini adalah local variable";
        if(true){
            String localVariableInIf = "local dalam if";
        }

        System.out.println(localVariable);
        System.out.println(globalVariable);
        //System.out.println(localVariableiInIf); error
    }

    public void caller(){
        System.out.println(globalVariable);
        //System.out.println(localVariable); error
    }

    public static int addition(int a, int b){
        return a + b;
    }
}
