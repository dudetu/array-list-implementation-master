public class TreeSetImplementation {

    Node root;

    public void add(int element) {
        if (root == null) {
            createRoot(element);
        }
        else {
            search(element);
        }
    }

    private void createRoot(int element) {
        Node node = new Node(null, null, element);
        root = node;
    }

    private void search(int element) {
        Node current = root;
        boolean searching = true;

        while (searching) {

            if (element < current.value && current.left != null) {
                current = current.left;
            }

            if (element < current.value && current.left == null) {
                current.left = new Node(null, null, element);
                searching = false;
            }


            if (element > current.value && current.right != null) {
                current = current.right;
            }

            if (element > current.value && current.right == null) {
                current.right = new Node(null, null, element);
                searching = false;
            }


            if (element == current.value) {
                return;
            }
        }

    }

}
