public class Opgave8 {
    void main(){
        int customerAge = 22;
        boolean hasAccidents = false;
        int accidents = 0;
        boolean riskZone = false;
        int baseCost = 5000;
        int highRiskCost = 2000;

        if(customerAge < 25 || customerAge > 70 || accidents >= 2 || riskZone == true){
            System.out.println("Højrisiko kunde");
            System.out.println("Årligt kontigent: " + (baseCost + highRiskCost) + "kr.");
        }else {
            System.out.println("Lavrisiko kunde");
            System.out.println("Årligt kontigent: " + baseCost + "kr.");
        }

    }
}
