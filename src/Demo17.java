void main() {
    int y = 0;
    while (y++ < 7) {
        int x = 0;
//        int col = 0;
//        if (y < 5) col = y;
//        else col = 8 - y;
        while (x++ < ((y < 5) ? y : (8 - y))) {
            System.out.print("* ");
        }
        System.out.println();
    }
}