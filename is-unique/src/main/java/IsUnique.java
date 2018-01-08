import java.util.HashMap;

public class IsUnique {
    public boolean isUnique(String input){

        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        boolean isUnique = true;

        for(Character c : input.toCharArray()){
            if(!hashMap.containsKey(c)){
                hashMap.put(c, 1);
            }
            else{
                isUnique = false;
            }
        }

        return isUnique;
    }
}
