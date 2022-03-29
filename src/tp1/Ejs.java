package tp1;

public class Ejs {
    public int exercise_1_c_iterative(int p, int n){
        int solution = 1;
        for (int i = 1; i <= n; i++) {
            solution += Math.pow(p, i);
        }
        return solution;
    }
    public int exercise_1_c_recursive(int p, int n){
           return exercise_1_c_recursive_aux(p, n, 0);
    }
    private int exercise_1_c_recursive_aux(int p, int n, int i ){
        if(i <= n){
            return (int)(Math.pow(p, i) + exercise_1_c_recursive_aux(p, n, ++ i ));
        }
        return 0;
    }
    public int exercise_2_c_iterative(int n){
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
    public int exercise_2_c_recursive(int n){
        return exercise_2_c_recursive_aux(n);
    }
    private int exercise_2_c_recursive_aux(int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return exercise_2_c_recursive_aux(n - 1) + exercise_2_c_recursive_aux(n - 2);
    }
    public boolean exercise_4_iterative(int[] array){
        int j= array.length -1;
        int i = 0;
        while(j > i){
            if(array[i] != array[j]) return false;
            i += 1;
            j -= 1;
        }
        return true;
    }
    public boolean exercise_4_recursive(int[] array){
        return exercise_4_recursive_aux(array,0, array.length -1);
    }

    private boolean exercise_4_recursive_aux(int[] array, int i, int j) {
        if(j <= i) return true;
        if(array[i] != array[j]) return false;
        return exercise_4_recursive_aux(array, i + 1, j - 1);
    }

    public int exercise_6_b_iii_iterative(int n){
        if(isAPrimeNumber(n) && n != 1) return 1;
        int counter = 0;
        for (int i = 1; i <=  n/2; i++) {
            if (n % i == 0 && isAPrimeNumber(i)) counter +=1;
        }
        return counter;
    }
    public boolean isAPrimeNumber(int n){
        if(n == 1) return false;
        int counter = 0;
        for (int i = 1; i <=  n/2 ; i++) {
            if(n % i == 0) counter += 1;
        }
        return counter <= 1;
    }
    public int exercise_6_b_iii_recursive(int n){
        if(isAPrimeNumber(n)) return 1 + exercise_6_b_iii_recursive_aux(n,1);
        return exercise_6_b_iii_recursive_aux(n, 1);
    }
    private int exercise_6_b_iii_recursive_aux(int n, int i) {
        if( i > n/2) return 0;
        if(n % i == 0 && isAPrimeNumber(i)) return 1 + exercise_6_b_iii_recursive_aux(n, i + 1);
        return exercise_6_b_iii_recursive_aux(n, i + 1);
    }
    public int exercise_8_iterative(int[] coefs, int n){
        int count = 0;
        for (int i = coefs.length - 1; i > 0 ; i--) {
            count += coefs[i]; // count es 0, le sumo el primer coeficiente.
            count = count * n; // multiplico el count por el valor de x. (n). Count seria lo de adentro del parentesis
        }
        return count + coefs[0]; // al final de to-do le sumo el ultimo num
    }
    public int exercise_8_recursive(int[] coefs, int n){
        return exercise_8_recursive_aux(coefs, n , 0);
    }
    // 3 -> 3*2= 6 -> 6+2 = 8 -> 8*2= 16 -> termina el for. 16+1 = 17

    // 3x^2 + 2x + 1

    private int exercise_8_recursive_aux(int[] coefs, int n, int pointer) {
        if(pointer == coefs.length - 1){
            return coefs[pointer];
        }else{
            return coefs[pointer] + n*exercise_8_recursive_aux(coefs, n, pointer + 1);
        }
    }
}
