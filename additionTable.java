import java.util.Scanner;

class Addition_Table {
    static Scanner userinput = new Scanner(System.in);
    public  static  void main(String[] args){
        int userNumber;
        System.out.println("How many numbers would you like to add? Pick between 3 and 20");
        userNumber = userinput.nextInt();

        for (int row =0; row <= userNumber; row++) {
            for (int col =0; col <= userNumber; col++){
                System.out.format("%3d" ,row+col);
            }
            System.out.println("  ");
        }
    }
}
