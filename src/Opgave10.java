public class Opgave10 {
    void main(){
        String item = "Pizza"; //fejl ved lille forbogstav samt ved ingen indtastning
        int quantity = 2;
        double price = 0;

        switch (item) {
            case "Burger":
                price = 89.00;
                break;
            case "Pizza":
                price = 95.00;
                break;
            case "Salad":
                price = 65.00;
                break;
            case "Pasta":
                price = 79;
                break;
            case "Steak":
                price = 145;
                break;
            default:
                System.out.println("Der er ikke fortaget en bestilling.");
        }

        double total = price * quantity;

        System.out.println("Tak for din bestilling:");
        System.out.println(item + " pr stk: " + price + "kr.");
        System.out.println(quantity + " stk. Total pris: " + total + "kr.");
    }
}
