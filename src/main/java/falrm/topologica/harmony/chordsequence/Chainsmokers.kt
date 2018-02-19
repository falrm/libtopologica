package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.*

// Based on "Something Just Like This"
object Chainsmokers: falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
        // D -> G(9)
        c.isMajor && c.heptatonics.second == NONEXISTENT
            -> falrm.topologica.harmony.chord.Chord(c.root - 7, MajAdd9)
        // Bm -> D
        c.isMinor && !c.hasMinor7 -> falrm.topologica.harmony.chord.Chord(c.root + 3, Maj)
        // Asus -> Bm
        c.isSus -> falrm.topologica.harmony.chord.Chord(c.root + 2, min)
        // G(9) -> Asus
        else -> falrm.topologica.harmony.chord.Chord(c.root + 2, sus)
    }

    override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
        // D -> Bm
        c.isMajor && c.heptatonics.second == NONEXISTENT
            -> falrm.topologica.harmony.chord.Chord(c.root - 3, min)
        // Bm -> Asus
        c.isMinor && !c.hasMinor7 -> falrm.topologica.harmony.chord.Chord(c.root - 2, sus)
        // Asus -> G(9)
        c.isSus -> falrm.topologica.harmony.chord.Chord(c.root - 2, MajAdd9)
        // G(9) -> D
        else -> falrm.topologica.harmony.chord.Chord(c.root + 7, Maj)
    }
}