import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FellowShipOfTheRing_1 {

    public static void main(String[] args) {
        // TODO Írd át, hogy minden Set-hez ebben a formátumban add hozzá a tagokat, ne használj sehol .add()-ot!

        Set<String> dwarves = new HashSet<>(Arrays.asList("Gimli"));

        Set<String> elves = new HashSet<>(Arrays.asList("Legolas"));

        Set<String> humans = new HashSet<>(Arrays.asList("Aragorn", " Boromir"));

        Set<String> hobbits = new HashSet<>(Arrays.asList("Frodo", "Samu","Trufa","Pippin"));

        //TODO Készíts egy Stringeket tartalmazó Set-et fellowship néven!
        // Add hozzá a népeket, használd az addAll() metódust! Ellenőrzésképp írasd ki a szövetség tagjait!
        // Ki maradt ki? :) Add hozzá a fellowship-hez a kimaradó Gandalfot!

        Set<String> fellowship = new HashSet<>();
        fellowship.addAll(dwarves);
        fellowship.addAll(elves);
        fellowship.addAll(humans);
        fellowship.addAll(hobbits);
        fellowship.add("Gandalf");

        System.out.println(fellowship);

        //TODO A Balrog magával rántotta Gandalfot, távolítsd el a szövetségből! Később Szürke Gandalf visszatér
        // Fehér Gandalfként: add hozzá a szövetséghez Gandalf the White-ot!

        fellowship.remove("Gandalf");
        fellowship.add("Gandal the White");

        System.out.println(fellowship);

        //TODO Távolítsd el a hobbitokat a szövetségből!
        // Ellenőrizd, hogy tényleg nem tagjai már a szövetségnek a containsAll() metódussal!

        fellowship.removeAll(hobbits);
        System.out.println(fellowship.containsAll(hobbits));

        System.out.println(fellowship);

        //TODO Ellenőrizd, hogy az Uruk-hai támadás után a szövetség tagja-e még Boromir!
        // Itt Boromirnak kapufa lett - pápá, törlés:)

        fellowship.remove("Boromir");
        System.out.println(fellowship);
    }
}


