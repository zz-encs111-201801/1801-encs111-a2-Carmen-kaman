package q7_power;

public class Solution {
    public int power(int base, int power) {
//        int baseNmuber = base;
//        int powerNumber = power;
//        if ( powerNumber == 0){
//            return 1;
//        } else {
//            int result = 1;
//            for (int i = 0; i < powerNumber; i++) {
//                result = result * baseNmuber;
//            }
//            return result;
//        }
        if (base == 1) {
            return 1;
        }else if (power == 0) {
            return 1;
        }else if (power == 1){
            return base;
        }
        else {
            return power(base, power-1) * base;
        }

    }
}
