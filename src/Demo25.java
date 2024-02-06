void main() throws InterruptedException {
    for (int x = 202, k; x-- > 197; Thread.sleep(2000), System.out.print("\r")) {
        for (k = 0, System.out.print(STR."\{(202 - x)}. "), Thread.sleep(500); k < 5; k++, Thread.sleep(500)) {
            System.out.print("* ");
        }
    }
}