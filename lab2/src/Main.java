public class Main {
    public record Color(int r, int g, int b, int a) {
        public Color {
            if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0 || a > 255) {
                throw new IllegalArgumentException("Wszystkie kanaly musza byc w zakresie 0-255");
            }
        }

        public Color(int r, int g, int b) {
            this(r, g, b, 0);
        }
    }

    public static void main(String[] args) {
        Color c1 = new Color(10, 255, 0);
        Color c2 = new Color(0, 255, 0, 128);

        System.out.println("C1: " + c1.toString());
        System.out.println("C2: " + c2.toString());

        System.out.println("C1: Czerwony " + c1.r + " Zielony " + c1.g + " Niebieski " + c1.b + " Alpha " + c1.a);
        System.out.println("C2: Czerwony " + c2.r + " Zielony " + c2.g + " Niebieski " + c2.b + " Alpha " + c2.a);

        // obsluga blednych wartosci
        new Color(0, 5, 6, 3000);
    }
}