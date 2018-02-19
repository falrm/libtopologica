package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.Maj7
import falrm.topologica.harmony.chord.min7

object AlternatingMajorMinorSeconds: falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root + 1, Maj7)
        else -> falrm.topologica.harmony.chord.Chord(c.root + 2, min7)
    }

    override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root - 2, Maj7)
        else -> falrm.topologica.harmony.chord.Chord(c.root - 1, min7)
    }
}