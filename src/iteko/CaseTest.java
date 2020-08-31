package iteko;

public class CaseTest {
    private static void caseTest(int arg) {
        switch (arg) {
            case 1:
                System.out.print("a");
            case 2:
                System.out.print("b");
            case 3:
                System.out.print("c");
        }
    }

    public static void main(String[] args) {
        caseTest(3);
        caseTest(2);
        caseTest(1);
    }
}
