public class BlueRayCollection {
    private Node head = null;
    int size = 0;
    public void add( String director,String title, int yearOfRelease, double cost){
        Node newNode = new Node(new BlueRayDisk( director,title, yearOfRelease, cost));
        if (head == null) {
            head = newNode;
        }
        else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        ++size;
    }

    public void show_all(){
        if (head == null) {
            System.out.println("No such Disk Available");
            return;
        }

        else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.disk.toString());
                currentNode = currentNode.next;
            }
        }
    }
}
