package src;

public class Main {
    public static void main(String[] args) {
        var base = new AssinaturaBase();
        base.mostrar();

        var p1 = new Pacote1(base);
        p1.mostrar();

        var p2 = new Pacote2(p1);
        p2.mostrar();

        var p3 = new Pacote2(p2);
        p3.mostrar();

        var p4 = new Pacote2(p3);
        p4.mostrar();

        var p5 = new Pacote2(p4);
        p5.mostrar();
    }
}
