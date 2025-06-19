/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class PDFAdapter implements IPDF {
    private final ImpressoraPDF impressoraPDF;

    public PDFAdapter(ImpressoraPDF impressoraPDF) {
        this.impressoraPDF = impressoraPDF;
    }

    @Override
    public void imprimirPDF(String arquivoTXT) {
        // Simula conversão de TXT para PDF
        String arquivoConvertido = converterTXTparaPDF(arquivoTXT);
        impressoraPDF.imprimirPDF(arquivoConvertido);
    }

    private String converterTXTparaPDF(String txt) {
        return "CONVERTIDO_PARA_PDF: " + txt;
    }
}

