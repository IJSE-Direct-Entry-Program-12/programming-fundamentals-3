void main() throws InterruptedException {
    for (int x = 0, y = 5; x != y; x++, y = 5, System.out.println()) {
        for (System.out.print("+ "); x + 2 < y; y--) {
            System.out.print("* ");
        }
    }
}