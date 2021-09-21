//package com.company.week5.task2;
//
//public class CustomDoublyLinkedList <T>{
//    private class DoublyLinkedNode <T> {
//        private final T element;
//        private DoublyLinkedNode<T> next;
//        private DoublyLinkedNode<T> prev;
//        private DoublyLinkedNode<T> first;
//        private DoublyLinkedNode<T> last;
//        private DoublyLinkedNode currentNode;
//        private int size;
//
//        public DoublyLinkedNode(T element) {
//            this.element = element;
//        }
//        public void addAtTheBeginning(T element) throws Exception {
//            restrictDuplicate(element);
//            DoublyLinkedNode<T> doublyLinkedNode = new DoublyLinkedNode<>(element);
//            if(first == null) {
//                first = doublyLinkedNode;
//                last = first;
//            } else {
//                first.prev = doublyLinkedNode;
//                doublyLinkedNode.next = first;
//                first= doublyLinkedNode;
//                }
//            } size++;
//
//        }
//        public int search (T element) {
//            for(int i = 0; i < size; i++) {
//                if (element.equals(currentNode)) {
//                    return i;
//                }
//            } return -1;
//        }
//        private void restrictDuplicate(T element) throws Exception {
//            if (search(element) != -1){
//                throw new Exception("Element has already exist.");
//            }
//        }
//    }
//}
