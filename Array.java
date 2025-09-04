public class Array {
    public static void main(String[] args) {
        int array [] = {1,2,3};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        int array1 [] = new int[4];

        array1[0]  = 1;
        array1[1] = 2;
        array1[2] = 3;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array1[i] + " ");
        }
    }
}
