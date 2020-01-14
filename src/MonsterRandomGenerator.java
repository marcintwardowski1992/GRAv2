import java.util.Random;

/**
 * Created by adami on 14.01.2020.
 */
public class MonsterRandomGenerator{



    void monsterRaceGenerator(MonsterClass y){

        int x = randomIntGenerator();
        y.setMonsterID(x);
        randomDeliver().nextInt();


        switch (x){
            case 1:
              y.setRace("Ork");
              y.setHP(randomDeliver().nextInt(10-5+1)+5);
              y.setAT(randomDeliver().nextInt(10-5+1)+5);
              break;
            case 2:
                y.setRace("Dupol");
                y.setHP(randomDeliver().nextInt(3-2+1)+2);
                y.setAT(randomDeliver().nextInt(3-2+1)+2);
                break;
            case 3:
                y.setRace("Smok");
                y.setHP(randomDeliver().nextInt(100-70+1)+70);
                y.setAT((randomDeliver().nextInt(100-70+1)+70));
                break;
        }
    }

    int randomIntGenerator(){
        Random generator = new Random();
        int i = generator.nextInt(3-1+1)+1;
        return i;
    }

    Random randomDeliver(){
        Random generator = new Random();
        return generator;
    }
}
