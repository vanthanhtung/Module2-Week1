import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        int USD, VND;
        System.out.println("Nhap vao so USD: ");
        USD = scanner.nextInt();
        VND = USD * rate;
        System.out.println("VND la: "+VND);
    }
}
