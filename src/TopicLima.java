public class TopicLima {
    public static void main(String[] args) {

        // nomor 1
        System.out.println("Nomor 1A");
        for(int i = 1; i <= 5; i++){
            System.out.print((int)Math.pow(2, i) + " ");
        }
        System.out.println();

        System.out.println("Nomor 1B");
        int [] save = new int[5];
        for(int i = 1; i <= 5; i++){
            if(i == 1 || i == 2){
                save[i - 1] = (int)Math.pow(2, i);
            }else{
                save[i - 1] = save[i - 2] * save[i - 3];
            }
        }
        for (int i = 0; i < save.length; i++){
            System.out.print(save[i] + " ");
        }
        System.out.println();

        System.out.println("Nomor 2");
        // nomor 2
        int[] myArray = {6, 6, 5, 9, 2};
        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray.length - i -1; j++){
                if(myArray[j] < myArray[j + 1]){
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        System.out.println("Nomor 3");
        // nomor 3
        char[] myArray2 = {'M', 'A', 'K', 'A', 'N', 'N', 'A', 'S', 'I'};
        for(int i = 0; i < myArray2.length; i ++){
            for(int j = 0; j < myArray2.length - i - 1; j++){
                if(myArray2[j] > myArray2[j + 1]){
                    char temp = myArray2[j];
                    myArray2[j] = myArray2[j + 1];
                    myArray2[j + 1] = temp;
                }
            }
        }
        System.out.println(myArray2);
    }
}
