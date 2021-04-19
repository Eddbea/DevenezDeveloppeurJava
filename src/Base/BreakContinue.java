package Base;

public class BreakContinue {

    public static void main(String[] args) {

        boolean jeContinue = true;
        int nb=0;

        while (jeContinue){
            System.out.println("une iteration");
            nb++;
            if(nb==5){
                continue;
            }
            System.out.println("nb ne vaut pas 5");
            if(nb==10){
                jeContinue = false; // ou break;
            }
        }
    }
}
