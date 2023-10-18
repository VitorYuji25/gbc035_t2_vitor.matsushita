package ex03;

public abstract class ContaCorrente {

         protected float saldo ;
         protected int estado ; // 1= conta ativa 2= conta inativa
         protected int numConta ;
         protected int senha ;
        
         public ContaCorrente(){

         }


         public ContaCorrente ( float val , int num , int pwd ) {
         numConta = num ;
         senha = pwd ;
         saldo = val ;
         estado = 1; // conta ativa
         }
        
         public abstract boolean debitaValor ( float val , int pwd );
        
         public abstract void debitaValor ( double val );
        
         public abstract void creditaValor ( int pwd , float val );
         
         public float getSaldo ( int pwd ) {
         if ( senha == pwd )
         return saldo ;
         else
         return -1; // indicando que houve problema na senha
         }
        
         protected int getEstado ( int pwd ) {
         if ( senha == pwd )
         return estado ;
         else
         return -1;
        }
        
         protected void setEstado ( int pwd , int e ) {
         if ( senha == pwd )
         estado = e;
         }


        public int getNumConta() {
            return numConta;
        }


        public void setNumConta(int numConta) {
            this.numConta = numConta;
        }


        protected abstract boolean isSenha ( int pwd );
        }
