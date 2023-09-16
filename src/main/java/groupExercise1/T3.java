package groupExercise1;

public class T3 {
    public static void main(String[] args) {

        int [][] numbers= {
                {2,3,4,5},
                {7,8,9,10},
                {13,14,15,16},
                {21,22,23,24}
        };
        for (int i=0; i<numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }
            System.out.println();
        }




    }
}
