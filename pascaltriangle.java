public class pascaltriangle {
    public static void main(String[] args) {
        int rows = 5;  // Number of rows in the Pascal's Triangle

        for (int i = 0; i < rows; i++) {
            // Printing spaces for formatting
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }

            // Moving to the next line
            System.out.println();
        }
    }
}