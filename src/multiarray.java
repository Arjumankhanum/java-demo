public class multiarray {
    public static void main(String[] args) {
        int array[][] = {
                {2, 8, 1},
                {5, 2, 8},
                {4, 0, 2}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}