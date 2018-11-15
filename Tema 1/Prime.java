public class Prime {
    public static void main(String[] args){
        int n = 50;
        int a;

        for (a = 2; a < n; a++) {
            if (isPrime(a))
                System.out.println(a);
            }
    }
     private static boolean isPrime(int m) {
        for (int i = 2; i < m; i++) {
            if(m % i == 0)
                return false;
        }
        return true;
     }
}
