import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main();
    }


        Main() throws IOException {
            int reshCount = 0;
            int orelCount = 0;
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите число");
            int d = Integer.parseInt(rd.readLine());
            double result = 0;
            for (int i = 0; i < d; i++) {
                result = Math.random();
                if (0.5 > result) {
                    System.out.println("Выпала Решка");
                    reshCount++;
                } else {
                    System.out.println("Выпал Орёл");
                    orelCount++;
                }
            }
            System.out.println("Количество выпавших(-шего) орлов(-рла): " + orelCount);
            System.out.println("Количество выпавших(-шей) решек(-шки): " + reshCount);
        }
}
