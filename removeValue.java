// program to remove value greater 25

public class removeValue {
    Node head;

    class Node {

        int data;
        Node next;

        Node(int data) {

            this.data = data;
            this.next = null;
        }
    }

    public void creatlist(int data) {
        Node newNode = new Node(data);

        Node temp = head;
        if (head == null) {

            head = newNode;
        } else {

            while (temp.next != null)
                temp = temp.next;

            temp.next = newNode;
        }

    }

    public void print_data() {

        Node temp = head;
        if (head == null) {

            System.out.println("head is null:");
        } else {

            while (temp != null) {

                System.out.print(temp.data + "->");

                temp = temp.next;
            }

            System.out.print("null");
        }
    }

    public void removevalue() {

        Node temp = head;
        Node nextNode = head.next;
        while (nextNode != null) {

            if (nextNode.data > 25) {
                temp.next = nextNode.next;
                nextNode = nextNode.next;
            } else {

                temp = temp.next;
                nextNode = nextNode.next;
            }

        }

    }

    public static void main(String args[]) {

        removeValue list = new removeValue();

        for (int i = 0; i <= 50; i++) {

            list.creatlist(i);
        }
        System.out.println("Old list:\n\n");
        list.print_data();
        list.removevalue();
        System.out.println("\n\nUpdated list:\n\n");
        list.print_data();

    }
}