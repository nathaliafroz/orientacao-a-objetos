
package cliente;

public class TestaMetodosConta {
    public static void main(String[] args) {
    
        Conta c = new Conta();
        
        c.deposita(1000);
        c.imprimeExtrato();
        
        c.saca(200);
        c.imprimeExtrato();
        
        double saldoDisponivel = c.consultaSaldoDisponivel();
        System.out.println("SALDO DISPONÍVEL: " + saldoDisponivel);
    
    }
}
