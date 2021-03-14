public class Pythagorean {
	public double calculateHypotenuse(int legA, int legB) {
		double aSquared = legA * legA;
		double bSquared = legB * legB;
		double cSquared = Math.sqrt(aSquared + bSquared);
		return cSquared;
		// the hypotenuse is the side across from the right angle. 
        // calculate the value of c given legA and legB
	}
}