public class CodeupCrypt {
    public static double version;
    public static String hashPassword(String input){
        String hashed = "";
        for(char character : input.toCharArray()){
            switch(character){
                case 'a':
                case 'A':
                    hashed += 4;
                    break;
                case 'e':
                case 'E':
                    hashed += 3;
                    break;
                case 'i':
                case 'I':
                    hashed += 1;
                    break;
                case 'o':
                case 'O':
                    hashed += 0;
                    break;
                case 'u':
                case 'U':
                    hashed += 9;
                    break;
                default:
                    hashed += character;
            }
        }
        return hashed;
    }
    public static boolean checkPassword(String password, String hashed){
        return hashed.equals(hashPassword(password));
    }
}
