package generator;

import java.security.SecureRandom;

public class Password {
    
    private static SecureRandom randomNum = new SecureRandom();

    public static void main(String[] args) {
        System.out.println("Criando senha...");

        try {
            Thread.sleep(2500);
        }
        catch(InterruptedException interruptedException){
            System.err.printf("%nError: %s%n", interruptedException);
        }

        System.out.printf("%nSuggested Password: %s", generatePassword());
    }

    public static String generatePassword() {
        StringBuilder password = new StringBuilder(12);
        char character = ' ';
        int characterType;

        for(int c = 1; c <= 12; c++) {
            characterType = 1 + randomNum.nextInt(4);

            switch(characterType){
                //Lowercase
                case 1:
                character = (char) (97 + randomNum.nextInt(26));
                break;
                //Uppercase
                case 2:
                character = (char) (65 + randomNum.nextInt(26));
                break;
                //Numbers
                case 3:
                character = (char) (48 + randomNum.nextInt(10));
                break;
                //Symbols
                case 4:
                character = (char) (35 + randomNum.nextInt(4));
            }

            password.append(character);
        }
        
        return password.toString();
    }
}