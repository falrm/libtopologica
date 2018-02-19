package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord

object DimMinDomMajAug : falrm.topologica.harmony.Orbit {
    override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isDiminished -> c.substituteIfPresent(6, 7)
        c.isMinor -> c.substituteIfPresent(3, 4).substituteIfPresent(11, 10)
        c.isDominant -> c.substituteIfPresent(10, 11)
        else -> c.substituteIfPresent(7, 8)
    }

    override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
        c.isAugmented -> c.substituteIfPresent(8, 7)
        c.isMinor -> c.substituteIfPresent(7, 6)
        c.isMajor && !c.isDominant -> c.substituteIfPresent(11, 10)
        else -> c.substituteIfPresent(4, 3)
    }
}