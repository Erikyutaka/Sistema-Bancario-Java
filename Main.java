public class Main {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Erik", "525.884.158-81");
        Cliente c2 = new Cliente("Felipe", "515.685.974-65");
        Cliente c3 = new Cliente("Jacare", "456.123.486-13");

        Conta contaSimples = new Conta(102,1002,c1);
        ContaCorrente contaCorrente = new ContaCorrente(102,2005,c2,500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(102,3000,c3);

        System.out.println("=== Contas Criadas ===");
        System.out.println(contaSimples);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        System.out.println("\n=== Depósitos ===");

        if(contaSimples.depositar(200))
            System.out.println("Depósito realizado (Conta simples)");
        else
            System.out.println("Depósito não realizado");

        if(contaCorrente.depositar(-50))
            System.out.println("Depósito realizado (Conta Corrente)");
        else
            System.out.println("Depósito não realizado");

        if(contaPoupanca.depositar(300))
            System.out.println("Depósito realizado (Conta Poupança)");
        else
            System.out.println("Depósito não realizado");

        System.out.println("\n=== Contas Atualizadas ===");
        System.out.println(contaSimples);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        System.out.println("\n=== Saques ===");

        if(contaCorrente.sacar(100))
            System.out.println("Saque realizado (Conta Corrente)");
        else
            System.out.println("Saque não realizado");

        if(contaPoupanca.sacar(100))
            System.out.println("Saque realizado (Conta Poupança)");
        else
            System.out.println("Saque não realizado");

        System.out.println("\n=== Contas Atualizadas ===");
        System.out.println(contaSimples);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        System.out.println("\n=== Saques acima do limite ===");

        if(contaCorrente.sacar(5000))
            System.out.println("Saque realizado (Conta Corrente)");
        else
            System.out.println("Saque não realizado - limite excedido");

        if(contaPoupanca.sacar(8000))
            System.out.println("Saque realizado (Conta Poupança)");
        else
            System.out.println("Saque não realizado - limite excedido");

        System.out.println("\n=== Contas Atualizadas ===");
        System.out.println(contaSimples);
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

    }
}