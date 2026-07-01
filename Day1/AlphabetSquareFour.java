public class AlphabetSquareFour {
    public static void main(String[] args) {
        int size = 4;
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                char letter;
                if(i % 2 == 0){
                    letter = (char)(64 + i);
                } else {
                    letter = (char)(96 + i);
                }
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
