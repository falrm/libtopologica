package falrm.topologica

import falrm.topologica.melody.RationalMelody

interface Melody: falrm.topologica.Pattern<Melody.Element> {
	var shouldConformWithHarmony: Boolean
	val type get() = "base"

	override fun transpose(interval: Int): Melody {
		return RationalMelody(
			elements.map {
				it.transpose(interval)
			}
		)
	}

	sealed class Element: falrm.topologica.Transposable<Element> {
		/**
		 * All the notes of any Melody should be given as though the tonic center is at 0.
		 */
		class Note(
			var tones: MutableSet<Int> = mutableSetOf(),
			var velocity: Float = 1f
		) : Element() {
			/**
			 *
			 */
			override fun transpose(interval: Int): Note {
				return Note(
					tones = tones.map { it + interval }.toMutableSet(),
					velocity = velocity
				)
			}
		}

		class Sustain(
			var note: Note
		) : Element() {
			override fun transpose(interval: Int): Element {
				return Sustain(note.transpose(interval))
			}
		}

	}
}