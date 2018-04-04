public class ChocolatesByNumbers {
    public static int solution(int N, int M){
        /*N is the number of chocolates available and thus the max amount able to be eaten
        * M is the number of the next chocolate to be eaten
        * The GCD represents the greeatest common divisor between N and M
        * So, N*M/GCD will be the greatest number of chocolates that can be eaten before hitting a wrapper * M
        */
        int chocolatesEaten = (N*M)/greatestCommonDivisor(N,M);
        chocolatesEaten /= M;
        return chocolatesEaten;
    }

    public static int greatestCommonDivisor(int a, int b){
        if(a % b == 0){
            return b;
        }
        else{
            return greatestCommonDivisor(b, a%b);
        }
    }
}
