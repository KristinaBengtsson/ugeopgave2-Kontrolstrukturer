public class Opgave20 {
    void main(){
        int monthlySaving = 1000;
        int months = 12;
        int totalSaving = 0;

        System.out.println("Beregning af opsparing ved en månedelig indbetaling på " + monthlySaving + " kr. i " + months + " måneder:");

        for(int i = 1; i <= months; i++){
            totalSaving += monthlySaving;
            System.out.println(i + " " + totalSaving + "kr.");
        }
        System.out.println("Den samlede opsparing efter " + months + " måneder er " + totalSaving + " kr.");
    }
}
