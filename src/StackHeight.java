public class StackHeight {
    public static int calPower(int x, int n){
        if (n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        int xPownm1 = calPower(x , n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int ans = calPower(2,5);
        System.out.println(ans);
    }
}
