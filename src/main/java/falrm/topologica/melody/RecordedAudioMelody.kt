package falrm.topologica.melody

import falrm.topologica.Melody

abstract class RecordedAudioMelody(
        override val elements: MutableList<falrm.topologica.Melody.Element>,
        override var subdivisionsPerBeat: Int = 1,
        override var tonic: Int = 0,
        var data: ByteArray = byteArrayOf()
) : falrm.topologica.Melody {
	override var shouldConformWithHarmony = false
	override val type get() = "audio"
}