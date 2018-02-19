package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.*

/**
 * Based off of Stevie Wonder's "Superstition".
 *
 * Verse: Ebm7(add11) funk
 * Chorus: Bb7 (B7b5 - in alternate sequence) Bb7 A7(b5) Ab9 B7(#9)(#5)
 * return to Verse
 */
object MinorFunk : falrm.topologica.harmony.Orbit {
	override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
		c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root + 7, Dom9)
		c.isDominant -> falrm.topologica.harmony.chord.Chord(c.root - 7, min11)
		else -> falrm.topologica.harmony.chord.Chord(c.root, min11)
	}

	override fun back(c: falrm.topologica.harmony.chord.Chord): falrm.topologica.harmony.chord.Chord = forward(c)
}