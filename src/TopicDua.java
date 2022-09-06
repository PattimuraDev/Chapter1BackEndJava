public class TopicDua {
    public static void main(String[] args) {
        System.out.println("Hello Binar Synergy");
        System.out.println("=== program start ===");
        method1();

        method2("ini contoh method dengan parameter");

        String x = "ini string";
        method2(x);

        System.out.println(method3("ini contoh method dengan return string"));
        System.out.println(method3("ini contoh method dengan return string (2)"));
        System.out.println(method4("ini coba lagi", "a"));
        System.out.println(method4("ini coba lagi dua", "b"));
        System.out.println(sum(1, 4));
        System.out.println(sum(3, 6));
    }

    private static void method1(){
        System.out.println("Ini method");
    }

    private static void method2(String inputan){
        // ini contoh komentar
        System.out.println(inputan);
    }

    private static String method3(String par){
        return par;
    }

    /**
     * Method ini dipakai untuk menghapus beberapa karakter di suatu string
     * @param par salah satu parameter teks yang akan diproses
     * @param charHapus parameter untuk menentukan karakter yang ingin dihapus
     * @return teks yang sudah dihapus beberapa karakternya
     */
    private static String method4(String par, String charHapus){
        return par.replaceAll(charHapus, "");
    }

    /**
     * Method ini digunakan untuk menjumlahkan dua bilangan berbeda
     * @param bilSatu paramater untuk bilangan pertama
     * @param bilDua parameter untuk bilangan kedua
     * @return jumlah dari dua bilangan yang ada di parameter
     */
    private static int sum (int bilSatu, int bilDua){
        return bilSatu + bilDua;
    }
}
