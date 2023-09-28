package ex06;

/*
 * # Ex06
Crie uma classe chamada {Ingresso}, que possui um valor e um método {escreveValor()}. Em seguida:

Crie uma classe {VIP}, que herda {Ingresso} e possui um valor adicional. Crie um método que retorne o valor do ingresso VIP 
(com o adicional incluído).
	
Crie uma classe {Normal}, que herda {Ingresso} e possui um método que imprime: "Ingresso Normal".
	
Crie uma classe {CamaroteInferior} (que possui a localização do ingresso e métodos para acessar e imprimir esta localização) 
e uma classe {CamaroteSuperior}, que é mais cara (possui valor adicional). Esta última possui um método para retornar o valor do ingresso.
 Ambas as classes herdam a classe {VIP}.
 */
public class CamaroteSuperior extends vip{
    
    @Override
    public void setValor(double valor) {
        this.valor = valor+15;
    }

    @Override
    public double getValor() {
        return valor;
    }




    
}
