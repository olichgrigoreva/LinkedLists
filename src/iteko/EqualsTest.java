package iteko;

public class EqualsTest {
    private static class Cat{
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 5, 4);
        Cat cat2 = new Cat("Barsik", 5, 4);

        Boolean same = cat1 == cat2;
        System.out.println(same);
        Boolean equals = cat1.equals(cat2);
        System.out.println(equals);
    }
}
