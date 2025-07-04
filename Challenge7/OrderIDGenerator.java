package Challenge7;

import java.util.Random;

public class OrderIDGenerator {
    public static void main(String[] args){
        Random random = new Random();
        String[] orderIDs = new String[5];

        for (int i=0; i<orderIDs.length; i++){
            //generate a random uppercase letter between A(65) and E(69)
            char prefix = (char)(random.nextInt(5)+'A');

            //generate a random number from 1 to 999 and format it with leading zeros
            int number = random.nextInt(999)+1;
            String suffix= String.format("%03d", number);

            //combine prefix and suffix to form the orderID
            orderIDs[i] = prefix+suffix;
        }

        //print all generated orderIDs
        for (String orderID : orderIDs){
            System.out.println(orderID);
        }
    }
}
