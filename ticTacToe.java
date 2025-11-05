import java.util.Scanner;

class TicTacToe {

    public static boolean currentPlayer = false;
    public static char value = '.';
    public static int round = 1;

    public static char[][] board = {
            { '.', '.', '.' },
            { '.', '.', '.' },
            { '.', '.', '.' },
    };
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] params) {
        while (board[0][0] == '.' || board[0][1] == '.' || board[0][2] == '.' || board[1][0] == '.'
                || board[1][1] == '.' || board[1][2] == '.' || board[2][0] == '.' || board[2][1] == '.'
                || board[2][2] == '.') {
            choice();
            display();

        }
        scan.close();

    }

    public static void display() {
        for (char[] cs : board) {

            System.out.println(cs);
        }
    }

    public static void choice() {
        System.out.println("Numéro de ligne:");
        int ligne = scan.nextInt();
        scan.nextLine();
        System.out.println("Numéro de colonne:");
        int colonne = scan.nextInt();
        if (board[ligne - 1][colonne - 1] == '.') {
            round++;
            if (currentPlayer == true) {
                value = 'x';
            } else {
                value = 'o';
            }

            if ((0 < ligne && ligne < 4) && (0 < colonne && colonne < 4)) {
                board[ligne - 1][colonne - 1] = value;
                currentPlayer = !currentPlayer;

            }
        }
        ;
    }
}
