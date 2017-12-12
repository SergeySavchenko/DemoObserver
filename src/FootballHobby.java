import java.util.ArrayList;
import java.util.List;

/**
 * Created by SergeySavchenko on 11.12.2017.
 */

public class FootballHobby {
    private List<Fan> fans;
    private String footballTeam;

    public FootballHobby() {
        this.fans = new ArrayList<Fan>();
    }

    public String getFootballTeam() {
        return footballTeam;
    }

    public void setFootballTeam(String footballTeam) {
        this.footballTeam = footballTeam;
        notifyAllFans();
    }

    public void attach(Fan fan) {
        fans.add(fan);
    }

    public void notifyAllFans() {
        System.out.println("New football team = \"" + footballTeam + "\"");
        for (Fan fan : fans) {
            fan.update();
        }
        System.out.println();
    }
}
