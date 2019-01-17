
public class vault {
	public static void main(String[] args) {
boolean B =	new vault().trycode(62);
		System.out.println(B);
	}
int code = 62;
boolean trycode(int guess) {
	if (guess ==code) {
		return true;
	}
	else {
		return false;
	}
}
	
}
