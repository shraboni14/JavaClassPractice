import java.util.LinkedList;

public class LinkList {
    static <Customer> void serveCustomer(LinkedList<Customer>queue){
          Customer c =  queue.poll();
    }
    public static <Customer> void main(String[] args) {
//        LINKED LIST
        LinkedList<String> myList = new LinkedList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");
        System.out.println(myList);
        myList.add(2,"z");
        System.out.println(myList);
        myList.remove("d");
        System.out.println(myList);


//        QUEUE PROGRAM
        LinkedList<Customer> queue = new LinkedList<Customer>();
//        queue.add(new Customer("shraboni"));
//        queue.add(new Customer(2,"lakku"));
        queue.add(0, (Customer) "shraboni");
        queue.add(1, (Customer) "tanmoy");
        queue.add(2,(Customer) "Lakku");
        System.out.println(queue);
    }


}
