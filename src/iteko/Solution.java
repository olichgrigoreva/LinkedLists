package iteko;

public class Solution {
    public static void main(String[] args) {
        if (a() && b() || c()){
            System.out.println("D");
        }
        //a, c, D
    }

    private static boolean a() {
        System.out.println("a");
        return false;
    }

    private static boolean b() {
        System.out.println("b");
        return true;
    }
    private static boolean c() {
        System.out.println("c");
        return true;
    }
}
