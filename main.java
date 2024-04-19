public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { // Vòng lặp từ 1 đến 10
            if (i % 2 == 0) { // Kiểm tra số chẵn
                System.out.println(i + " là số chẵn.");
            } else {
                System.out.println(i + " không phải là số chẵn.");
            }
        }
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
