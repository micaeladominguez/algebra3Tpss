package tp1;

import java.util.List;

public class Guide1RecursiveSolution implements Guide1{

    @Override
    public int exercise_1_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_c(int p, int n) {
        return exercise_1_c_recursive_aux(p, n, 0);
    }

    private int exercise_1_c_recursive_aux(int p, int n, int i) {
        if(i <= n){
            return (int)(Math.pow(p, i) + exercise_1_c_recursive_aux(p, n, ++ i ));
        }
        return 0;
    }

    @Override
    public int exercise_1_d(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_e(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_1_f(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_a(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_b(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_2_c(int n) {
        return exercise_2_c_recursive_aux(n);
    }

    private int exercise_2_c_recursive_aux(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return exercise_2_c_recursive_aux(n - 1) + exercise_2_c_recursive_aux(n - 2);
    }

    @Override
    public int exercise_2_d(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_3(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_4(int[] array) {
        return exercise_4_recursive_aux(array,0, array.length -1);
    }

    private boolean exercise_4_recursive_aux(int[] array, int i, int j) {
        if(j <= i) return true;
        if(array[i] != array[j]) return false;
        return exercise_4_recursive_aux(array, i + 1, j - 1);
    }

    @Override
    public boolean exercise_5(int[] array, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public boolean exercise_6_b_i(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_ii(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_6_b_iii(int n) {
        if(isAPrimeNumber(n)) return 1 + exercise_6_b_iii_recursive_aux(n,1);
        return exercise_6_b_iii_recursive_aux(n, 1);
    }

    private int exercise_6_b_iii_recursive_aux(int n, int i) {
        if( i > n/2) return 0;
        if(n % i == 0 && isAPrimeNumber(i)) return 1 + exercise_6_b_iii_recursive_aux(n, i + 1);
        return exercise_6_b_iii_recursive_aux(n, i + 1);
    }

    private boolean isAPrimeNumber(int n) {
        if(n == 1) return false;
        int counter = 0;
        for (int i = 1; i <=  n/2 ; i++) {
            if(n % i == 0) counter += 1;
        }
        return counter <= 1;
    }

    @Override
    public List<Integer> exercise_6_b_iv(int n) {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        return exercise_8_recursive_aux(coefs, n , 0);
    }
    private int exercise_8_recursive_aux(int[] coefs, int n, int pointer) {
        if(pointer == coefs.length - 1){
            return coefs[pointer];
        }else{
            return coefs[pointer] + n*exercise_8_recursive_aux(coefs, n, pointer + 1);
        }
    }
}
