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
        HashMap dupa1 = board.setBoard4();
        board.printBoard1(dupa1);

        Round round = new Round();

        int pole = board.whereIsPlayer(board);
        System.out.println(pole);
    }
}
