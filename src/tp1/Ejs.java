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
        }else{
            return 1;
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
}
