package tp1;

public class Main {
    public static void main(String[] args) {
        Ejs ejs = new Ejs();
        /*System.out.println(ejs.exercise_1_c_iterative(2,3));
        System.out.println(ejs.exercise_1_c_recursive(2,3));*/
        /*System.out.println(ejs.exercise_2_c_iterative(6));
        System.out.println(ejs.exercise_2_c_recursive(6));*/
        int[] array = new int[4];
        array[0] = 1;
        array[1] = 8;
        array[2] = 5;
        array[3] = 10;
       // System.out.println(ejs.exercise_4_recursive(array));
        // System.out.println(ejs.exercise_6_b_iii_recursive(5));
        //System.out.println(ejs.exercise_8_iterative(array, 2));
        System.out.println(ejs.exercise_8_recursive(array, 2));
    }
}
