public class Opgave24 {
    void main(){
        int[] scores = {85, 92, 78, 88, 95, 73, 90};
        int min = scores[0]; //Start med første element
        int max = scores[0];
        double sum = 0;
        int scoreAbove80 = 0;

        System.out.println("--- Score oversigt ---");

        //Find laveste score
        for(int i = 1; i< scores.length; i ++){
            if(scores[i] < min) {
                min = scores[i];
            }
        }
        System.out.println("Den laveste score er: " + min);

        //Find højeste score
        for(int i = 1; i < scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        System.out.println("Den højeste score er: " + max);

        //Find gennemsnittet
        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        System.out.println("Den gennemsnitlige score er: " + (sum / scores.length));

        //Antal over 80
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > 80){
                scoreAbove80++;
            }
        }
        System.out.println("Score over 80: " + scoreAbove80);
    }
}
