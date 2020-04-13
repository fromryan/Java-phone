
public class Galaxy extends Phone implements Ringable {
   
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
	@Override
    public String ring() {
		String result = String.format("Galaxy %s says %s", getVersionNumber(), getRingTone());
		return result;
    }
    
	@Override
    public String unlock(String unlockingMethod) {
       String result = String.format("unlocking via %s", unlockingMethod);
       return result;
    }
    
	@Override
    public void displayInfo() {
		System.out.println(String.format("Galaxy %s from %s", getVersionNumber(), getCarrier()));
    }
}