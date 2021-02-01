package ue.senla.sutko.task4;
import java.util.Random;


public class Matrix {




//генерирует случайную строку из заданного кол-ва символов
    public static String genStr(int size){
        size=6;
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int count=0;

            while (sb.length()<size){
                sb.insert(count,s.charAt(r.nextInt(26)));
            }
            return sb.toString();
    }





    String matrix[][]= new String [10][10];
    Random rand = new Random();
    String sB ;
   void matrixInit (){

       for (int i=0;i<matrix.length;i++){
           for (int j=0;j<matrix[i].length;j++){

         matrix[i][j]=genStr(6);
               if (j%3==0) {
                   matrix[i][j]= sB.valueOf(Math.round(rand.nextDouble() * 99999.0) / 10.0);
               }
               }
           System.out.println( );
       }
       System.out.println("Матрица заполнена");

       for (int i=0;i<matrix.length;i++){
           for (int j=0;j<matrix[0].length;j++){
               System.out.print( (matrix[i][j]+" ")  );
              
           }
           System.out.println( );
       }

   }

}