package uk.ac.aber.cs18010.presentation;

public class Road {
	
	private String name;
	private Classification classification;
	private Settlement sourceSettlement;
	private Settlement destinationSettlement;
	
	
	public Road(String nm, Classification classifier, Settlement source, 
			Settlement destination) {
		name = nm;
		classification = classifier;
		sourceSettlement = source;
		destinationSettlement = destination;
		sourceSettlement.add(this);
		destinationSettlement.add(this);	
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Road [name=" + name + ", classification=" + classification
				+ ", sourceSettlement=" + sourceSettlement.getName()
				+ ", destinationSettlement=" + destinationSettlement.getName()
				+ "]";
	}
	
	
	
}
