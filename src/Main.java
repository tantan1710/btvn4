import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Bài 1

        //Cách 1: Do-While

/*        Scanner scanner = new Scanner(System.in);
        String select ="";
        int sum = 0;
        do {
            System.out.println("Mời bạn nhập số nguyên : ");
            int n = Integer.parseInt(scanner.nextLine());

            System.out.println("Do you do want to continnue?(Y/N)");
            select = scanner.nextLine();
            sum +=n;
        }while (select.equals("Y"));
            System.out.println("Tổng số nguyên người dùng vừa nhập là: "+ sum );*/

        //Cách 2: While

       /* Scanner scanner = new Scanner(System.in);
        String select ="Y";
        int sum = 0;

        while (select.equals("Y")){
            System.out.println("Mời bạn nhập số nguyên : ");
            int n = Integer.parseInt(scanner.nextLine());
            sum +=n;
            System.out.println("Do you do want to continnue?(Y/N)");
            select = scanner.nextLine();

        }
        System.out.println("Tổng số nguyên người dùng vừa nhập là: "+ sum);*/

        //Bài 2
        Scanner scanner = new Scanner(System.in);
        String select ="";
        do {
            System.out.println("Mời bạn nhập tên sinh viên");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập địa chỉ sinh viên: ");
            String address = scanner.nextLine();
            System.out.println("Mời bạn nhập tuổi: ");

            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Tên sinh viên là: " + name);
            System.out.println("Địa chỉ sinh viên là: " + address);
            System.out.println("Tuổi của sinh viên là: "+ age);

            System.out.println("Do you do want to continnue?(Y/N)");
            select = scanner.nextLine();
        }while(select.equals("Y"));
    }
}
