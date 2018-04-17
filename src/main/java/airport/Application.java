package airport;

public class Application {
    public static void main(String[] args) {

        Airplane plane1 = new Airplane("ABC123");
        Airplane plane2 = new Airplane("DDD888");
        plane1.loadPax(43);
        plane1.takeOff();
        plane2.loadPax(23);
        plane1.landing();
        plane1.unloadPax(43);
        plane2.takeOff();
        plane2.landing();
        plane2.unloadPax(23);


    }
}
