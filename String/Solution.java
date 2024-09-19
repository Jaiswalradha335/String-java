import java.util.Scanner;

class Solution {
    int isPalidrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return 0;
            }
            left++;
            right--;
        } 
        return 1;
    }
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        String  examples = sc.nextLine();
        // for(String s: examples){
            int results = solution.isPalidrome(examples);
            System.out.println((results==1?"it is paldromic":"it is not paldromic"));

        // }

    }
}