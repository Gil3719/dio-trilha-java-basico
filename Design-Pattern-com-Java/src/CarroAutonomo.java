public class CarroAutonomo {
    
    private ModoAutonomo modoAutonomo;

    public void setModoAutonomo(ModoAutonomo modoAutonomo){
        this.modoAutonomo = modoAutonomo;
    }

    public void ativarModoAutonomo(){
        modoAutonomo.ativarModoAutonomo();
    }

    public void destino(){
        modoAutonomo.destino();
    }

    public void emergencia(){
        modoAutonomo.emergencia();
    }
}
