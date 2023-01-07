package devices;

public class ConcretScanner extends Device implements Scanner {

	public ConcretScanner(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println(" Scanner Processing:  " + doc);
		
	}
	
	@Override
	public String scan() {
		
		return "Scan to doc";
	}

}
