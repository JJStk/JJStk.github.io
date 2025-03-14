public class Main {
    public static void main(String[] args) {

        DubLinkList dll = new DubLinkList();

        dll.apply(10);
        dll.apply(20);
        dll.apply(30);
        dll.apply(40);
        dll.apply(50);

        System.out.println("And Forward!:");
        dll.Forward();

        System.out.println("Reverse! Reverse!:");
        dll.Reverse();

        // You can delete and add new nodes as well!
        // Just remember to remove the double slashes to use the premade code!

        // dll.preapply(5);
        // System.out.println("5 is your new #1!");
        // dll.Forward();

        // dll.eraser(50);
        // System.out.println("No more 50!");
        // dll.Forward();


    }
    
}
