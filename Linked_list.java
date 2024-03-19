
// implementation of Link_list in java 
import java.util.*;

public class Linked_list {
    Node head;

    static int size;

    public class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;

            this.next = null;
        }
    }

    public void add_data(int data) {

        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;

        } else {

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;

        }
    }

    void print_data() {

        Node temp;
        temp = head;
        System.out.println("list:");
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

    void insert_last() {
        Node temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the data you want to add:");
        int s = sc.nextInt();
        Node newNode = new Node(s);
        temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }

        temp.next = newNode;

    }

    void insert_in_any_position() {

        int count = 1;
        Node temp;
        Node newTemp;
        temp = head;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the position where you want to add data:");
        int pos = sc.nextInt();
        Node newNode = new Node(17);
        while (count != pos - 1) {

            temp = temp.next;
            count++;
        }
        newTemp = temp.next;
        temp.next = newNode;
        newNode.next = newTemp;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Linked_list list = new Linked_list();

        System.out.println("Enter the size:");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {

            System.out.print("Enter the data:");
            int data = sc.nextInt();

            list.add_data(data);
        }

        list.print_data();
        list.insert_last();
        list.print_data();
        list.insert_in_any_position();
        list.print_data();
        sc.close();

    }
}