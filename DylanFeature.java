public class DylanFeature {

    public int fizzBuzz(int n) {
        if (n % 15 == 0) {
            return 1;
        } else if (n % 3 == 0) {
            return 3;
        } else if (n % 5 == 0) {
            return 5;
        } else {
            return n;
        }
    }
}
