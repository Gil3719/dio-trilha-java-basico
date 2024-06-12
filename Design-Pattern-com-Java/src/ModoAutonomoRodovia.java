public class ModoAutonomoRodovia implements ModoAutonomo {

    @Override
    public void ativarModoAutonomo() {
        System.out.println("Ativando modo autônomo rodovia");
        System.out.println("Seguindo para o destino");
        System.out.println("Aproveite a viagem");
        faixa();
        saida();
        chegada();
    }

    @Override
    public void destino() {
        System.out.println("Insira o local de destino");
        System.out.println("Calculando melhor rota para o destino");
        System.out.println("Quando estiver pronto ative o modo autônomo");
    }

    @Override
    public void emergencia() {
        System.out.println("Emergência detectada,parando o veículo");
    }
    
    private void chegada(){
        System.out.println("Destino alcançado");
    }

    private void faixa(){
        System.out.println("Trocando de faixa");
    }

    private void saida(){
        System.out.println("Trocando de rodovia");
    }
}
