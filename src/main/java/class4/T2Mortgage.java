package class4;

public class T2Mortgage {
    public static void main(String[] args) {
        double mortgage=4.5;
        int price=40000;

        if (mortgage>4.5){
            System.out.println("will not buy a house");
        }else{
            System.out.println("user will consider buying");
            if(mortgage>50000){
                System.out.println("user will take a loan");
            }else {
                System.out.println("user will pay cash");
            }
        }




    }}
