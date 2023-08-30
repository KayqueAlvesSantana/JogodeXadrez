import Chess.ChessMatch;

public class jogodexadrez {
    public static void main(String [] args) {
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}
