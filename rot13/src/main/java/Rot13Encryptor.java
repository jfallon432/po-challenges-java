import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Rot13Encryptor {
    private static final Map<Character, Character> characterMap = new HashMap<>();

    static {
        for(char i = 65; i<=77; i++){
            characterMap.put(i, (char) (i+13));
        }

        int j = 0;
        for(char i = 78; i<=90; i++){
            characterMap.put(i, (char) (65 + j++));
        }

        for(char i = 97; i<= 109; i++){
            characterMap.put(i, (char) (i + 13));
        }

        j=0;
        for(char i = 110; i<=122; i++){
            characterMap.put(i, (char) (97 + j++));
        }
    }

    public String encrypt(String message){
        StringBuilder encryptedMessage = new StringBuilder(message);
        for(int i = 0; i< encryptedMessage.length(); i++){
            if(characterMap.containsKey(encryptedMessage.charAt(i))){
                encryptedMessage.replace(i, i+1, characterMap.get(encryptedMessage.charAt(i)).toString());
            }
        }
        return encryptedMessage.toString();
    }
}
