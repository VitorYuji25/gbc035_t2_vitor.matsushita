package entities;

import enum_entites.Categoria;
import enum_entites.Tipo_Embalagem;
import interfaces.Exibir;

public class Bebida extends Item implements Exibir{

    private Double tamanho_embalagem;
    private Tipo_Embalagem tipo_embalagem;
    private static Double valor_pago_cozinheiro;

    public Bebida(String nome_comercial, String codigo_id, Double preco_unitario, Double preco_de_custo, Categoria categoria,
            Double tamanho_embalagem, Tipo_Embalagem tipo_embalagem) {
        super(nome_comercial, codigo_id, preco_unitario, preco_de_custo, categoria);
        this.tamanho_embalagem = tamanho_embalagem;
        this.tipo_embalagem = tipo_embalagem;
    }

    public static Double getValor_pago_cozinheiro() {
        return (valor_pago_cozinheiro != null) ? valor_pago_cozinheiro : 0.0;
    }

    public static void setValor_pago_cozinheiro(Double valor_pago_cozinheiro) {
        Bebida.valor_pago_cozinheiro = valor_pago_cozinheiro;
    }

    public Double getTamanho_embalagem() {
        return tamanho_embalagem;
    }

    public void setTamanho_embalagem(Double tamanho_embalagem) {
        this.tamanho_embalagem = tamanho_embalagem;
    }

    public Tipo_Embalagem getTipo_embalagem() {
        return tipo_embalagem;
    }

    @Override
    public String toString() {
        return super.toString() + ", o tamanho da embalagem da bebida cadastrada é: "
                + String.format("%.2f", tamanho_embalagem) + ", tipo de embalagem: " + tipo_embalagem;
    }

    @Override
    public String getTipo() {
        return "Bebida";
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes da Bebida: " + this.getNome_comercial() + " " + this.getTipo_embalagem());
    }

}