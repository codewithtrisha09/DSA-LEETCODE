class Solution {
    public boolean isPalindrome(String s) {
        char[]chars=s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<right){
            if(!Character.isLetterOrDigit(chars[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(chars[right])){
                right--;
            }
            else{
                if(Character.toLowerCase(chars[left])!=Character.toLowerCase(chars[right])){
                    return false;
                }
                left++;
                right--;
            }
            
        }
        return true;
    }
}
// class Solution {
//     public boolean isPalindrome(String s) {
//         String clean = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
//         return check(clean,0);
//     }
//     public boolean check(String s,int i){
//         int n=s.length();
//         if(i>=n/2){
//             return true;
//         }
//         if(s.charAt(i)!=s.charAt(n-1-i)){
//             return false;
//         }
//         return check(s,i+1);
//     }
// }