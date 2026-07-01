public class AlphabetSquare {
    public static void main(String[] args) {
        int size = 4;
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                char letter = (char)(64 + j); 
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
