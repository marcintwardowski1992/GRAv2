import java.util.HashMap;
import java.util.Random;

/**
 * Created by adami on 18.01.2020.
 */
public class Board {


    HashMap<Integer,MonsterClass> myBoard4 = new HashMap<>();

    /*public void setBoard(){

        MonsterClass [][] myBoard = new MonsterClass[10][10];
        myBoard [0][0] = "[ * ]";
        System.out.println(myBoard [0][0]);
    }*/

    public void setBoard2(MonsterClass monster1){

        HashMap<Integer,MonsterClass> myBoard2 = new HashMap<Integer, MonsterClass>();
        myBoard2.put(1,monster1);
        System.out.println(myBoard2);
    }

    public HashMap setBoard4 (){



        /*HashMap<Integer,MonsterClass> myBoard4 = new HashMap<>();*/
        MonsterClass player = new MonsterClass();
        player.playerGenerator(player);
        myBoard4.put(-1,player);


        for (int i=0 ; i<=10; i++){
            MonsterClass mm = new MonsterClass();

            mm.monsterGeneratorInitialization();
            myBoard4.put(i,mm);


        }

        return myBoard4;
    }

    public HashMap<Integer, MonsterClass> getMonsterBoard4(){

        return myBoard4;
    }

    public HashMap setBoard3 (){
        Random generator = new Random();
        int y ;
        HashMap<Integer,Integer> myBoard3 = new HashMap<>();

        for (int i=0 ; i<=10; i++){
            y = generator.nextInt(100-1+1)+1;
            myBoard3.put(i,y);

        }

        return myBoard3;
    }
    public void printBoard(HashMap boardX){

        System.out.println(boardX);
       // boardX.forEach(System.out.println( boardX.get(i)));

    }

    public void printBoard1(HashMap boardX){

       /* MonsterClass value = (MonsterClass) boardX.get(0);
        value.getInfo();*/

        //MonsterClass mmg = new MonsterClass();
        // boardX.forEach(System.out.println( boardX.get(i)));

        boardX.forEach((k, v) -> {
           // System.out.format("key: %s, value: %d%n", k, v);
            MonsterClass value1 = (MonsterClass) v;
            System.out.println(k);
            value1.getInfo();

        });
    }

    public int whereIsPlayer(Board board1){

        HashMap hashMap1 = board1.getMonsterBoard4();

        final int[] pole1 = new int[1];
        final int[] i = {-1};

        hashMap1.forEach((k, v) -> {
            // System.out.format("key: %s, value: %d%n", k, v);
            MonsterClass value1 = (MonsterClass) v;

            /*System.out.println(k);
            value1.getInfo();*/
            if (value1.getMonsterID()==0){
              pole1[0] = i[0];
            }
            i[0]++;
        });
        return pole1[0];
    }
}
