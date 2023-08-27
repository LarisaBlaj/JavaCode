package arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] myArray = new int[3][3];
        myArray[0][0] = 5;
        myArray[1][2] = 7;


        System.out.println(myArray[0][0]);
        System.out.println(myArray[0][1]);


        myArray[2] =new int[]{6,2,9};



        System.out.println(myArray[2][1]);

        System.out.println("-----------------------------");

        for(int i = 0; i< myArray.length; i++){
            for(int j = 0; j< myArray[i].length; j++){
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
