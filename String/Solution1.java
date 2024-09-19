// /**
//  * Solution1
//  */
// public class Solution1 {
//     String reverseWords(String str){
//         String [] words = str.split(".");
//         StringBuilder reversedStr = new StringBuilder();
//         for(int i= words.length-1;i>=0;i--){
//             reversedStr.append(words[i]);
//             if(i != 0){
//                 reversedStr.append(".");

//             }
//         }
//         return reversedStr.toString();

//     }
//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         String str1 = "i.like.this.program.very.much";
//         String str2 = "pqr.mno";
//         System.out.println(solution.reverseWords(str1));
//         System.out.println(solution.reverseWords(str2));

        
//     }

    
// }
class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // Split the string by "."
        String[] words = str.split("\\.");
        
        // Create a StringBuilder to store the reversed result
        StringBuilder reversedStr = new StringBuilder();
        
        // Traverse the words array from the end to the beginning
        for (int i = words.length - 1; i >= 0; i--) {
            reversedStr.append(words[i]); // Append the word
            
            // Add a dot after each word except for the last one
            if (i != 0) {
                reversedStr.append(".");
            }
        }
        
        // Convert StringBuilder to string and return
        return reversedStr.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example input
        String str1 = "i.like.this.program.very.much";
        String str2 = "pqr.mno";
        
        // Output the reversed words
        System.out.println(solution.reverseWords(str1)); // much.very.program.this.like.i
        System.out.println(solution.reverseWords(str2)); // mno.pqr
    }
}
