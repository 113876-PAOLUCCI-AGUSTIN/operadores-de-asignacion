public class Main {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 5;
        Integer c = 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // ASIGNACIÓN DE SUMA.
        a += b; // a = (a + b)
        System.out.println(a);

        // ASIGNACIÓN DE RESTA.
        b -= c; // b = (b - c)
        System.out.println(b);

        // ASIGNACIÓN DE MULTIPLICACIÓN.
        c *= c; // c= (c * c)
        System.out.println(c);


        // ASIGNACIÓN DE DIVISION.
        a /= b; // a = (a / b )
        System.out.println(a);

        // ASIGNACIÓN DE RESTO.
        a %= b; // a = a % b aquí los valores de a= 5 y b = 3. A/B, resto: 2, ese valor se asigna.
        System.out.println(a);
    }
}