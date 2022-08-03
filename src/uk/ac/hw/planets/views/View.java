package uk.ac.hw.planets.views;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import uk.ac.hw.planets.entities.Planet;
import uk.ac.hw.planets.forms.PlanetDistanceForm;
import uk.ac.hw.planets.forms.PlanetForm;

public class View {
	Scanner input = new Scanner(System.in);
	
	public int displayMenu() {
		System.out.println("______________________________");		
		System.out.println("0 : Add a planet");
		System.out.println("1 : Select a planet");
		System.out.println("2 : Sort planets");
		System.out.println("3 : Get distance between two planets");
		System.out.println("4 : Quit");
		System.out.print("What is your choice ? ");
		int choice = input.nextInt(); input.nextLine();
		System.out.println("______________________________");
		return choice;
	}

	public void displayPlanets(Collection<Planet> planetes) {
		Iterator<Planet> it = planetes.iterator();
		System.out.println("Name\t" + "Distance to sun\t" + "Volume");
		while (it.hasNext()) {
			Planet p = it.next();
			//print planet
		}
	}

	public void displayDistance(PlanetDistanceForm f) {
		//print
		}

	public void displayError(Exception e) {
		//print error

	}

	public void displayPlanet(Planet p) {
		//display
	}

	public PlanetForm readPlanetName() {
		//read name
		return new PlanetForm("", 0, 0);
	}

	public PlanetForm readPlanet() {
		//read planet attributes
		return new PlanetForm("", 0, 0);
	}

	public PlanetDistanceForm read2PlanetNames() {
		//read names
		return new PlanetDistanceForm("", "");
	}

	public int readCriteria() {
		//read criteria
		return 0;
	}

}
