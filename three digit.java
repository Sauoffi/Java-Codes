import java.util.Scanner;
public static void main(String args[]){
    Scanner num = new Scanner(System.in);
    System.out.println("Enter the three digit number :")
    int length = String.valueOf(num).length();
    if (length<3){
        System.out.println("Its valid!!");
    }else{
        System.out.println("Its invalid entry!!"+num);
    }
}
