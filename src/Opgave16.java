public class Opgave16 {
    void main(){
        int loan = 5000;
        int montlyPayment = 200;
        int months = 0;

        System.out.println("------ Beregning på tilbagebetaling på lån ------");
        System.out.println("Lånets størrelse: " + loan + "kr.");

        while (loan > 0){
            loan -= montlyPayment;
            months++;
            }
        System.out.println("Med et afdrag på " + montlyPayment + "kr. pr mdr.");
        System.out.println("Tager det " + months + " måneder at betale lånet af.");
    }
}