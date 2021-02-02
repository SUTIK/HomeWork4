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



    //Создаем, заполняем матрицу и вывобим на экран

    String matrix[][]= new String [10][10];
    Random rand = new Random();
    String sB ;

   void matrixInit (){

       for (int i=0;i<matrix.length;i++){
           for (int j=0;j<matrix[i].length;j++){

         matrix[i][j]=genStr(6);
         if (j%3==0) {
             matrix[i][j]= sB.valueOf(rand.nextDouble() * 100.0 ).substring(0,6);
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
       System.out.println("");
   }

    public void compareDiagonals (){
        System.out.println("Сравним диагонали матрицы ");
       for (int countI=0;countI<matrix.length;countI++){
           System.out.print(matrix[countI][countI]+" ");
           System.out.print(matrix[countI][matrix.length-(countI+1)]);
           System.out.println();
           System.out.println(matrix[countI][countI]==matrix[countI][matrix.length-(countI+1)]);
       }
    }

    public void arrayDiagonals (){
        String arr[]=new String[matrix.length];
        String arr1[]=new String[matrix.length];


        for (int countI=0;countI<matrix.length;countI++){
            arr[countI]=(matrix[countI][countI]);
            arr1[countI]=(matrix[countI][matrix.length-(countI+1)]);

        }

        String arrSum[] =new String[arr.length+arr1.length];

        for (int i=0;i<arr.length;i++) {
            arrSum[i]=arr[i];
        }

        for (int i=0;i<arr1.length;i++) {
            arrSum[arr.length+i]=arr1[i];
        }

        for (int i=0;i<arrSum.length;i++) {

            System.out.print(arrSum[i]+" ");
        }
        System.out.println();
        System.out.println();

//идем по массиву и каждый элемент скармливаем нашему методу определяющему число это или нет.
        StringBuilder sB1=new StringBuilder();
        for (int i=0;i<arrSum.length;i++) {

            //System.out.print( isDigit(arrSum[i])+" ");
            if (isDigit(arrSum[i])){


            }
            else {
                sB1.append (arrSum[i].substring(2,4)+"_");
                System.out.println(sB1);

            }

        }


    }
    //Метод определяет чисто это или нет
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
