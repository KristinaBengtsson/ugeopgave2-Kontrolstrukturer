public class Opgave6 {
    void main(){
        int ageLimit = 15;
        int guestAge = 14;
        boolean hasParentConsent = true;

        if(ageLimit <= guestAge){
            System.out.println("Du må gerne se filmen.");
        }else if(ageLimit >= 13 && hasParentConsent == true){
            System.out.println("Du må gerne se filmen.");
        }else {
            System.out.println("Du må ikke se filmen.");
        }
    }
}
