import java.util.ArrayList;

public class Recursion {
	
public static void main(String [] args) {
	ArrayList <Integer> array = new ArrayList<Integer>();
	
	int m = 3;				
	int n = 5;
	
	for (int i = 0; i <= 14; i++) {			
// looped the sequemce to 15 numbers 
		array.add(RE(i, m, n));				
}
	for (int j = 0; j <array.size(); j++) {
		System.out.println((j + 1) + ": " + array.get(j));

	}
}
	public static int RE(int range, int m, int n) {			
//RE variable was used to define the range, m, and n
		if (range == 0)								
			return m;
		if (range == 1)
			return n;
		
		return RE(range - 1, m, n) + RE(range - 2, m, n);
	}
}                                                                                                                                                                                                                                                                                                                    
