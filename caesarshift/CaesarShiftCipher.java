package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift){
        StringBuilder sb = new StringBuilder();
        char currentChar;
        int length = message.length();
        shift = shift % 26;
        for(int i = 0; i < length; i++){
            currentChar = message.charAt(i);
            if ((currentChar < 'a' || currentChar > 'z') && currentChar != ' ') {
                return "invalid";
            }
            if (currentChar == ' ') {
                sb.append(' ');
            } else {
                int newChar = (currentChar - 'a' + shift) % 26;
                if (newChar < 0) {
                    newChar += 26;
                }
                sb.append((char) ('a' + newChar));
            }
        }
        return sb.toString();
    }
}
