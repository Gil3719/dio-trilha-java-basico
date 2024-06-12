public class Teste {
    public static void main(String[] args) throws Exception {
        

        ModoAutonomo urbano = new ModoAutonomoUrbano();
        ModoAutonomo rodovia = new ModoAutonomoRodovia();

        CarroAutonomo ca = new CarroAutonomo();
        ca.setModoAutonomo(urbano);
        ca.destino();
        ca.ativarModoAutonomo();
        ca.emergencia();
        
        System.out.println("==============");

        ca.setModoAutonomo(rodovia);
        ca.destino();
        ca.ativarModoAutonomo();
        ca.emergencia();
    }
}
