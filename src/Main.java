import java.util.*;
public class Main {
    public static int fibonacci(int i){
        //base case
        if(i == 0 || i == 1){
            return 1;
        }
        return fibonacci(i-2)+fibonacci(i-1);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}