import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double laiXuat = 8.71;
        System.out.println("Mời bạn nhập số tiền gửi: ");
        double tienGui = Double.parseDouble(sc.nextLine());
        System.out.println("Mời bạn nhập số tháng mà ba muốn gửi");
        int thangGui = Integer.parseInt(sc.nextLine());
        double soTienLai =  (tienGui*(laiXuat/12)*thangGui);
        System.out.println(soTienLai);
        main(args);
    }
}