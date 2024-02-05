void main() throws InterruptedException {
    int x = 0;
    final int TOTAL_SPACES = 20;
    while (x <= 100){
        final double FILLED_SPACES = x / 100.0 * TOTAL_SPACES;
        final double EMPTY_SPACES = TOTAL_SPACES - FILLED_SPACES;

        String filled = "", empty = "";
        int a = 0;
        while (a++ < FILLED_SPACES) filled += " ";
        a = 0;
        while (a++ < EMPTY_SPACES) empty += " ";

        String output = STR."[\033[41m\{filled}\033[0m\{empty}]\{x++}%";
        System.out.print(output);
        Thread.sleep(20);
        int y = 0;
        while (y++ < output.length() && x < 101){
            System.out.print("\b");
            //Thread.sleep(500);
        }
    }

//    System.out.println("[          ] 0%");
//    System.out.println("[          ] 1%");
//    System.out.println("[          ] 2%");
//    System.out.println("[          ] 3%");
//    System.out.println("[          ] 4%");
//    System.out.println("[          ] 5%");
}