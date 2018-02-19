package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.AUGMENTED
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.MAJOR
import falrm.topologica.harmony.chord.NONEXISTENT

object FlatNaturalSharpNine: falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = when (c.heptatonics.second) {
        NONEXISTENT -> c.plus(2)
        MAJOR -> c.substituteIfPresent(2, 3)
        else -> c.substituteIfPresent(1, 2)
    }

    override fun back(c: falrm.topologica.harmony.chord.Chord) = when (c.heptatonics.second) {
        AUGMENTED -> c.substituteIfPresent(3, 2)
        MAJOR -> c.substituteIfPresent(2, 1)
        else -> c.substituteIfPresent(2, 1)
    }
}

