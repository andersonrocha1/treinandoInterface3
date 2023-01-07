package application;

import devices.ComboDevice;
import devices.ConcretPrinter;
import devices.ConcretScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretPrinter printer = new ConcretPrinter("8909");
		printer.processDoc("My Letter");
		printer.print("My Letter");
		
		System.out.println();
		
		ConcretScanner scanner = new ConcretScanner("2023");
		scanner.processDoc("My email");
		System.out.println("Scan result: " + scanner.scan());
		
		System.out.println();
		
		ComboDevice combo = new ComboDevice("9090");
		combo.processDoc("My document");
		combo.print("My printing document");
		System.out.println("Scanner result: " + combo.scan());
		
	}

}
