public class Main {

    public static void main(String[] args) {

        int[][] matris=new int[2][3];
        for(int i=0;i<matris.length;i++){
            for (int j = 0; j < matris[0].length; j++) {
                matris[i][j]=(i+j)*(2+i)+(3*j);
            }
        }
        
        System.out.println("Matris :");
        for(int i=0;i<matris.length;i++){
            for (int j = 0; j < matris[0].length; j++) {
                System.out.print(matris[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Transpoze :");
        int[][] transpoze=new int[matris[0].length][matris.length];
        for(int i=0;i<transpoze.length;i++){
            for (int j = 0; j < transpoze[0].length; j++) {
                transpoze[i][j]=matris[j][i];
                System.out.print(transpoze[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
