package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String eight = "8";
        String empty = " ";
   
        for(int b = 0; b < sideLength; b++) {
            for(int c = 0; c < sideLength; c++) {
                System.out.print(empty);
            }
            for(int c = 0; c < sideLength; c++) {
                System.out.print(eight);
            }
            for(int c = 0; c < sideLength; c++) {
                System.out.print(empty);
            }
            System.out.println();
        } 
     for(int b = 0; b < sideLength; b++) {
            for(int c = 0; c < sideLength * 3; c++) {
                System.out.print(eight);
            }
            System.out.println();
        }  for(int b = 0; b < sideLength; b++) {
            for(int c = 0; c < sideLength; c++) {
                System.out.print(empty);
            }
            for(int c = 0; c < sideLength; c++) {
                System.out.print(eight);
            }
            for(int c = 0; c < sideLength; c++) {
                System.out.print(empty);
            }
            System.out.println();
        } 
    }
}
