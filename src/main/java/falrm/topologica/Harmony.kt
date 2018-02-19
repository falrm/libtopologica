package falrm.topologica

import falrm.topologica.harmony.chord.Chord

class Harmony(
        elements: List<falrm.topologica.harmony.chord.Chord> = emptyList(),
        override var subdivisionsPerBeat: Int = 1
) : falrm.topologica.Pattern<falrm.topologica.harmony.chord.Chord> {
	override val elements: MutableList<falrm.topologica.harmony.chord.Chord> = elements.toMutableList()
	override var tonic: Int = 0
	override fun transpose(interval: Int) = Harmony(
		elements.map { it.transpose(interval) },
		subdivisionsPerBeat
	)
}