package falrm.topologica.harmony.chordsequence

import falrm.topologica.harmony.Orbit
import falrm.topologica.harmony.chord.Chord
import falrm.topologica.harmony.chord.Maj6
import falrm.topologica.harmony.chord.min7

object SubdominantOptions : falrm.topologica.harmony.Orbit {
  override fun forward(c: falrm.topologica.harmony.chord.Chord) = when {
  //c.isDominant -> Chord(c.root + 7, min7) // V-ii
    c.isMajor -> falrm.topologica.harmony.chord.Chord(c.root + 5, Maj6) // I-IV
    else -> c
  }

  override fun back(c: falrm.topologica.harmony.chord.Chord) = when {
  //c.isDominant -> Chord(c.root - 2, Maj7) // V-IV
    c.isMajor -> falrm.topologica.harmony.chord.Chord(c.root - 1, min7) // IV-iii
    else -> c
  }
}
