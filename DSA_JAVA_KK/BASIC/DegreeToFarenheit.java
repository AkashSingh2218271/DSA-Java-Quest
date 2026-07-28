import java.util.Scanner;

public class DegreeToFarenheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temp in degree");
        float temp = sc.nextFloat();

        float f = (temp * 9 / 5) + 32;
        System.out.println("Temp in Farenheit " + f);
    }
}