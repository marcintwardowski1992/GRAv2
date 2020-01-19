import java.util.HashMap;

/**
 * Created by adami on 19.01.2020.
 */
public class Round {



    public Board getMove(Board board1){

        int player = board1.whereIsPlayer(board1);

        MonsterClass player1 = board1.whatIsUnderPosition(player,board1);
        System.out.println(player);
        player1.getInfo();
        MonsterClass monster1 = board1.whatIsUnderPosition( player + 1,board1);
        System.out.println(player+1);
        monster1.getInfo();

        player1.setHP(player1.getHP()-monster1.getAT());
        if (player1.getHP()>0){
            board1.whereIsPlayer(board1);
            board1.setBoardPosition(player+1,player1);
        }else {
            System.out.println("Dead ");
        }
    return board1;

    }

}
