package falrm.topologica.melody

import falrm.topologica.Melody
import falrm.topologica.Melody.Element

class RationalMelody(
	elements: List<Element> = emptyList(),
	/** A value of 4 would indicate sixteenth notes in 4/4 time */
	override var subdivisionsPerBeat: Int = 1
) : falrm.topologica.Melody {
	override var shouldConformWithHarmony = false
	override val elements: MutableList<Element>
		= elements.toMutableList()
	override var tonic: Int = 0
	override val type get() = "rational"
}