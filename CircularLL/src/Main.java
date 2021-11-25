
public class Main {

	public static void main(String[] args) {
		
		CircularLL cll = new CircularLL();
		
		cll.insert(10);
		cll.insert(20);
		cll.append(30);
		cll.append(40);
		
		System.out.println(cll);
	}
}
