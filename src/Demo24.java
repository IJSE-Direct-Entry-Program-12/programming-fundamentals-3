void main() {
    int x, y;
    for (x = 6, y = 3, System.out.print("+ "); x-- > y; System.out.print(x != y ? "+\n+ " : "+")) {
        for (int k = 0; k < y; k++) System.out.print("* ");
    }
}