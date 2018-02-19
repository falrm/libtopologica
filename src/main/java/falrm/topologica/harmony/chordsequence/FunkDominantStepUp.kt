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
object FunkDominantStepUp : falrm.topologica.harmony.Orbit {
	override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
		c.isDominant && !c.hasAugmented5 -> when {
			else -> falrm.topologica.harmony.chord.Chord(c.root + 2, Dom7Sharp5 + A2)
		}
		else -> c
	}

	override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
		c.isDominant && c.hasAugmented5 -> falrm.topologica.harmony.chord.Chord(c.root - 2, Dom9)
		else -> c
	}
}