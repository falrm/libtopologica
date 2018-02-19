package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.Dom7
import falrm.topologica.harmony.chord.Maj7
import falrm.topologica.harmony.chord.min7

/**
 * Two Five One is simple: Every chord is major, minor or dominant.  Treat these as I, ii and V.
 */
object TwoFiveOne : falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root - 7, Dom7)
        c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root - 7, Maj7)
        else -> falrm.topologica.harmony.chord.Chord(c.root + 2, min7)
    }

    override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root + 7, min7)
        c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root - 2, Maj7)
        else -> falrm.topologica.harmony.chord.Chord(c.root + 7, Dom7)
    }
}