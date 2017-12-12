/**
 * Created by SergeySavchenko on 11.12.2017.
 */
public class Main {
    public static void main(String[] args) {
        FootballHobby footballHobby = new FootballHobby();
        Fan1 fan1 = new Fan1(footballHobby);
        Fan2 fan2 = new Fan2(footballHobby);
        Fan3 fan3 = new Fan3(footballHobby);
        footballHobby.setFootballTeam("Dynamo");
        footballHobby.setFootballTeam("Shakhtar");
    }
}
