void main() {

    int x, y = 0, k = 0;
    outer:
    do {
        System.out.println();
        if ((x = 0) == 0 && y++ == 5) break;

        while (true) {
            if (x++ == (5 - y) && (x = 0) == 0) break;
            System.out.print("\s\s");
        }

        do {
            System.out.print("* ");
            if (x++ == k && (k += 2) == k) continue outer;
        } while (true);

    } while (true);

}