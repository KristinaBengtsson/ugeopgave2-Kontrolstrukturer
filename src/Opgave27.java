public class Opgave27 {
    void main(){
        double[] prices = {299.0, 149.0, 899.0, 49.0};
        double sum = 0.0;

        //Sum af alle
        for (double price : prices){
            sum += price;
        }
        System.out.println("Den totale pris: " + sum + " kr.");

    }
}
