package Diziler;

public class MatrisTranspozu {
    public static void main(String[] args) {

        int [][] arr = {{1,3},{1,2},{9,5}};

        for (int i=0;i<arr.length;i++)
        {
            for(int k=0;k<2;k++)
            {

                System.out.print(arr[i][k]+ " ");

            }
            System.out.println();
        }

        System.out.println("====TRANSPOZU====");
        for (int i=0;i<2;i++)
        {
            for(int k=0;k< arr.length;k++)
            {

                System.out.print(+arr[k][i]+" ");

            }
            System.out.println();
        }

    }
}
