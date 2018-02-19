package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.Dom7
import falrm.topologica.harmony.chord.Maj6
import falrm.topologica.harmony.chord.Maj7

/**
 * Like [TwoFiveOne] but less graceful. Assumes any M7 chord is a IV, any other non-dominant
 * major chord is a I and any minor chord is a iv.
 */
object FourFiveOne: falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root - 7, Dom7) // ii-V - is a discontinuity
        c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root - 7, Maj6) // V-I
        c.hasMajor7 -> falrm.topologica.harmony.chord.Chord(c.root + 2, Dom7) // IV-V
        else -> falrm.topologica.harmony.chord.Chord(c.root + 5, Maj7) // I-IV
    }

    override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root - 7, Maj6) // ii-I
        c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root - 2, Maj7) // V-IV
        c.hasMajor7 -> falrm.topologica.harmony.chord.Chord(c.root - 5, Maj6) // IV-I
        else -> falrm.topologica.harmony.chord.Chord(c.root + 7, Dom7) // I-V
    }
}