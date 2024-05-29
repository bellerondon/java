package gastos;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Scanner dados = new Scanner(System.in);

        ArrayList<Credito>bancoA = new ArrayList<>();
        ArrayList<Debito>bancoB = new ArrayList<>();

        Credito novoCredito = new Credito(null, null, null, 0, 0, 0, 0, 0, 0, 0);
        Debito novoDebito = new Debito(null, null, null, 0, 0, 0, 0, 0, 0, 0);

        int n, p, d;
        int cCasa = 0;
        int cAlimentacao = 0;
        int cTransporte = 0;
        int cLazer = 0;

        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("-. VAMOS ORGANIZAR ESSES GASTOS -.");
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.");
        System.out.println("QUAL CONTA DESEJA UTILIZAR?");

        do {
            System.out.print("1-Credito\n2-Debito\n3-Resumo faturas\n0-Sair\nEscolha:");
            n = Integer.parseInt(dados.nextLine());

            switch (n) {
                case 1:
                    System.out.println("-.-.QUAL O TIPO DA DESPESA-.-.");
                    do {
                        System.out.print("1-Casa\n2-Alimentacao\n3-Transporte\n4-Lazer\n5-Relatorio cartão\n0-Sair\nEscolha:");
                        p = Integer.parseInt(dados.nextLine());
                        
                        switch (p) {
                            case 1:
                                cCasa ++;
                                break;
                            case 2:
                                cAlimentacao++;
                                break;    
                            case 3:
                                cTransporte++;
                                break;
                            case 4:
                                cLazer++;
                                break;
                            case 5:
                              System.out.println("CREDITO:");
                              for (Credito conta : bancoA) {
                                System.out.println(conta.toString());
                             }
                              p = 0;
                                break;
                            
                            default:
                              System.out.println("NÃO EXISTE ESSA OPÇÃO");   
                                break;//2
                        }
                            System.out.print("Descricao da compra ?(Oque voce comprou):");
                            String novoMotivo = dados.nextLine();

                            System.out.print("Qual a data da compra (XX/XX/XX):");
                            String novaData= dados.nextLine();

                            System.out.print("Qual foi o valor da compra:");
                            double novoValor = Float.parseFloat(dados.nextLine());

                            System.out.print("Voce parcelou a compra? (1-sim)(2-não):");
                            int escolha = Integer.parseInt(dados.nextLine());

                            if(escolha == 1){
                                System.out.print("Voce parcelou em quantas vezes?:");
                                int numParcelas = Integer.parseInt(dados.nextLine());
                                novoCredito.setParcelas(numParcelas);
                               
                            }


                            if(novoCredito.getLimiteCredito() >= novoValor ){
                              novoCredito.Saque(novoValor);
                              novoCredito = new Credito(novoMotivo, "credito", novaData, novoValor, cCasa, cAlimentacao, cTransporte, cLazer, novoCredito.getLimiteCredito(), novoCredito.getParcelas());  
                              bancoA.add(novoCredito);  
                            }
                            else{
                                System.out.println("sem limite");
                            }


                    } while (p!=0);
                    break;
                
                
                
                case 2:
                System.out.println("-.-.QUAL O TIPO DA DESPESA-.-.");
                do {
                    System.out.print("1-Casa\n2-Alimentacao\n3-Transporte\n4-Lazer\n5-Deposito\n6-Relatorio cartão\n0-Sair\nEscolha:");
                    p = Integer.parseInt(dados.nextLine());
                    
                    switch (p) {
                        case 1:
                            cCasa++;
                            break;
                        case 2:
                            cAlimentacao++;
                            break;    
                        case 3:
                            cTransporte++;
                            break;
                        case 4:
                            cLazer++;
                            break;
                        case 5:
                            System.out.println("Quanto deseja depositar :");
                            double novosaldo = Double.parseDouble(dados.nextLine());
                            novoDebito.novoSaldo(novosaldo);
                            break;
                        case 6:
                            System.out.println("DEBITO:");
                            for (Debito conta : bancoB) {
                                System.out.println(conta.toString());
                            }
                           
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("NÃO EXISTE ESSA OPÇÃO");
                            break;
                    }
                    
                    
                        System.out.print("Descricao da compra ? (O que você pagou): ");
                        String novoMotivo = dados.nextLine();
            
                        System.out.print("Qual a data da compra (XX/XX/XX): ");
                        String novaData = dados.nextLine();
            
                        System.out.print("Qual foi o valor da compra: ");
                        double novoValor = Double.parseDouble(dados.nextLine());
                        
                        if(novoDebito.getDeposito() >= novoValor ){ 
                        novoDebito = new Debito(novoMotivo, "Debito", novaData, novoValor, cCasa, cAlimentacao, cTransporte, cLazer, novoDebito.getDeposito(), novoDebito.getRendimento());  
                        bancoB.add(novoDebito);  
                        }
        
                    } while (p != 0);
                
                case 3:
                  System.out.println("MODALIDAE DEBITO:");
                  for (Credito conta : bancoA) {
                    System.out.println("CASA:"+novoCredito.getCasa()+"\nALIMENTACAO:"+novoCredito.getAlimentacao()+"\nTRANSPORTE:"+novoCredito.getTransporte()+"\nLAZER:"+novoCredito.getLazer());
                  }
                  
                  System.out.println("ITENS COMPRADOS NODEBITO:");
                  for (Debito conta : bancoB) {
                    System.out.println("CASA:"+novoDebito.getCasa()+"\nALIMENTACAO:"+novoDebito.getAlimentacao()+"\nTRANSPORTE:"+novoDebito.getTransporte()+"\nLAZER:"+novoDebito.getLazer());
                  }
                  
                  System.out.println("ITENS COMPRADOS NO CREDITO:");
                  for (Credito conta : bancoA) {
                    System.out.println(conta.toString());
                  }

                  System.out.println("ITENS COMPRADOS NODEBITO:");
                  for (Debito conta : bancoB) {
                    System.out.println(conta.toString());
                  }
                  break;  
                
                default:
                  System.out.println("NÃO EXISTE ESSA OPÇÃO"); 
                    break;//1 CASE
            
            }
                   
        } while (n!=0);
        

        
        dados.close();
    }
}
