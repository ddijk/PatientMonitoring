package step_definitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import music.Artist;

import java.util.List;

/**
 * Created by dickdijk on 08/02/2017.
 */
public class AgeOfArtistsSteps {
    @Given("^the artists with their birthdate$")
    public void the_artists_with_their_birthdate(DataTable artists) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        System.out.println(artists);

        System.out.println(  artists.asList(Artist.class));

    }

    @Given("^the dossier$")
    public void the_dossier(DataTable dossier) throws Throwable {
      List<Burger> burgers =        dossier.asList(Burger.class);


        System.out.println(burgers);
    }

}
class Burger {
    String naam;
    String bsn;

    public Burger(String naam, String bsn) {
        this.naam = naam;
        this.bsn = bsn;
    }

    @Override
    public String toString() {
        return "Burger met naam " + naam+ "(bsn="+bsn+")";
    }
}
