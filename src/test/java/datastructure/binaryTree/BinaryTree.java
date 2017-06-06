package datastructure.binaryTree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BinaryTree {

    @Test
    public void test() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        Node node4 = new Node();
        node1.data = 1;
        node2.data = 2;
        node3.data = 3;
        node4.data = 4;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        assertThat(getMax(node1), is(4));
        assertThat(isBalanced(node1), is(true));

        int[] arr = {1,5,7,9,12,26,56,78};
        assertThat(isBST(buildBST(arr)), is(true));
    }


    /*
        TASK
        바이너리 트리에서 최대값을 구한다.
     */

    public int getMax(Node root) {
        int result = Integer.MIN_VALUE;
        if (root == null) {
            return result;
        }
        return getMaxRec(root, result);
    }

    public int getMaxRec(Node head, int result) {
        if (head == null) {
            return result;
        }
        if (head.data > result) {
            result = head.data;
        }
        result = getMaxRec(head.left, result);
        result = getMaxRec(head.right, result);
        return result;
    }


    /*
        TASK
        주어진 바이너리 트리가 균형 잡힌 트리인지 판별한다.
     */

    public boolean isBalanced(Node root) {
        return getNodeHeight(root) != -1;
    }

    private int getNodeHeight(Node node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getNodeHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = getNodeHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(rightHeight - leftHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }


    /*
        TASK
        오름차순으로 정렬된 배열을 Binary Search Tree로 변환한다.
        트리의 높이를 최소화 하면서 (즉 complete binary tree로) 변환한다.
     */

    public Node buildBST(int[] arr) {
        return buildBSTRec(arr, 0, arr.length - 1);
    }

    private Node buildBSTRec(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = start + (end - start)/2;
        Node leftNode = buildBSTRec(arr, start, middle - 1);
        Node rightNode = buildBSTRec(arr, middle + 1, end);

        return new Node(arr[middle], leftNode, rightNode);
    }


    /*
        TASK
        주어진 트리가 BST인지 확인한다.
        Hint: 범위 탐색
     */

    public boolean isBST(Node root) {
        return isBSTRec(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBSTRec(Node node, int min, int max) {
        if (node == null) {
            return true;
        }

        if (node.data <= min || node.data > max) {
            return false;
        }

        boolean isBSTOfLeft = isBSTRec(node.left, min, node.data);
        boolean isBSTOfRight = isBSTRec(node.right, node.data, max);

        return isBSTOfLeft && isBSTOfRight;
    }


    public class Node {
        int data;
        Node left;
        Node right;

        public Node() {}
        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
