package game2048;

public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }

        /* Returns the size of the IntNode. */
        public int size () {
            if (next == null) {
                return 1;
            }
            return 1 + next.size();
        }

    }

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /**
     * Adds an item to the front of the list.
     */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /**
     * Retrieves the front item from the list.
     */
    public int getFirst() {
        return first.item;
    }

    /**
     * Adds an item to the end of the list.
     */
    public void addLast(int x) {
        IntNode N = first;
        while (N.next != null) {
            N = N.next;
        }
        N.next = new IntNode(x, null);
    }

    /**
     * Returns the number of items in the list using recursion.
     */
    public int size() {
        return first.size();
    }


    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addLast(10);
        L.addLast(15);
        L.addLast(112);
        System.out.println(null);
    }
}
