package cd.get.ready.algorithms;

public class EuclidsAlgorithm {

    public int gcd(int a, int b) {

        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            int newB = a % b;
            return gcd(b, newB);
        }
    }
}
