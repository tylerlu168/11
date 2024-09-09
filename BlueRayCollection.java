public class BlueRayCollection
{
    private Node head;
    class Node
    {
        public BlueRayDisk disk;
        public Node next;
    }

    public BlueRayCollection()
    {
        head = null;
    }
    public void add(String title,String director,int year,double cost)
    {
        BlueRayDisk newDisk = new BlueRayDisk(title, director, year, cost);

        if (head == null)
        {
            head = new Node();
            head.disk = newDisk;
            head.next = null;
        }
        else
        {
            Node currentNode = head;
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node();
            currentNode = currentNode.next;

            currentNode.disk = newDisk;
            currentNode.next = null;
        }
    }

    public void show_all()
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.println(curr.disk.toString());
            curr = curr.next;
        }
        System.out.println();
    }
}
