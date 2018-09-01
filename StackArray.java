public class StackArray {
	int position = -1;
	int a[] = new int[10];

	public static void main(String[] args) {
		StackArray sa = new StackArray();
		sa.pop();
		sa.top();
		sa.push(5);
		sa.push(6);
		sa.top();
		sa.display();
		sa.push(8);
		sa.push(3);
		sa.top();
		sa.display();
		sa.pop();
		sa.display();
		sa.push(9);
		sa.push(0);
		sa.push(1);
		sa.push(3);
		sa.top();
		sa.display();
		sa.push(2);
		sa.push(4);
		sa.push(7);
		sa.push(11);
		sa.top();
		sa.display();
		sa.pop();
		sa.display();
		sa.top();
		sa.display();
	}

	public void push(int id) {
		if (position >= 0 && position < 10) {
			a[position] = id;
			position++;
		} else if (position < 0) {
			position = 0;
			a[position] = id;
			position++;
		} else if (position >= 10) {
			System.out.println("\nStack is full!!");
		}
	}

	public void pop() {
		int val;
		if (position >= 0 && position < 10) {
			val = a[position];
			position--;
			System.out.printf("Popped value is: %d", val);
		} else if (position < 0) {
			System.out.println("Stack is empty!!");
		}
	}

	public void top() {
		int i = this.position;
		if (i >= 0 && i < 10) {
			i--;
			System.out.printf("\nTop value: %d\n", a[i]);
		} else if (i < 0) {
			System.out.println("\nStack has null!!");
		}
	}

	public void display() {
		System.out.println("Stack is:\t");
		if (position < 0) {
			System.out.println("Stack is empty!!");
		} else {
			int start = position-1;
			while (start >= 0) {
				System.out.printf("<--%d", a[start]);
				start--;
			}
		}
	}
}
