import java.util.*;

public class Solution {
    private String magazine;
    private String note;

    public Solution(String magazine, String note) {
        this.magazine = magazine;
        this.note = note;
    }

    public boolean solve() {
        HashMap<String, Integer> magazineMap = new HashMap<String, Integer>();

        for(String m : magazine.split(" ")){
            if(magazineMap.containsKey(m)){
                magazineMap.put(m, magazineMap.get(m)+1);
            }
            else{
                magazineMap.put(m, 1);
            }
        }

        for(String n : note.split(" ")){
            if(!magazineMap.containsKey(n) || magazineMap.get(n) == 0){
                return false;
            }
            magazineMap.put(n, magazineMap.get(n)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        Solution s = new Solution(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
