package uk.ac.hw.planets.services;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import uk.ac.hw.planets.comparators.PlanetComparatorFactory;
import uk.ac.hw.planets.entities.Planet;
import uk.ac.hw.planets.entities.SolarSystem;
import uk.ac.hw.planets.exceptions.PlanetException;
import uk.ac.hw.planets.forms.PlanetDistanceForm;
import uk.ac.hw.planets.forms.PlanetForm;

public class PlanetService {
	public PlanetDistanceForm getPlanetsDistance(PlanetDistanceForm f) throws Exception {
		SolarSystem planets = SolarSystem.createSolarSystem();
		//
		return f;
	}

	public HashSet<Planet> findPlanet(PlanetForm f) throws Exception {
		HashSet<Planet> list = new HashSet<Planet>();
		if (f.getName() == null)
			throw new Exception("Invalid planet name");

		SolarSystem planets = SolarSystem.createSolarSystem();
		Iterator<Planet> it = planets.iterator();
		while (it.hasNext()) {
			Planet p = it.next();
			String s1 = p.getName().toUpperCase();
			String s2 = f.getName().toUpperCase();
			if (s1.contains(s2)) {
				list.add(p);
			}
		}
		return list;
	}

	public Planet createPlanet(PlanetForm f) {
		SolarSystem s = SolarSystem.createSolarSystem();
		//create planet
		return null;
	}

	public TreeSet<Planet> sortPlanets(int criteria) {
		SolarSystem planets = SolarSystem.createSolarSystem();
		Comparator<Planet> cmp = PlanetComparatorFactory.createPlanetComparator(criteria);

		//create a new TreeSet with comparator to get it sorted
		TreeSet<Planet> set = new TreeSet<Planet>(cmp);
		set.addAll(planets);

		return set;
	}
}
