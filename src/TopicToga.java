public class TopicToga {
    String globalVariable = "ini global variable";

    public static void main(String[] args) {

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
    }

    public void caller(){
        System.out.println(globalVariable);
        //System.out.println(localVariable); error
    }
}
