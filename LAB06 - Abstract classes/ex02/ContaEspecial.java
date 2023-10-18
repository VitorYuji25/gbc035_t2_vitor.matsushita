package ex02;

import ex01.ContaCorrente;

public class ContaEspecial extends ContaCorrente{
    private double limite;

    

    public ContaEspecial(float val, int num, int pwd, double limite) {
        super(val, num, pwd);
        this.limite = 0;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
        if (limite ==  0){
            System.out.println("Conta será alterada para conta comum");
            ContaComum novaConta = new ContaComum();
        }
    }


    public boolean debitaValor ( float val , int pwd ) {
            if ( pwd != senha )
            return ( false ); // senha deve ser vá lida
            if ( estado != 1 )
            return ( false ); // conta deve ser ativa
            if ( val <= 0 )
            return ( false ); // val > 0
            if ( val > saldo )
            return ( false );
           
            saldo -= val ;
            if ( saldo == 0 )
            estado = 2; // torna conta inativa
            return ( true ) ;
        }
           
    public void debitaValor ( double valDebito ) {
            saldo -= valDebito ;
            }

    protected boolean isSenha ( int pwd ) {
                if ( senha == pwd )
                return true ;
                else
                return false ;
                }

    public void creditaValor ( int pwd , float val ) {
            if ( senha == pwd )
            saldo += val ;
                    }

    
    }
