public class AlphaNumericTriangle {
    public static void main(String[] args) {
        int size = 4;
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 0){
                    System.out.print((char)(64+j)+" ");
                }else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
