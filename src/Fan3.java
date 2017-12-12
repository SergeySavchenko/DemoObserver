/**
 * Created by SergeySavchenko on 12.12.2017.
 */
public class Fan3 extends Fan {
    private FootballHobby footballHobby;

    public Fan3(FootballHobby footballHobby) {
        this.footballHobby = footballHobby;
        this.footballHobby.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Fan of backetball: I don't care about " + footballHobby.getFootballTeam());
    }
}
