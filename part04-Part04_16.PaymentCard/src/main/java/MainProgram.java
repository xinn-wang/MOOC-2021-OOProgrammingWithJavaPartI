public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard paulCard = new PaymentCard (20);
        PaymentCard mattiCard = new PaymentCard (30);
        
        paulCard.eatHeartily();
        mattiCard.eatAffordably();
        
        System.out.println("Paula: " + paulCard);
        System.out.println("Matti: " + mattiCard);
        
        paulCard.addMoney(20);
        
        mattiCard.eatHeartily();
        
        System.out.println("Paula: " + paulCard);
        System.out.println("Matti: " + mattiCard);
        
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        
        mattiCard.addMoney(50);
        
        System.out.println("Paula: " + paulCard);
        System.out.println("Matti: " + mattiCard);
    }
}


//import java.util.Scanner;
//
//public class MainProgram {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);  
//        
//        PaymentCard card = new PaymentCard(50);
//        System.out.println(card);
//
//        card.eatAffordably();
//        System.out.println(card);
//
//        card.eatHeartily();
//        card.eatAffordably();
//        System.out.println(card);
//    
//    }
//        // Here you can write code to test that PaymentCard works as intended
//        // be sure to erase the extra code for the last part of the exercise!
//
//    
//}
//public class MainProgram {
//    public static void main(String[] args) {
//        PaymentCard card = new PaymentCard(5);
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);
//
//        card.eatHeartily();
//        System.out.println(card);
//    }
//}

