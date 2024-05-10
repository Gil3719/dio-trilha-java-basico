

import iphone.Iphone;

public class IphoneDoUsuario {
    public static void main(String[] args) {
        Iphone usuarioIphone = new Iphone();

        usuarioIphone.tocar();
        usuarioIphone.pausar();
        usuarioIphone.selecionarMusica();

        usuarioIphone.ligar();
        usuarioIphone.atender();
        usuarioIphone.iniciarCorreioVoz();

        usuarioIphone.exibirPagina();
        usuarioIphone.adicionarNovaAba();
        usuarioIphone.atualizarPagina();
    }
    
}
