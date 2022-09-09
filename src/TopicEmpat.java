public class TopicEmpat {
    public static void main(String[] args) {
        System.out.println("=== ARRAY ===");
        int arraySatu[] = new int[5];
        int [] arrayDua = new int[5];
        int [] arrayTiga = {1, 3, 5, 8, 10, 2};
        System.out.println(arrayTiga[4]);

        arrayTiga[4] = 11;
        System.out.println(arrayTiga[4]);

        System.out.println(arrayTiga[0] + arrayTiga[4]);

        int a = 9;
        int b = 3;
        System.out.println("Hasil bagi a oleh b= " + a / b);
        System.out.println("Hasil sisa bagi a oleh 2= " + a % 2);
        System.out.println("Hasil a dipangkat 2= " + Math.pow(a, 2));

        System.out.println(++b); // +1 + b
        System.out.println(a++); // a + 1
        System.out.println(a); // 10

        System.out.println("=== Operator ===");
        System.out.println("=== Operator Compound Assignment ===");
        int opr1 = 9;
        opr1 += 5;
        System.out.println(opr1);
        opr1 -= 2;
        System.out.println(opr1);
        opr1 *= 2;
        System.out.println(opr1);
        opr1 /= 3;
        System.out.println(opr1);
        opr1 %= 7;
        System.out.println(opr1);

        System.out.println("=== Comparison Operator ===");
        int comp1 = 5;
        int comp2 = 10;
        System.out.println(comp1 == comp2); //false
        System.out.println(comp1 != comp2); //true
        System.out.println(comp1 < comp2); //true
        System.out.println(comp1 > comp2); //false
        System.out.println(comp1 <= comp2); //true
        System.out.println(comp1 >= comp2); //false

        System.out.println("=== Logical Operator ===");
        int log1 = 1;
        int log2 = 2;
        System.out.println(comp1 == comp2 && log1 != log2);

        System.out.println("=== conditional ===");
        kondisionalIfElse();
        kondisionalSwitchCase();
        perulangan();
    }

    public static void kondisionalIfElse(){
        int valA = 5;
        int valB = 6;
        // conditional if else biasa
        if(valA < valB && valA % 2 == 0 && valB % 3 == 0){
            System.out.println("Nilai valA kurang dari nilai valB");
        }else{
            System.out.println("Nilai valA lebih dari nilai valB");
        }

        valA = 10;

        // conditional if tanpa else
        if(valA < valB) System.out.println("val A kurang dari valB");

        // ternary operator
        System.out.println(valA < valB ? "valA kurang dari valB" : "valA lebih dari valB");
    }

    public static void kondisionalSwitchCase(){
        // switch case
        String nilai = "D";
        switch (nilai){
            case "A" :
                System.out.println("Selamat anda dapat nilai A");
                break;
            case "B":
                System.out.println("Selamat anda dapat nilai B");
                break;
            default:
                System.out.println("ERROR ini apa");
                break;
        }
    }

    public static void perulangan(){
        // perulangan for
        int[] data = {11, 2, 3, 90, 43, 23, 12};
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // perulangan while
        int index = 0;
        while(index < data.length){
            System.out.print(data[index] + " ");
            index++;
        }
        System.out.println();

        index = 0;
        // perulangan do-while
        do{
            System.out.print(data[index] + " ");
            index++;
        }while (index < data.length);
    }

    public static int recursionLoop(int k){
        if(k > 0){
            return k + recursionLoop(k - 1);
        }else{
            return 0;
        }
    }
}
