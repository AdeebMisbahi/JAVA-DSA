/* Time complexity: O(1) [for all operations] Space complexity: O(N) where N is the number of operations */ 
public class Stack { 
  private Node head;
  private int size; 
  public Stack() {
    this.head = null;
    this.size = 0; 
  } 
  public int getSize() {
    return this.size; 
  }
  public boolean isEmpty() { 
    return this.size == 0;
  }
  public void push(int element) {
    Node newnode = new Node(element);
    if (this.head == null) {
      this.head = newnode;
    } else { 
      newnode.next = this.head; 
      this.head = newnode;
    } 
    this.size++;
  } 
  public int pop() { 
    if (this.head == null) { 
      return -1;
    }
    int ans = this.head.data; 
    this.head = this.head.next; 
    this.size -= 1; 
    return ans;
  }
  public int top() {
    if (this.head == null) {
      return -1; 
    } 
    return this.head.data;
  }
                                                                                                                               }
