package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.Maj7
import falrm.topologica.harmony.chord.min7

object AlternatingMajorMinorThirds : falrm.topologica.harmony.Orbit {
  override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
    c.isDominant -> c
    c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root + 3, Maj7)
    else -> falrm.topologica.harmony.chord.Chord(c.root + 4, min7)
  }

  override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
    c.isDominant -> c
    c.isMinor -> falrm.topologica.harmony.chord.Chord(c.root - 4, Maj7)
    else -> falrm.topologica.harmony.chord.Chord(c.root - 3, min7)
  }
}