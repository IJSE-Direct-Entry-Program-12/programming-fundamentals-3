void main(){
    outer:
    for (int y = 0; y < 5; y++) {
        System.out.println();
        for (int x = 0; x < 5; x++) {
            if (y == 2 && x == 3) continue;
            System.out.print("+ ");
        }
    }
}