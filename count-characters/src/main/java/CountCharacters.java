

public class CountCharacters {
    public String countChar(String input){
        StringBuilder result = new StringBuilder();
        int count = 0;
        char [] array = input.toCharArray();

        for(int i = 1; i < array.length; i++){
            if(array[i -1] == array[i]){
                count += 1;
            }
            else{
                result.append((count+1) + "" + array[i-1]);
                count = 0;
            }
        }
        result.append((count+1) + "" + array[array.length-1]);
        return result.toString();
    }
}
