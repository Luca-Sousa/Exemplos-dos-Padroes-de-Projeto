/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Sistema {
    private final IPDF impressora;

    public Sistema(IPDF impressora) {
        this.impressora = impressora;
    }

    public void imprimir(String conteudoTXT) {
        System.out.println("Sistema: Solicitando impressao do arquivo .txt");
        impressora.imprimirPDF(conteudoTXT);
    }

    public static void main(String[] args) {
        ImpressoraPDF novaImpressora = new ImpressoraPDF();
        IPDF adapter = new PDFAdapter(novaImpressora);

        Sistema sistema = new Sistema(adapter);
        sistema.imprimir("Relatorio Final.txt");
    }
}

