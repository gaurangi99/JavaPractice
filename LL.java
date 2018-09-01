
public class LL {

	Node head;

	public static void main(String[] args) {
		LL l = new LL();
		l.insert(2);
		l.insert(3);
		l.insert(9);
		l.insert(10);
		l.Display();
		l.Delete(3);
		l.Display();
		l.insert(6);
		l.find(3);
		l.find(9);
		l.Display();
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

	public Node find(int id) {
		Node tmp = head;
		while (tmp != null) {
			if (tmp.id == id) {
				return tmp;
			} else if (tmp.next == null) {
				return null;
			} else {
				tmp = tmp.next;
			}
		}
		return null;
	}

	public Node Delete(int id) {
		Node tmp = head;
		Node val = null;
		if (tmp != null && tmp.id == id) {
			val = tmp;
			head = tmp.next;
		} else {
			while (tmp != null && tmp.next != null) {
				if (tmp.next.id == id) {
					val = tmp.next;
					tmp.next = tmp.next.next;
					break;
				} else {
					tmp.next = tmp.next.next;
				}
			}
		}
		return val;
	}

	public void Display() {
		Node tmp;
		if (this.head != null) {
			System.out.println("I am here");
			tmp = this.head;
			while (tmp != null) {
				System.out.printf("%d ", tmp.id);
				tmp = tmp.next;
			}
		}
		System.out.println("head is null");
	}
}
