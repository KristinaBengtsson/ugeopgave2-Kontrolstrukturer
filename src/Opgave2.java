public class Opgave2 {
    double weight = 84.4;
    double height = 1.81;

    void main(){
        double bmi = weight / (height * height);
        System.out.println(bmi);

        if(bmi >= 25){
            System.out.println("Du er overvægtig.");
        } else if (bmi >= 18.5) {
            System.out.println("Din vægt er normal.");
        } else {
            System.out.println("Du er undervægtig.");
        }

    }
}
