package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
    String eight = "8";
    String empty = " ";
    int emptyLength = -1;
    int eightLength = height + 2;
    for(int i = height - (height/2); i > 0; i--) {
        emptyLength++;
        eightLength-=2;
        for(int j = 1; j <= emptyLength; j++) {
            System.out.print(empty);
        }
        for(int j = 0; j < eightLength; j++) {
            System.out.print(eight);
        }
        for(int j = 0; j < emptyLength; j++) {
            System.out.print(empty);
         } System.out.println();
     }
    
        for(int i = height - (height/2); i > 0; i--) {
        emptyLength--;
        eightLength+=2;
        if(eightLength > height) { break; }
        for(int j = 1; j <= emptyLength; j++) {
            System.out.print(empty);
        }
        for(int j = 0; j < eightLength; j++) {
            System.out.print(eight);
        }
        for(int j = 0; j < emptyLength; j++) {
            System.out.print(empty);
         } System.out.println();
     }
    
    }
}
