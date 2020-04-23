package org.example;

public class Task6 {
    public static void main(String[] args) {
      int x=7;
 /*       int y=1; //лучше сделать через for?
       do {
            int mult=x*y;
            System.out.println(x+"*"+y+ "=" + mult);
            y++;
        }
        while (y<=10);
    }
}*/
//лучше через for. попробовать
        for (int y = 1; y <= 10; y++) {
            int mult=x*y;
            System.out.println(x+"*"+y+ "=" + mult);
        }
    }
}