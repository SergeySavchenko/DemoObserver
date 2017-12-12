/**
 * Created by SergeySavchenko on 12.12.2017.
 */
public class Fan2 extends Fan {
    private FootballHobby footballHobby;

    public Fan2(FootballHobby footballHobby) {
        this.footballHobby = footballHobby;
        this.footballHobby.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Fan of other team: " + footballHobby.getFootballTeam() + " is not a champion!");
    }
}
