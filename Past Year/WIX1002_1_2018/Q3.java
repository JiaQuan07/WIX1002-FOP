import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter font size: ");
        int size = scanner.nextInt();
        System.out.print("Enter font type: ");
        scanner.nextLine();
        String type = scanner.nextLine();
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int num = scanner.nextInt();

        createEight(size,type,num);
    }

    public static void createEight(int size, String type, int num){
        if(num == 1){
            for(int i=0;i<size+2;i++){
                System.out.print(type);
            }
            for(int j=0;j<size;j++){
                System.out.println();
                System.out.print(type);
                for(int k=0;k<size;k++){
                    System.out.print(" ");
                }
                System.out.print(type);
            }
            System.out.println();
            for(int i=0;i<size+2;i++){
                System.out.print(type);
            }
            for(int j=0;j<size;j++){
                System.out.println();
                System.out.print(type);
                for(int k=0;k<size;k++){
                    System.out.print(" ");
                }
                System.out.print(type);
            }
            System.out.println();
            for(int i=0;i<size+2;i++){
                System.out.print(type);
            }
        }
        else if(num ==2){
            for(int i=0;i<3+size*2;i++){
                System.out.print(type);
            }
            for(int i=0;i<size;i++){
                System.out.println();
                System.out.print(type);
                for(int j=0;j<size;j++){
                    System.out.print(" ");
                }
                System.out.print(type);
                for(int j=0;j<size;j++){
                    System.out.print(" ");
                }
                System.out.print(type);
            }
            System.out.println();
            for(int i=0;i<size*2+3;i++){
                System.out.print(type);
            }
        }
    }
}