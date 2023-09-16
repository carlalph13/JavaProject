package groupExercise1;

public class T8 {
    public static void main(String[] args) {

        int [] numbers= {2, 3, 4, 5, 21, 22, 23};
        int max=0;
        int min=numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];

            }
            if (numbers[i]>max){
                max = numbers[i];
            }

        }
        System.out.println(max);
        System.out.println(min);







    }
}
