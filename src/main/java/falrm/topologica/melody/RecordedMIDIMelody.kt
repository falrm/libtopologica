package falrm.topologica.melody

import falrm.topologica.Melody

abstract class RecordedMIDIMelody(
        override val elements: MutableList<falrm.topologica.Melody.Element>,
        override var subdivisionsPerBeat: Int = 1,
        override var tonic: Int = 0
) : falrm.topologica.Melody {
	override var shouldConformWithHarmony = false
	override val type get() = "midi"
}