package Generic;

public class GenericMethodTest {
    private static <R> void printArray(R[] inputArray) {
        for (R element : inputArray) {
            System.out.printf("%s ", element);

        }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] inArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3,};
        Character[] charArray = {'H', 'E', 'L', 'L', 'o'};
        System.out.println("Array integerArray contains : ");
        printArray(inArray);
        System.out.println("Array doubleArray contains : ");
        printArray(doubleArray);
        System.out.println("Array CharacterArray contains : ");
        printArray(charArray);
    }
}
