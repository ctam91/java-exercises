public class ReverseString {

    public String reverseString(String input){
        StringBuilder result = new StringBuilder();
        for(int index = input.length()-1; index >= 0; index--){
            result.append(input.charAt(index));
        }
        return result.toString();
    }
}
