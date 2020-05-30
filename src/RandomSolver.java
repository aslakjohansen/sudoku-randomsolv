import java.util.Random;
import java.lang.*;

class RandomSolver {
    
    public static void solve (Sudoku s) {
        Random rand = new Random();
        
        while (true) {
            // save
            s.push();
            
            // fill out
            for (int x=0; x<9 ; x++) {
                for (int y=0; y<9 ; y++) {
                    if (s.get(x, y)==0) {
                        s.set(x, y, rand.nextInt((9 - 1) + 1) + 1);
                    }
                }
            }
            
            // check
            if (s.check()) return;
            
            // restore
            s.pop();
        }
    }
    
    public static void main (String[] args) throws Exception {
//        for (int i=0 ; i<100 ; i++)
//            System.out.println((new Random()).nextInt(9));
//        System.out.println(1/0);
        
//        Sudoku s = new Sudoku("827154396965327148341689752593468271472513689618972435786235914154796823239841567");
//        Sudoku s = new Sudoku("8271543969.53.71.83416897525934682714.25.36.9618972435786235914154796823239841567");
        Sudoku s = new Sudoku("8271543969.53.71.83416897525934682714.25.36.96189724357862359141.4786823239841567");
        s.print();
        long t0 = System.nanoTime();
        solve(s);
        long t1 = System.nanoTime();
        s.print();
        float stime = ((float) (t1-t0))/1000000000;
        System.out.println("Solved in "+stime+"s");
        System.out.println(s.check());
    }
}
