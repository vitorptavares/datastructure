package doublyLinkedList;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertBeginning("Vitor");
        doublyLinkedList.insertBeginning("Priscila");
        doublyLinkedList.transversefromBeginning();


        DoublyLinkedList doublyLinkedList2 = new DoublyLinkedList();
        doublyLinkedList2.insertEnd("Vitor");
        doublyLinkedList2.insertEnd("Priscila");
        doublyLinkedList2.transversefromEnd();
    }
}
