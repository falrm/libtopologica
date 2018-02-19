package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord

object CircleOfFifths : falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = falrm.topologica.harmony.chord.Chord(c.root - 7, c.extension)
    override fun back(c: falrm.topologica.harmony.chord.Chord) = falrm.topologica.harmony.chord.Chord(c.root + 7, c.extension)
}