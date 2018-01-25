import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() == 0 && t.length() == 0){
            return true;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                int val = map.get(c);
                map.put(c, val + 1);
            }
        }
        for(char c : t.toCharArray()){
            if(!map2.containsKey(c)){
                map2.put(c,1);
            }
            else{
                int val = map2.get(c);
                map2.put(c, val + 1);
            }
        }
        return map.equals(map2);
    }
}