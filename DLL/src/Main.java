
public class Main {
	
	public static void main(String[] args) {
		
		DLinkList dll = new DLinkList();
		dll.insert(10);
		dll.insert(20);
		
		System.out.println(dll);
		dll.reverse();
		System.out.println(dll);
		dll.append(30);
		dll.insert(40);
		dll.insert(100);
		System.out.println(dll);
	}
}

