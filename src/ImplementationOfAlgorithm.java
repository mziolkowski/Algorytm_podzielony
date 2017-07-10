

import java.util.ArrayList;

public class ImplementationOfAlgorithm extends Algorithm{
	public static void main(String[] args) {
		
		Algorithm algorithm = new Algorithm();
//		Display display = new Display();
//		DataSource datasource = new DataSource();
//		Maps maps = new Maps();
		
		Integer[][] netMap3 = algorithm.NetMap();
		ArrayList<Integer> list2 = algorithm.CoordinateList();
		ArrayList<Integer> wetList2 = algorithm.WetPoints();
		Boolean[][] bolleanNetMap3 = algorithm.BooleanNetMap();
		ArrayList<Integer> listOfPoints2 = algorithm.ListOfPoints();
		String[][] waterDirection2 = algorithm.WaterDirection();
		
		algorithm.Map();
		algorithm.NetMap();
		algorithm.CoordinateList();
		algorithm.WetPoints();
		algorithm.ListOfPoints();
		algorithm.NetMap();
		algorithm.BooleanNetMap();	
		algorithm.WaterDirection();
		algorithm.Calculation(netMap3, list2, wetList2, bolleanNetMap3, listOfPoints2, waterDirection2);
		algorithm.Calculation2(netMap3, list2, wetList2, bolleanNetMap3, listOfPoints2, waterDirection2);
		
//		display.Display(netMap3, bolleanNetMap3, waterDirection2);
		
	}
	

}
