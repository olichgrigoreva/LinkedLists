package iteko;

public class Shadow {
    int i = 1;

    public static void main(String[] args) {
        int i = 2;
        change_i(i);
        System.out.println(i);
    }

    private static void change_i(int i) {
        i = 3;
        i *= 2;
    }
}
