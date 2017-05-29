package algorithm.linkedlist;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SingleLinkedListTest {

    @Test
    public void test() {
        assertThat("", is(testFunction()));
    }

    public String testFunction() {
        return "";
    }

    public class Node {
        int data;
        Node next;
    }

    private class SingleLinkedList {
        private Node head;

        public void addToHead(int n) {
            Node newNode = new Node();
            newNode.data = n;
            head.next = newNode;
            head = newNode;
        }

        /*
            TASK
            첫번째 원소를 제거하라.
        */

        public void removeFirst() {
            if (head == null) {
                throw new RuntimeException("Not found");
            }
//            head = head.next;
            Node temp = head;
            head = null;
            head = temp.next;
        }

        /*
            TASK
            중복된 원소를 제거하라.
        */

        public void removeDuplicateElm() {
            Set<Integer> set = new HashSet<>();
            Node prev = null;
            Node start = head;
            while (start != null) {
                if (set.contains(start.data)) {
                    if (prev == null) {
                        break ;
                    }
                    prev.next = start.next;
                } else {
                    set.add(start.data);
                    prev = start;
                }
                start = start.next;
            }
        }

        /*
            TASK
            역순으로 출력하라.
         */

        public void reverse() {
            Node prev = null;
            Node start = head;
            Node next = null;
            while (start != null) {
                next = start.next;
                start.next = prev;
                prev = next;
            }
        }

        /*
            TASK
            k번째 원소를 찾아라.
         */

        public Node kthToLast(int k) {
            Node result = head;
            if (k < 0) {
                return null;
            }
            int count = 0;
            while(count < k) {
                result = head.next;
                head = head.next;
                count++;
            }
            return result;
        }

        /*
            TASK
            회문인지 판단하라.
         */

        public boolean isPlaindrome() {
            Stack<Node> stack = new Stack<>();
            Node node1 = head;
            Node node2 = head;
            while (node1 != null && node2 != null) {
                stack.push(node1);
                node1 = head.next;
                node2 = head.next.next;
            }
            if (node2 != null) { //홀수인 경우
                node1 = node1.next;
            }

            while (node1 != null) {
                if (stack.pop().data != node1.data) {
                    return false;
                }
                node1 = node1.next;
            }
            return true;
        }
    }
}
