package falrm.topologica.harmony

import falrm.topologica.harmony.chordsequence.*

/**
 * A [Orbifold] is literally just a list of [Orbit]s.
 *
 * Created by jonlatane on 5/26/17.
 */
enum class Orbifold(val title: String, vararg sequences: falrm.topologica.harmony.Orbit)
	: List<falrm.topologica.harmony.Orbit> by listOf(*sequences) {
	super_basic("Super Basic", DimMinDomMajAug),
	basic("Basic", TwoFiveOne),
	intermediate(
		"Intermediate",
		DimMinDomMajAug,
		TwoFiveOne,
		AlternatingMajorMinorThirds
	),
	advanced(
		"Advanced",
		DimMinDomMajAug,
		FourFiveOne,
		TwoFiveOne,
		AlternatingMajorMinorThirds,
		AlternatingMajorMinorSeconds
	),
	master(
		"Master",
		DimMinDomMajAug,
		SubdominantOptions,
		FourFiveOne,
		TwoFiveOne,
		TwoFiveOneMinor,
		AlternatingMajorMinorThirds,
		WholeSteps,
		AlternatingMajorMinorSeconds
	),
	chainsmokers(
		"Chainsmokers",
		CircleOfFifths,
		Chainsmokers,
		AlternatingMajorMinorThirds
	),
	pop(
		"Pop",
		SubdominantOptions,
		WholeSteps,
		AlternatingMajorMinorSeconds
	),
	funk(
		"Funk",
		FunkDominantStepUp,
		MinorFunk,
		FunkDominantSevens
	),
	functional(
		"Functional (Intermediate)",
		DimMinDomMajAug,
		FunctionalTwoFiveOne,
		FunctionalAlternatingMajorMinorThirds
	);

	companion object {
		internal val ALL_ORBITS: List<falrm.topologica.harmony.Orbit> = Orbifold.values().flatMap { it }
	}
}
