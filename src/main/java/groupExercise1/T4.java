package groupExercise1;

public class T4 {
    public static void main(String[] args) {


        int [][] numbers= {
                {1,2,3,4},
                {88,77,99,100},
                {13,14,15,16},
                {21,22,23,24}
        };
        int countEven=0;
        int countOdd=0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if(numbers[i][j] %2==0){
                    countEven++;

                }if (numbers[i][j] %2!=0){
                    countOdd++;
                }


            }


        }

        System.out.println("The sum of even numbers in the 2D array "+countEven);
        System.out.println("The sum of odd numbers in the 2D array "+countOdd);



    }
}
