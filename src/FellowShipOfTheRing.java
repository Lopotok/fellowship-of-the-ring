import java.util.HashSet;
import java.util.Set;

public class FellowShipOfTheRing {
    public static void main(String[] args) {
       // TODO Készíts egy dwarves nevű Set-et, ami String-eket tárol és add hozzá Gimlit!

        Set<String> dwarves = new HashSet<>();
        dwarves.add("Gimli");

        //TODO Készíts egy elves nevű Set-et, ami String-eket tárol és add hozzá Legolast!

        Set<String> elves = new HashSet<>();
        elves.add("Legolas");

        //TODO Készíts egy humans nevű Set-et, ami String-eket tárol és add hozzá Aragornt és Boromirt!

        Set<String> humans = new HashSet<>();
        humans.add("Aragorn");
        humans.add("Boromir");

        //TODO Készíts egy hobbits nevű Set-et, ami String-eket tárol és add hozzá Frodót, Samut (Sam), Trufát (Merry),
        // és Pippint!

        Set<String> hobbits = new HashSet<>();
        hobbits.add("Frodo");
        hobbits.add("Samu");
        hobbits.add("Trufa");
        hobbits.add("Pippin");
    }
}
