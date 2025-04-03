public class Factorial {
    public static int calcFactorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        int factnm1 = calcFactorial(n-1);
        int factn = n * factnm1;
        return factn;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calcFactorial(n);
        System.out.println(ans);
    }

}
