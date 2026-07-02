public class FloydsTriangle {
    public static void main(String[] args) {
        int size = 5;
        int a = 1;
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
