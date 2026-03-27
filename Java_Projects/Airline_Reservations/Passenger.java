package Java_Projects.Airline_Reservations;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Passenger class
class Passenger {
    private String name;
    private int id;
    private String contactNumber;

    public Passenger(String name, int id, String contactNumber) {
        this.name = name;
        this.id = id;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Passenger other = (Passenger) obj;
        return id == other.id &&
               Objects.equals(name, other.name) &&
               Objects.equals(contactNumber, other.contactNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, contactNumber);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ", Contact: " + contactNumber + ")";
    }
}

// Custom linked list class
class MyLinkedList<E> {
    private Node<E> head, tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    // Node class
    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
            next = null;
        }
    }

    // Add element to end
    public void append(E item) {
        Node<E> newNode = new Node<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Delete element
    public boolean delete(E item) {
        Node<E> ptr = head;
        Node<E> prev = null;
        while (ptr != null) {
            if (ptr.element.equals(item)) {
                if (prev == null) {
                    head = ptr.next;
                } else {
                    prev.next = ptr.next;
                }
                if (ptr == tail) {
                    tail = prev;
                }
                return true;
            }
            prev = ptr;
            ptr = ptr.next;
        }
        return false;
    }

    // Check if element exists
    public boolean contains(E item) {
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(item)) return true;
            current = current.next;
        }
        return false;
    }

    // Returns list as string
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> ptr = head;
        while (ptr != null) {
            result.append(ptr.element.toString());
            if (ptr.next != null) result.append(", ");
            ptr = ptr.next;
        }
        result.append("]");
        return result.toString();
    }

    // Method to return list without duplicates
    public MyLinkedList<E> checkDouble() {
        MyLinkedList<E> result = new MyLinkedList<>();
        Set<E> unique = new HashSet<>();

        Node<E> current = head;
        while (current != null) {
            if (!unique.contains(current.element)) {
                unique.add(current.element);
                result.append(current.element);
            }
            current = current.next;
        }

        return result;
    }
}

