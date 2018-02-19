package falrm.topologica.harmony

/**
 * Created by jonlatane on 5/5/17.
 */
import falrm.topologica.harmony.chord.*

interface Orbit {
    fun forward(c: falrm.topologica.harmony.chord.Chord): falrm.topologica.harmony.chord.Chord
    fun back(c: falrm.topologica.harmony.chord.Chord): falrm.topologica.harmony.chord.Chord
}