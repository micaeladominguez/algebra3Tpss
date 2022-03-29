package tp1;

import tp1.Guide1;

import java.util.List;

public class Guide1IterativeSolution implements Guide1 {

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
        int solution = 1;
        for (int i = 1; i <= n; i++) {
            solution += Math.pow(p, i);
        }
        return solution;
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
        if(n > 1){
        int fib0 = 1;
        int fib1= 1;
        for (int i = 3; i <= n; i++) {
            int aux = fib0 + fib1;
            fib0= fib1;
            fib1= aux;
        }
        return fib1;
        }else if(n ==1 ){
            return 1;
        }else{
            return 0;
        }
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
        int j= array.length -1;
        int i = 0;
        while(j > i){
            if(array[i] != array[j]) return false;
            i += 1;
            j -= 1;
        }
        return true;
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
        if(isAPrimeNumber(n) && n != 1) return 1;
        int counter = 0;
        for (int i = 1; i <=  n/2; i++) {
            if (n % i == 0 && isAPrimeNumber(i)) counter +=1;
        }
        return counter;
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
        int count = 0;
        for (int i = coefs.length - 1; i > 0 ; i--) {
            count += coefs[i];
            count = count * n;
        }
        return count + coefs[0];
    }
}