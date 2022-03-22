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
        }else{
            return 0;
        }

    }
}
