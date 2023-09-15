import singleton.Constante;

public class App {
    public static void main(String[] args) throws Exception {
        Constante constante = Constante.getInstance();
        System.out.println(constante);
        constante.setDatos("PI", 3.1415);
        System.out.println(constante);
        Constante constante2 = Constante.getInstance();
        constante2.setDatos("IVA", 0.19);
        System.out.println(constante2);
    }
}
