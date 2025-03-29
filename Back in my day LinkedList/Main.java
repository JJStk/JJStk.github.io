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

        //           Commands:
        // 'apply' is queue, 'preapply' is stack.
        // Delete anything with 'eraser', just remember what you want to erase!
        // 'peer' lets you see the #1 spot in the list.
        // 'Ladle' pulls the #1 spot a.k.a. the toppa da stack.
        // 'GetOuttaLine' removes the last queued, or the bottom of the stack.






        // Remember to remove the double slashes to use the premade code!

        // dll.preapply(5);
        // System.out.println("5 is your new #1!");
        // dll.Forward();

        // dll.eraser(50);
        // System.out.println("No more 50!");
        // dll.Forward();


    }
    
}
