void main(){
    block:
    {
        System.out.println("Hello");
        System.out.println("DEP");

        if (true) break block;

        System.out.println("End of the block");
    }
    System.out.println("Program is about to exit");
}