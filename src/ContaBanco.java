public class ContaBanco {
    String nomeCliente;
    int conta;
    String agencia;
    double saldo;

    public ContaBanco() {}

    public ContaBanco(String nomeCliente, int conta, String agencia, double saldo) {
        this.nomeCliente = nomeCliente;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
      }

      public String getNomeCliente() {
      return this.nomeCliente;
      }

      public int getConta() {
        return this.conta;
      }

      public String getAgencia() {
        return this.agencia;
      }

      public double getSaldo() {
        return this.saldo;
      }
}
