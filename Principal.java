public class Principal {
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();


        circulo.setRaio(10);
        System.out.println(circulo.calcularArea());

        quadrado.setLado(2);
        System.out.println(quadrado.calcularArea());


        triangulo.setBase(3);
        System.out.println(triangulo.calcularArea());

        triangulo.setAltura(5);
        System.out.println(triangulo.calcularArea());
    }
}
