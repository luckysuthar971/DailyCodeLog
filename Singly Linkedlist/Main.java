
class Main {
    public static void main(String[] args) {
        // SLL list = new SLL();
        // list.FirstInsert(3);
        // list.FirstInsert(5);
        // list.FirstInsert(7);
        // list.FirstInsert(9);
        // list.FirstInsert(13);
        // list.LastInsert(15);

        // list.display();

        SLL list2 = new SLL();
        list2.FirstInsert(3);
        list2.FirstInsert(5);
        list2.LastInsert(8);
        list2.LastInsert(9);
        list2.InsertIndex(7, 2);
        list2.InsertIndex(1, 0);
        list2.InsertIndex(50, 6);
        list2.LastDeletion();
        list2.display();
        System.out.println();
        System.out.println(list2.Delete(3));
        list2.display();
    }
}