void main() throws InterruptedException {
    System.out.println("[\033[0m          \033[0m] 0%");
    System.out.println("[\033[41m  \033[0m        ] 25%");
    System.out.println("[\033[41m    \033[0m      ] 50%");
    int x = 0;
//    while (x <= 100) {
//        System.out.print(STR."\{x}%");
//        x++;
//        Thread.sleep(50);
//        System.out.print((x - 1) < 10 ? "\b\b" : "\b\b\b");
//    }

    System.out.println();
    x = 0;
    while (x <= 10){
        System.out.print("\033[41m \033[0m");
        String percentage = STR." \{(x/10.0*100)}%";
        System.out.print(percentage);
        x++;
        Thread.sleep(500);
        int y = 0;
        while (y++ < percentage.length()) System.out.print("\b");
    }
}