package groupExercise1;

public class T1 {
    public static void main(String[] args) {


        int[] temp={55, 60, 70,75, 80, 85, 90};
        int highestNum=temp[0];
        int lowestNum=temp[0];

        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>highestNum){
                highestNum=temp[i];
            }
            if (temp[i]<lowestNum){
                lowestNum=temp[i];
            }
        }
        System.out.println("The highest temp in the week is going to be "+highestNum);
        System.out.println("The lowest temp in the week is going to be "+lowestNum);




    }
}
