package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.*

/**
 * Two Five One is simple: Every chord is major, minor or dominant.  Treat these as I, ii and V.
 */
object FunctionalBase : falrm.topologica.harmony.Orbit {
	override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
		c.isMinor -> when {
			c.hasMajor7 -> c.changeRoot(M2).with(m3) // imM7 -> ii
			c.hasMinor2 -> c.changeRoot(-M2) // iii -> ii
			c.hasMinor6 -> c.changeRoot(-P5) // vi -> ii
			else -> c.changeRoot(-P5).with(M3) // ii -> V
		}
		c.isDominant -> when {
			c.hasDiminished5 -> c
			else -> c.changeRoot(-P5).remove(P4)
		}
		else -> when { // Assumed to be major at this
			c.hasAugmented4 -> c // VI ->
			else -> c // I -> ii
		}
	}

	override fun back(c: falrm.topologica.harmony.chord.Chord) = c
}