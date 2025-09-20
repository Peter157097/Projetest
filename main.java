public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int [3][3];
        int i,j;

        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                matrix[i][j] = scanner.nextInt();
            }
            
        }
    }
}
