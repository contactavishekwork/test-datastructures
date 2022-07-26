package edu.avishek.testdatastructures.java9features.anonclass;

public class AnonymousClassExample {

    public static void main(String[] args) {
        Test<String> stringTest = new Test<>() {
            @Override
            String show(String a, String b) {
                return a.concat(b);
            }
        };
        Test<Integer> integerTest = new Test<>() {
            @Override
            Integer show(Integer a, Integer b) {
                return a + b;
            }
        };

        System.out.println(stringTest.show("Java", "9"));
        System.out.println(integerTest.show(5, 9));
    }
}
