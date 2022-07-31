package oops;

public class OverLoadingExample {

	public int GetArea(int l, int b) {
	return l*b;
	
	}
	
	public int GetArea(int l) {
		return l*l;
			}
	public double GetArea(double l) {
		return 2.54*l*l;
	}
}
