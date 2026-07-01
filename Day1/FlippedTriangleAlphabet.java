public class FlippedTriangleAlphabet {
    public static void main(String[] args) {
        int size = 4;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size - i + 1; j++){
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
