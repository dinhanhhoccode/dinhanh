import org.junit.Test;
import static org.junit.Assert.*;

public class projecttest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Vòng lặp từ 1 đến 10
            if (isEven(i)) { // Gọi hàm kiểm tra số chẵn
                System.out.println(i + " là số chẵn.");
            } else {
                System.out.println(i + " không phải là số chẵn.");
            }
        }
    }

    // Hàm kiểm tra số chẵn
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Test case bằng JUnit
    @Test
    public void testIsEven() {
        assertTrue(isEven(2)); // Số chẵn
        assertFalse(isEven(3)); // Số lẻ
        assertTrue(isEven(0)); // Số chẵn
        assertFalse(isEven(-1)); // Số lẻ
    }

    @Override
    public String toString() {
        return "projecttest []";
    }
}
