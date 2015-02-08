package uk.ac.aber.cs18010.presentation;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Give name");
		String name = in.nextLine();	
		Settlement aberystwyth = new Settlement(name);
		
		System.out.println("Give number");
		aberystwyth.setPopulation(in.nextInt());
		aberystwyth.setKind(SettlementType.TOWN);
		
		Settlement bowStreet = new Settlement("Bow Street");
		bowStreet.setPopulation(2000);
		bowStreet.setKind(SettlementType.VILLAGE);
		
		Settlement borth = new Settlement("Borth");
		borth.setPopulation(1500);
		borth.setKind(SettlementType.VILLAGE);
		
		Settlement llanbadarn = new Settlement("Llanbadarn");
		llanbadarn.setPopulation(3000);
		llanbadarn.setKind(SettlementType.VILLAGE);
		
		Settlement penparcau = new Settlement("Penparcau");
		penparcau.setPopulation(3100);
		penparcau.setKind(SettlementType.VILLAGE);
		
		ArrayList<Road> roads = new ArrayList<>();
		roads.add(new Road("A44", Classification.A, aberystwyth, llanbadarn));
		roads.add(new Road("A487", Classification.A, aberystwyth, bowStreet));
		roads.add(new Road("Hotel-Y-Bont", Classification.U, aberystwyth, penparcau));
		roads.add(new Road("B4353", Classification.B, bowStreet, borth));
		
		System.out.println(aberystwyth.toString());
		
		for (Road r : roads) {
			System.out.println(r.toString());
		}
	}
}
