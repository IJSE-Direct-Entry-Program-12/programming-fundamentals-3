void main(){
    lbl1:
    {
        System.out.println("First");
        lbl2:{
            System.out.println("Second");
            lbl3:{
                System.out.println("Third");
                if (true) break lbl2;
                System.out.println("Fourth");
            }
            System.out.println("Fifth");
        }
        System.out.println("Sixth");
    }
    System.out.println("Seventh");
}