public class ModoAutonomoUrbano implements ModoAutonomo {

    @Override
    public void ativarModoAutonomo() {
        System.out.println("Ativando modo autônomo urbano");
        System.out.println("Seguindo para o destino");
        System.out.println("Aproveite a viagem");
        curva();
        sinalVermelho();
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
    
    private void sinalVermelho(){
        System.out.println("Parando no sinal vermelho");
    }

    private void curva(){
        System.out.println("Fazendo curva");
    }

    private void chegada(){
        System.out.println("Destino alcançado");
    }
}
