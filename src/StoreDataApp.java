import java.util.Scanner;

public class StoreDataApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        int option;

        do {
            System.out.println("--- Store Data App ---");
            System.out.println("1 - save data");
            System.out.println("2 - get data");
            System.out.println("0 - stop");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                    System.out.println("Text: ");
                    String text = scanner.nextLine();

                    System.out.println("1 - file");
                    System.out.println("2 - database");
                    option = scanner.nextInt();
                    switch(option){
                        case 1:
                            System.out.println("Save to File");
                            break;
                        case 2:
                            System.out.println("Save to Database");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Get data");
                    break;
            }


        } while (option != 0);
    }
}
