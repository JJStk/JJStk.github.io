
class HelloWorldBad {
    public static void main(String[] args) {
        
        for (int i=0;i<25;i++){
            System.out.println("the value of i is "+i);
            if (i==1){// you can't convert int to boolean, added an extra =
                System.out.println("i is equal to 1");
            }
        } 

        
    }
}