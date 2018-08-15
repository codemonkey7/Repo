import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class triangleChallenge {
	
	public static final boolean TEST_MODE = false;
	
	public static String triangleType(int a, int b, int c){
		
		if (a<0||b<0||c<0){
			return null;
		}
		
		// Create a set and add all the incoming values in the set
		Set<Integer> sidesSet = new HashSet<>();
		sidesSet.add(a);
		sidesSet.add(b);
		sidesSet.add(c);
		
		// Let the default result be "scalene"
		String result = "scalene";
		
		// Iterate over the size of the set, as it does not allow duplicates
		// Size 1 would mean a==b==c
		// Size 2 would mean a==b or b==c or c==a
		switch(sidesSet.size()){
		case 1:
			result = "equilateral";
			break;
		case 2:
			result = "isosceles";
			break;
		}
		
		return result;
		
	}
	
	public static void main(String[] args){
		String type;
		
		// For running quick tests
		if(TEST_MODE){
			type = triangleType(2, 2, 2);
		} else {
			
			Scanner input = new Scanner(System.in);
			System.out.print("Give me length of one side of the triangle: ");
			int a = input.nextInt();
			System.out.print("How about the length of a second side: ");
			int b = input.nextInt();
			System.out.print("Finally, the length of the last remaining side: ");
			int c = input.nextInt();
			input.close();
			type = triangleType(a, b, c);
			
		}
		if (type!=null){
			System.out.println("The triangle of given sides is of type: "+type);
		} else {
			System.out.println("The triangle is invalid");
		}
		
	}
}
