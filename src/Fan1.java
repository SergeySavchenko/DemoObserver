/**
 * Created by SergeySavchenko on 11.12.2017.
 */
public class Fan1 extends Fan {
    private FootballHobby footballHobby;

    public Fan1(FootballHobby footballHobby) {
        this.footballHobby = footballHobby;
        this.footballHobby.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Fan of " + footballHobby.getFootballTeam() + ": " + footballHobby.getFootballTeam() + " is a champion!");
    }
}
