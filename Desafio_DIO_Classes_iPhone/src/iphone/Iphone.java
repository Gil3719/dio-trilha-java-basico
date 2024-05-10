package iphone;

import browser.Browser;
import reprodutor_Musical.ReprodutorMusical;
import telefone.Telefone;

public class Iphone implements ReprodutorMusical, Telefone, Browser {
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página da web");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no browser");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }
}
