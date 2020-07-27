import java.util.Scanner;

public class DTHCN {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter widht: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is: "+ area);
    }
}

