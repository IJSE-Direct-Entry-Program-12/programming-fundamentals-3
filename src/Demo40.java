void main() {

    int x = 0, z = 0;
    for (int y = 0; y < 5; y++) {
        outer:
        while (x++ < 3 || (x = 0) == 1) {
            System.out.print("= ");
            z = x;
            do {
                if (y % 2 != 0 && x == 2
                        && (x = 0) == 0) break outer;
                System.out.print("* ");
            } while (z++ < 3);
        }
        System.out.println();
    }
}