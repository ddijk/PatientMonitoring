package music;

import java.time.LocalDate;

/**
 * Created by dickdijk on 08/02/2017.
 */
public class Artist {

    String name;

    String birthDate;

    public Artist(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "naam="+name+", geboortedatum="+birthDate;
    }
}
