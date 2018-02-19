package falrm.topologica

interface Transposable<SelfType: Any> {
	fun transpose(interval: Int): SelfType
}