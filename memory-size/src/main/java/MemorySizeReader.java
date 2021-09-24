import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static java.lang.Math.*;

public class MemorySizeReader {

    private static String[] unitTypes = new String[3];

    static{
        unitTypes[0] = "MB";
        unitTypes[1] = "GB";
        unitTypes[2] = "TB";
    }

    public static String actualMemorySize(String size) throws IllegalArgumentException{
        int index;
        int number = 0;

        try {
            number = Integer.parseInt(size.substring(0, size.length() - 2));
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("Incorrect Input");
        }

        switch(size.toUpperCase().substring(size.length() - 2)){
            case "MB":
                index = 0;
                break;
            case "GB":
                index = 1;
                break;
            case "TB":
                index = 2;
                break;
            default:
                throw new IllegalArgumentException("Incorrect Input");
        }

        double realSize = number - 7.0/100.0 * ((double) number);

        if(realSize < 1 && index !=0){
            index--;
            realSize = realSize * 1000;
        }
        if(index == 0){
            return round(realSize * 100)/100 + unitTypes[index];
        }

        return round(realSize * 100.0)/100.0 + unitTypes[index];
    }

}
