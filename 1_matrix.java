public class matrixop{
    public static void main(String args[]){
//creating two matrices
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};
//creating another matrix to store the Addition and Multiplication of two matrices
        int c[][]=new int[3][3];  //3 rows and 3 columns
        int d[][]=new int[3][3];
        System.out.println("the addition of matrix");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                d[i][j]=a[i][j]+b[i][j];    //use - for Addition
                System.out.print(d[i][j]+"\t");
            }
            System.out.println();//new line
        }
        System.out.println("the multiplication of matrix");
//multiplying and printing multiplication of 2 matrices
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }//end of k loop
                System.out.print(c[i][j]+"\t");  //printing matrix element
            }//end of j loop
            System.out.println();//new line
        }
    }}