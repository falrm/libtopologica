package falrm.topologica

import falrm.topologica.harmony.chord.Chord

/**
 * A [Palette] is simply a collection of unrelated [Chord]s
 * and [Part]s.
 */
class Palette (
        val chords: MutableList<falrm.topologica.harmony.chord.Chord> = mutableListOf(),
        val parts: MutableList<falrm.topologica.Part> = mutableListOf(),
        val harmonies: MutableList<falrm.topologica.Harmony> = mutableListOf(),
        var keyboardPart: falrm.topologica.Part? = null,
        var colorboardPart: falrm.topologica.Part? = null
)