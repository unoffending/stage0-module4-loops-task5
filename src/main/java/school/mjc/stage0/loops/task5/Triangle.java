package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
    String eight = "8";
        String empty = " ";
        int eightLength = 0;
        
        for(int i = 0; i < cathetusLength; i++) {
            eightLength += 1;
            for(int j = eightLength; j <= cathetusLength; j++) {
                System.out.print(eight);
            }
            System.out.println();
        }
    }
}
