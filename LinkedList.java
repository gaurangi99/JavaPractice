/**
 * 
 */

/**
 * @author RK
 *
 */
public class LinkedList {
	Node head;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insert(4);
		l.insert(7);
		l.insert(2);
		l.find(5);
		l.insert(9);
		l.insert(5);
		l.insert(10);
		l.delete(1);
		l.display();
		l.delete(5);
		l.display();
		l.find(7);
		l.find(9);
		l.find(4);
		l.delete(4);
		l.display();
		// TODO Auto-generated method stub
	}

	public void insert(int id) {
		Node n = new Node();
		n.id = id;
		if (this.head == null) {
			this.head = n;
		} else {
			n.next = this.head;
			this.head = n;
		}
	}

	public void find(int id) {
		Node tmp = this.head;
		while (tmp != null) {
			if (tmp.id == id) {
				System.out.printf("%d is present in List!\n", tmp.id);
				break;
			} else {
				tmp = tmp.next;
			}
		}
		if (tmp == null) {
			System.out.println("List ended. Item not found!!");
		}
	}

	public int delete(int id) {
		int val = -1;
		Node tmp = this.head;
		if (tmp != null && tmp.id == id) {
			val = tmp.id;
			tmp = tmp.next;
		} else {
			while (tmp != null && tmp.next != null) {
				if (tmp.next.id == id) {
					val = tmp.next.id;
					tmp.next = tmp.next.next;
				} else {
					tmp = tmp.next;
				}
			}
		}
		System.out.printf("Deleted value is %d\n",val);
		return val;
	}
	
	public void display() {
		Node tmp;
		tmp = this.head;
		System.out.print("List : ");
		while (tmp != null) {
			System.out.printf("<-- %d", tmp.id);
			tmp = tmp.next;
		}
		System.out.println("\nList ended!!");
	}
}
