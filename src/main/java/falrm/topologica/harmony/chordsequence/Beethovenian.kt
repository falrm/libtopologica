package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.*

/**
 * Based off of the first theme of the sonata (3rd) movement of
 * Beethoven's Moonlight sonata (Op. 27, No. 2).
 *
 * Chord progression:
 *  C#m G# C#7 F#m6(*) Adim7 G#13add11(**) A13
 *
 *  (*) This is to differentiate from C#m
 *  (**) From here, you can use
 */
object Beethovenian : falrm.topologica.harmony.Orbit {
	val progression = listOf(
            falrm.topologica.harmony.chord.Chord(1, min)
	)
	override fun forward(c: falrm.topologica.harmony.chord.Chord): falrm.topologica.harmony.chord.Chord = c/*when {
		c.isMinor -> Chord(c.root + 7, Maj)
		c.isDominant -> Chord(c.root - P5, min)
		c.isMajor -> when {
			c.heptatonics.seventh == NONEXISTENT -> Chord(c.root - 7, Dom7)
			else -> TODO()
		}
	}*/

	override fun back(c: falrm.topologica.harmony.chord.Chord): falrm.topologica.harmony.chord.Chord = forward(c)
}