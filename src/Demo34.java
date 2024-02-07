void main(){
    lbl1:
    {
        System.out.println("First");
        System.out.println("Second");
        lbl2:
        {
            System.out.println("Third");
            System.out.println("Fourth");
            break lbl1;
        }
        // lbl3:
        //System.out.println("Fifth");
    }
}