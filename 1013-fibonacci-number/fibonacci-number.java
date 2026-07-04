
class Solution{
    public int fib(int n){
        if(n<=1){
            return n;
        }
        int a=0;
        int b=1;
        for(int i=2;i<=n;i++){
            int current=a+b;
            a=b;
            b=current;
        }
        return b;

    }
}
// class Solution {
//     public int fib(int n) {
//         if(n==0){
//             return 0;
//         }
//         if(n==1){
//             return 1;
//         }
//         if(n<0){
//             return 0;
//         }
//         return fib(n-1)+fib(n-2);

//     }
// }