public class MyList implements Queue {
    static Node head;
    Node current = head;

    public void add(Elevator e) {
        Node n = new Node();
        n.value = e;
        n.value.status = Status.FREE;
        if (head == null) {
            n.num = 1;
            head = n;
            current = head;
        } else {
            Node current = head;
            while (current.next != null) {
                n.num = current.num + 1;
                current = current.next;
            }

            current.next = n;
            current.next.num = current.num + 1;

            if (current.next.num == 7) {
                n.next = head;
            }

        }
    }

    public int free(Elevator e) {
        return e.status.getValue();
    }
}
