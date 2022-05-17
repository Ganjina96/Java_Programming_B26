package Office_Hours;

public class Sport {

    String name;
    int numOfPlayers;
    boolean teamBased;


    public void makeSport(String nameOfSport, int players, boolean teams){
        name = nameOfSport;
        numOfPlayers = players;
        teamBased = teams;
    }

    @Override
    public String toString() {
        return "The sport is " + name + " and has " + numOfPlayers + " players in teams " + teamBased;
    }

    public static void main(String[] args) {
        Sport soccer = new Sport();
        soccer.makeSport("Soccer", 22, true);
        System.out.println(soccer);
    }
}
