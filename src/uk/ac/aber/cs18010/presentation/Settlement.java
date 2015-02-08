package uk.ac.aber.cs18010.presentation;
import java.util.Arrays;

public class Settlement {
	
	private String name;
	private int population;
	private SettlementType kind;
	private Road[] roads;
	private int numRoads;
	
	/**
	 * The maximum number of roads that can be connected to the
	 * settlement
	 */
	private final int MAX_ROADS = 100;
	
	public Settlement(String name) {
		this.name = name;
		roads = new Road[MAX_ROADS];
	}
	
	public String getName() {
		return name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int size) {
		population = size;
	}

	public SettlementType getKind() {
		return kind;
	}

	public void setKind(SettlementType kind) {
		this.kind = kind;
	}
	
	/**
	 * 
	 * @param road
	 */
	public void add(Road road) {
		if (numRoads < MAX_ROADS) {
			roads[numRoads] = road;
			numRoads++; // Increment by 1
		} else {
			// error handling, empty for now
		}
	}

	@Override
	public String toString() {
		return "Settlement [name=" + name + ", population=" + population
				+ ", kind=" + kind + ", roads=" + Arrays.toString(roads) + "]";
	}
	
	
}
