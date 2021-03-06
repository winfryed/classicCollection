package Werke.Schubert;

import Basic.Bezeichnungsarten.WerkBezeichnung;
import Basic.Bezeichnungsarten.WerkartNummerTonartOpus;
import Basic.Nummer;
import Basic.opus.Opus;
import Basic.Song;
import Basic.Tonart;
import Komponisten.Komponist;
import Komponisten.Schubert;
import Werkarten.Klaviertrio;

/**
 * @author Matthias Weigt -- 22.12.2021.
 */
public class SchubertKlaviertrio2 extends Song {
    private static final Komponist KOMPONIST = new Schubert();
    private static final WerkBezeichnung BEZEICHNUNG =  new WerkartNummerTonartOpus(new Klaviertrio(),new Nummer(2),new Tonart("Es",true),new Opus("100"));
    private static final String BESCHREIBUNG = "Dieses Klaviertrio ist mein liebstes überhaupt. Ich weis nicht genau, was es ist das den 2. Satz für mich so besonders macht, aber er löst bei jedem hören viele Emotionen in mir aus. ";


    public SchubertKlaviertrio2() {
        super(KOMPONIST, BEZEICHNUNG, BESCHREIBUNG);
    }
}
