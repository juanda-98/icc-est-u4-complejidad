public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        int numero = 10;
        int [] array = new int[] {1, 2, 3, 4, 5};
        System.out.println(numero);
        System.out.println(array);
        for (int i=0; i < array.length; i++) { // for each (desde;mientras;incremento)
            System.out.println(array[i]);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
