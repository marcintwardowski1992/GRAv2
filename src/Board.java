import java.util.HashMap;
import java.util.Random;

/**
 * Created by adami on 18.01.2020.
 */
public class Board {


    HashMap<Integer,MonsterClass> myBoard = new HashMap<>();

    public Board setBoard(){

        /*HashMap<Integer,MonsterClass> myBoard = new HashMap<>();*/
        MonsterClass player = new MonsterClass();
        player.playerGenerator(player);
        myBoard.put(-1,player);


        for (int i=0 ; i<=10; i++){
            MonsterClass mm = new MonsterClass();
            mm.monsterGeneratorInitialization();
            myBoard.put(i,mm);
        }

        return this;
    }
    public Board setBoardPosition(int position, MonsterClass monsterClass) {

        myBoard.put(position, monsterClass);
        return this;

    }
    public HashMap<Integer, MonsterClass> getMonsterBoardHashMap(){

        return myBoard;
    }

    public Board getMonsterBoardBoard(){

        return this;
    }


    public void printBoard1(Board board1){

        HashMap hashMap1 = board1.getMonsterBoardHashMap();
        hashMap1.forEach((k, v) -> {
            MonsterClass value1 = (MonsterClass) v;
            System.out.println(k);
            value1.getInfo();

        });
    }

    public int whereIsPlayer(Board board1){

        HashMap hashMap1 = board1.getMonsterBoardHashMap();

        final int[] pole1 = new int[1];
        final int[] i = {-1};

        hashMap1.forEach((k, v) -> {
                    MonsterClass value1 = (MonsterClass) v;

            if (value1.getMonsterID()==0){
              pole1[0] = i[0];
            }
            i[0]++;
        });
        System.out.println("Pozycja człowieka " + pole1[0]);
        return pole1[0];
    }

    public MonsterClass whatIsUnderPosition(int position, Board board){
        HashMap hashMap1 = board.getMonsterBoardHashMap();
        MonsterClass value = (MonsterClass) hashMap1.get(position);

        return value;
    }

    public int playerCurrentHP(Board board){
        HashMap hashMap1 = board.getMonsterBoardHashMap();

        final int[] pole1 = new int[1];
        final int[] i = {-1};

        hashMap1.forEach((k, v) -> {
            MonsterClass value1 = (MonsterClass) v;

            if (value1.getMonsterID()==0){
                pole1[0] = value1.getHP();
            }
            i[0]++;
        });
        System.out.println("HP człowieka " + pole1[0]);
        return pole1[0];
    }
}
