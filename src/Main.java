import java.util.*;
public class Main {
    public static int fibonacci(int i){
        Stack<Integer> stack = new Stack<>();
        stack.push(i);
        int res = 0;
        while(!stack.isEmpty()) {
            int x = stack.pop();
            if( x == 0 || x == 1) {
                res += 1;
            } else {
                stack.push(x-1);
                stack.push(x-2);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(5));`
    }
}