package Assignment;

public class MatrixAddition {

    public static void main(String[] args) {

        int a1[][] ={{1,2,3},
                     {2,3,4},
                     {3,4,5}};

        int a2[][] = {{2,3,4},
                      {3,4,5},
                      {4,5,6}};

        int sum[][] = new int[3][3];
        int i;
        int j;
        System.out.println("Elements of the first matrix ");
        for(i=0; i<a1.length; i++) {
            for (j = 0; j < a1.length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println("Elements of the second matrix ");
            for(i=0; i< a2.length; i++){
                for(j=0; j<a2.length; j++){
                    System.out.print(a2[i][j] + " ");
                }
                System.out.println();
            }
        System.out.println("sum of the two matrices ");
            for(i=0; i<3; i++){
                for(j=0; j<3; j++){
                    sum[i][j] = a1[i][j] + a2[i][j];
                }
            }
            for(i=0; i<3; i++){
                for(j=0; j<3; j++){
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

