import java.util.Scanner;

class TicTacToe {

    public static boolean currentPlayer = false;
    public static char value = '.';
    public static boolean win = false;

    public static char[][] board = {
            { '.', '.', '.' },
            { '.', '.', '.' },
            { '.', '.', '.' },
    };
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] params) {

        game();
        scan.close();

    }

    public static void display() {
        for (char[] cs : board) {

            System.out.println(cs);
        }
        System.out.println("------------");
    }

    public static void choice() {
        System.out.println("Numéro de ligne:");
        int ligne = scan.nextInt();
        scan.nextLine();
        System.out.println("Numéro de colonne:");
        int colonne = scan.nextInt();
        if (board[ligne - 1][colonne - 1] == '.') {
            if (currentPlayer == true) {
                value = 'x';
            } else {
                value = 'o';
            }

            if ((0 < ligne && ligne < 4) && (0 < colonne && colonne < 4)) {

                board[ligne - 1][colonne - 1] = value;
                currentPlayer = !currentPlayer;

            }
        } else {
            System.out.println("Choississez une cellule valide ");
            scan.nextLine();

        }
        ;
    }

    public static void game() {

        while ((board[0][0] == '.' || board[0][1] == '.' || board[0][2] == '.' || board[1][0] == '.'
                || board[1][1] == '.' || board[1][2] == '.' || board[2][0] == '.' || board[2][1] == '.'
                || board[2][2] == '.') && win == false) {

            choice();
            display();

            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == board[i][1] && board[i][0] == board[i][2])
                        && (board[i][0] == 'x' || board[i][0] == 'o')) {
                    win = true;
                    display();
                    System.out.println("Le joueur " + value + " a gagné");
                    break;

                }

                else if ((board[0][i] == board[1][i] && board[0][i] == board[2][i])
                        && (board[0][i] == 'x' || board[0][i] == 'o')) {
                    win = true;
                    display();
                    System.out.println("Le joueur " + value + " a gagné");
                    break;

                } else if ((board[0][0] == board[1][1] && board[0][0] == board[2][2])
                        && (board[0][0] == 'x' || board[0][0] == 'o')) {
                    win = true;
                    display();
                    System.out.println("Le joueur " + value + " a gagné");
                    break;

                } else if ((board[0][2] == board[1][1] && board[0][2] == board[2][0])
                        && (board[1][1] == 'x' || board[1][1] == 'o')) {
                    win = true;
                    display();
                    System.out.println("Le joueur " + value + " a gagné");
                    break;

                }
            }

        }
        if (win == false) {
            System.out.println("Match nul !");
        }
    }
}
