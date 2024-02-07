void main() {

    int x = 0, z = 0;
    for (int y = 0; y < 5; y++) {
        x = 0;
        while (x++ < (y % 2 != 0 ? 2 : 3)) {
            System.out.print("= ");
            z = x;
            do {
                if (y % 2 != 0 && x > 1) break;
                System.out.print("* ");
            } while (z++ < 3);
        }
        System.out.println();
    }
}