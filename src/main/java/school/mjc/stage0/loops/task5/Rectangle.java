package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        String eight = "8";
    String empty = " ";
    for(int i = 0; i < length; i++) {
        System.out.print(eight);
    } System.out.println();
    for(int j = height - 2; j > 0; j--) {
        System.out.print(eight);
    for(int i = length - 2; i > 0; i--) {
        System.out.print(empty);
    } System.out.print(eight);
        System.out.println();
    }
    for(int i = 0; i < length; i++) {
        System.out.print(eight);
    }
        System.out.println();
    }
}
