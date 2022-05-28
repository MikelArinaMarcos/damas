public class ChessBoard {
    int dimension;
    char caracter1;
    char caracter2;
    char board;

    ChessBoard(int dimension, char caracter1, char caracter2)
    {
        this.dimension = dimension;
        this.caracter1 = caracter1;
        this.caracter2 = caracter2;

        board = new char[dimension][dimension];

        for(int i = 1; i < dimension; i++){
            for(int j = 1; j < dimension; j++){
                board[i][j] = caracter1;
            }
        }
    }
}
