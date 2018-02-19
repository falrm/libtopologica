package falrm.topologica

interface Pattern<T: falrm.topologica.Transposable<T>>: falrm.topologica.Transposable<Pattern<T>> {
	val elements: MutableList<T>
	val subdivisionsPerBeat: Int
	val tonic: Int
}