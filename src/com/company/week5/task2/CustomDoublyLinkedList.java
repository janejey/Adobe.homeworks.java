package com.company.week5.task2;

public class CustomDoublyLinkedList <T>{
    private class DoublyLinkedNode <T> {
        private final T element;
        private DoublyLinkedNode next;
        private DoublyLinkedNode prev;
        private DoublyLinkedNode first;
        private DoublyLinkedNode last;
        private DoublyLinkedNode size;
        private DoublyLinkedNode currentNode;

        public DoublyLinkedNode(T element) {
            this.element = element;
        }
        public void addAtTheBeginning(T element) throws Exception {
            restrictDuplicate(element);

        }
        public int search (T element) {
            for(int i = 0; i < size; i++) {
                if (element.equals(currentNode)) {
                    return i;
                }
            } return -1;
        }
        private void restrictDuplicate(T element) throws Exception {
            if (search(element) != -1){
                throw new Exception("Element has already exist.");
            }
        }
    }
}
