public class FigurePainter {

    public static void simpleFigurePainter(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void aFigurePainter() {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void bFigurePainter() {
        for(int i = 1; i <= 8; i++){
            for(int j = 8; j >= 1; --j){
                if(j < i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // I don't know why dFigurePainter paint this.
    // I can not find the problem in this algorithm. In my opinion, he should draw a figure d.
    public static void dFigurePainter() {
        for(int i = 1; i <= 8; i++){
            for(int j = 8; j >= 1; --j){
                if(j > i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void eFigurePainter() {
        for(int i = 1; i <= 8; i++){
            switch (i){
                case 1:
                    System.out.println("# # # # # # # #");
                    break;
                case 8:
                    System.out.println("# # # # # # # #");
                    break;
                default:
                    System.out.println("#             #");
                    break;
            }
        }
        System.out.println();
    }

    // 140IQ algorithm =))
    public static void fFigurePainter() {
        System.out.println("# # # # # # # #");
        System.out.println("  # ");
        System.out.println("    #");
        System.out.println("      #");
        System.out.println("        #");
        System.out.println("          #");
        System.out.println("            #");
        System.out.println("# # # # # # # #");
        System.out.println();

    }
}
