import java.util.HashMap;

/**
 * Created by adami on 14.01.2020.
 */
public class main {

    public static void main(String[] args) {



/*
        MonsterClass monster1 = new MonsterClass();
        monster1.monsterGeneratorInitialization();
        monster1.getInfo();
        MonsterClass monster2 = new MonsterClass();
        monster2.monsterGeneratorInitialization();
        monster2.getInfo();
        MonsterClass monster3 = new MonsterClass();
        monster3.monsterGeneratorInitialization();
        monster3.getInfo();*/



        Board board = new Board();
       /* board.setBoard2(monster1);*/
        board = board.setBoard();
        board.printBoard1(board);

        Round round = new Round();


        for (int i = 0 ; i<=10; i++){
            System.out.println("-------------Runda------------ " + i);
            board = round.getMove(board);
            int currentHP = board.playerCurrentHP(board);
            if (currentHP<=0){
                System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx");
                break;
            }

       }
       if (board.whereIsPlayer(board)==10){
            System.out.println("WON");
        }
       board.whereIsPlayer(board);
        board.playerCurrentHP(board);

    }
}
