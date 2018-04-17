package airport;

public class Airplane {

    private String airplaneId ;
    private int maxNumberOfPax;
    private int currentPaxOnBoard;
    private boolean airplaneFlying;
    private int airplaneCruiseSpeed;

    public Airplane (String newAirplaneId) {airplaneId = newAirplaneId; int newCurrentPaxOnBoard; }


    void loadPax(int currentPaxOnBoard){
        System.out.println("Plane with registration " + airplaneId + " loaded " + currentPaxOnBoard + " PAX.");
    }

    void takeOff (){
        System.out.println("Plane with id " +airplaneId + " is taking off!");
    }

    void landing(){
        System.out.println("The airplane with registration " +airplaneId+ " has been landed");
    }


    void unloadPax(int currentPaxOnBoard) {
        System.out.println("Plane with registration " + airplaneId + " unloaded " + currentPaxOnBoard + " PAX.");

    }

}
