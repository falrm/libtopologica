package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.Dom7
import falrm.topologica.harmony.chord.min7
import falrm.topologica.harmony.chord.minMaj7

/**
 * Two Five One is simple: Every chord is major, minor or dominant.  Treat these as I, ii and V.
 */
object TwoFiveOneMinor : falrm.topologica.harmony.Orbit {
	override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
		c.isDiminished -> falrm.topologica.harmony.chord.Chord(c.root - 7, Dom7).plus(1) // V7b9
		c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root - 7, minMaj7) // iM7
		else -> falrm.topologica.harmony.chord.Chord(c.root + 2, min7).substituteIfPresent(7, 6) // ii7b5
	}

	override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
		c.isDiminished -> falrm.topologica.harmony.chord.Chord(c.root - 2, minMaj7) // iM7
		c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root + 7, min7).substituteIfPresent(7, 6) // ii7b5
		else -> falrm.topologica.harmony.chord.Chord(c.root + 7, Dom7).plus(1) // V7b9
	}
}