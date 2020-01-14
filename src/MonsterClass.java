/**
 * Created by adami on 14.01.2020.
 */
public class MonsterClass extends MonsterRandomGenerator {

    int monsterID;
    String race;
    int HP;
    int AT;

    public MonsterClass(int monsterID, String race, int HP, int AT) {
        this.monsterID = monsterID;
        this.race = race;
        this.HP = HP;
        this.AT = AT;
    }

    public MonsterClass() {

    }

    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAT() {
        return AT;
    }

    public void setAT(int AT) {
        this.AT = AT;
    }

    public void getInfo(){
        System.out.println(getMonsterID() + " " + getRace()+" "+getHP()+ " " + getAT());
    }
    public void monsterGeneratorInitialization(){
        monsterRaceGenerator(this);
    }
}
