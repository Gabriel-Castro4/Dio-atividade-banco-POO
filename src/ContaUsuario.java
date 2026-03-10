public class ContaUsuario {
    private String nomeUser;
    private String cpf;
    private String senha;
    private double saldo;
    private double chequeEspecial;
    private boolean ativacaoChequeEspecial = false;

    ContaUsuario(){
        this.nomeUser = getNomeUser();
        this.cpf = getCpf();
        this.senha = getSenha();
        this.saldo = getSaldo();
    }


    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public boolean isAtivacaoChequeEspecial() {
        return ativacaoChequeEspecial;
    }

    public void setAtivacaoChequeEspecial(boolean ativacaoChequeEspecial) {
        if (saldo <= 500.00){
            chequeEspecial = 50.00;
        }else{
            chequeEspecial = saldo / 2;
            ativacaoChequeEspecial = true;
        }
        this.ativacaoChequeEspecial = ativacaoChequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;

    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public double getSaldo() {
        return saldo;
    }

    void ativacaoChequeEspecial(){
        if(saldo <= 0){
            ativacaoChequeEspecial = true;
            saldo = saldo + chequeEspecial;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

   public void consultarSaldo(){
        System.out.println(saldo);
    }

    public void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
    }

    public void sacar(double valorSaque){
        saldo = saldo - valorSaque;

    }
    public void pagarBoleto(double valorBoleto){
        saldo = saldo - valorBoleto;
    }
    public void consultarChequeEspecial(){
        System.out.println(chequeEspecial);
    }


}
