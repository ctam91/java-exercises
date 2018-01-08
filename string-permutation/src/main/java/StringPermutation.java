import java.util.Arrays;

public class StringPermutation {

    public boolean isPermutation(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        char [] string1Array = string1.toLowerCase().toCharArray();
        char [] string2Array = string2.toLowerCase().toCharArray();

        Arrays.sort(string1Array);
        Arrays.sort(string2Array);

        return Arrays.equals(string1Array, string2Array);
    }
}
