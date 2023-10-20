package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
    String eight = "8";
    String empty = " ";
    for(int j = 0; j < sideLength; j++) {
        System.out.print(eight);
    } System.out.println();
    for(int i = 0; i < sideLength - 2; i++) {
        System.out.print(8);
        for(int l = 0; l < sideLength - 2; l++) {
            System.out.print(empty);
        } System.out.print(8); System.out.println();
    }  for(int j = 0; j < sideLength; j++) {
        System.out.print(eight);
       } System.out.println();
    }
}
