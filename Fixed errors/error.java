/*
Error filled file created by
Kimg@techtrepacademy.com
for my java class to learn troubleshooting on
*/
public class error { // gotta be the name of the file

    public static void main(String[] args){ //Missed this... had me scratching my head for a bit there.

    System.out.println("Hello world"); // I originally rewrote this line to fix the problem when the solution was to add the above code.

    System.out.println("am I doing this correctly");

    for (int i=0; i<10; i++){
        System.out.println("the number i is "+i); // lm to ln
    }

    for (int i=0; i>10; i++){ // 
        System.out.println("the new number i is "+i);


        
    }

   int i = 0; //had to make a local version of i for the last loop.

    if (i==0){ 
        System.out.print("i is equal to zero");

    }else {
        System.out.print("i is not equal to zero");

    }
    //what other errors can I put into a source code file?
    // You could havse had a String with an int value and vice versa.

}

}
