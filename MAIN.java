 
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int i, VidaMonstro = 0, dado = 0, AtaqueMonstro = 0, danot = 0, ataqueMago = 0, vidaMago = 0, defesaMago = 0 , ataqueLutador = 0, vidaLutador = 0, defesaLutador = 0, vidaArqueiro = 0, ataqueArqueiro = 0, defesaArqueiro =0 , defesaEvilMago = 0, ataqueEvilMago = 0, vidaEvilMago = 0, turno = 1, ataqueTotalEM = 0, AtaqueMonstroMago = 0, DefesaMonstroMago = 0, VidaMonstroMago = 0, ataqueGuarda = 0, vidaGuarda = 0, defesaGuarda = 0, EscolhaHabilidade = 0, vidaBossArqueiro = 0, ataqueBossArqueiro = 0, defesaBossArqueiro = 0, defesaMonstro = 0, vidaMonstro1 = 0, vidaMonstro2 = 0, vidaMonstro3 = 0, vidaConjunta = 0, ataqueConjunto = 0, defesaMonstro1 = 0, defesaMonstro2 = 0, defesaMonstro3 = 0, dadoEsquiva = 0, ataqueBossMago, defesaBossMago, vidaBossMago;
    String Classe, Escolha = "null", EscolhaDado; 
    //Regras:  
      for (i = 0; i < 300; i++){
        System.out.print("\r\n"); 
         }
      System.out.println("Regras:\n1 - O Jogo é um RPG classico.\n2 - Todas as escolhas e resultados do dado obterão diferentes finais e consequencias. \n3 - Se quiser em qualquer momento do jogo sair, digite 'Break'\n4 - Se mantenha as opções dadas, caso contrário irá gerar erros e seu jogo será interrompido\n5 - Se divirta!\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
   try {
      Thread.sleep(11000);
    } catch (InterruptedException ex) {}
    for (i = 0; i < 300; i++){
      System.out.print("\r\n");
    }

    System.out.println("Para começar digite 'iniciar'!");
    String inicio = sc.next(); 
    if (inicio.equalsIgnoreCase("iniciar")){
      for (i = 0; i < 300; i++){
      System.out.print("\r\n");
    } //Criando as Classes:

        do{
        System.out.println("Escolha sua Classe:\n 1 - Mago\n2 - Lutador\n 3 - Arqueiro\n (digite o numero ou o nome da classe)");
       Classe = sc.next();
        if (Classe.equals("1") || Classe.equalsIgnoreCase ("Mago")){

          vidaMago = 1500;
          defesaMago = 300;
          ataqueMago = 50;

              System.out.printf ("Sua Vida: %d", vidaMago);
              System.out.printf("\nSeu Ataque: %d", ataqueMago);
              System.out.printf ("\nSua Habilidade eh Fora da Lei\n\n\nFora da Lei: (Passivo) Todo turno voce possui 20 porcento de chance de equivar o ataque de seu adversário\n\n\n\n");
              try {
                  Thread.sleep(5000);
                  } catch (InterruptedException ex) {}
        }
        else if (Classe.equals ("2") || Classe.equalsIgnoreCase ("Lutador")){

          vidaLutador = 1800;
          defesaLutador = 300;
          ataqueLutador = 30;

              System.out.printf ("Sua Vida: %d", vidaLutador);
              System.out.printf("\nSeu Ataque: %d", ataqueLutador);
              System.out.printf ("\nSua Habilidade eh o Terror do Ogro\n\n\nTerror do Ogro: (Passivo) Aumenta o dano em 10 porcento no primeiro hit ao inimigo (reseta ao atacar outros inimigos)\n\n\n\n\n");
               try {
                  Thread.sleep(5000);
                  } catch (InterruptedException ex) {}

        }
        else if (Classe.equals("3") || Classe.equalsIgnoreCase("Arqueiro")){

          vidaArqueiro = 1300;
          defesaArqueiro = 600;
          ataqueArqueiro = 80;

               System.out.printf ("Sua Vida: %d", vidaArqueiro);
               System.out.printf("\nSeu Ataque: %d", ataqueArqueiro);
               System.out.println ("\nSua Habilidade eh Olhos de Águia\n\n\nOlhos de Águia: (Ativo) Pula um turno para no próximo causar 300 porcento de dano ao adversário. \n\n\n\n");
                try {
                  Thread.sleep(5000);
                  } catch (InterruptedException ex) {}

        }
        else if (Classe.equalsIgnoreCase ("break")){
          System.exit(0);
            }
      }while(ataqueMago == 0 && vidaMago == 0 && ataqueArqueiro == 0 && vidaArqueiro == 0 && vidaLutador == 0 && ataqueLutador ==0);
try {
      Thread.sleep(7000);
    } catch (InterruptedException ex) {}
for (i = 0; i < 300; i++){
      System.out.print("\r\n");
    } 
    //Monstros
    //Evil Mago
    vidaEvilMago = 700;
    ataqueEvilMago = 80;
    defesaEvilMago = 300;
    
    vidaGuarda = 1000;
    ataqueGuarda = 90;
    defesaGuarda = 170;

    VidaMonstroMago = 2500;
    AtaqueMonstroMago = 100;
    DefesaMonstroMago = 30;

    VidaMonstro = 1000;
    AtaqueMonstro = 100;
    defesaMonstro = 120;
    
    vidaBossArqueiro = 2500;
    ataqueBossArqueiro = 100;
    defesaBossArqueiro = 100;

    vidaMonstro1 = 600;
    vidaMonstro2 = 200;
    vidaMonstro3 = 400; 
    ataqueConjunto = 60;
    defesaMonstro1 = 200;
    defesaMonstro2 = 100;
    defesaMonstro3 = 100;
    vidaBossMago = 1500;
    ataqueBossMago =  50;
    defesaBossMago = 400;

    //Mensagem Inicial para todos:
      System.out.println("Em um mundo onde todas as criaturas são magicas e especiais, como pode alguem realmente ser especial? Ser visto como alguem diferente? Muitos dizem que a realidade que torna alguem diferente eh a sua bondade, outros dizem que o que realmente importa eh o poder. \n\n\n\nQuem esta certo?\n\n\n\n Apenas um deles pode fazer a sua opiniao ser vista como certa. \n\n\n\nMas a bondade nao deixa nunca de reinar, e a verdade eh que se uma pessoa ainda possui em seu coracao a verdade e o altruismo, o mundo nunca sera entregue aqueles que o poder ja corrompeu o coracao.\n\n\n\n\n\n\n\n\n");
    try {
      Thread.sleep(30000);
    } catch (InterruptedException ex) {}
    for (i = 0; i < 300; i++){
      System.out.print("\r\n");
    }
            //História mago
        if (Classe.equals("1") || Classe.equalsIgnoreCase ("Mago")){
            System.out.println("\"Quanto saber eh necessario para ser o melhor?\"\n\n\n\n");
                   try {
                        Thread.sleep(8000);
                       } catch (InterruptedException ex) {}
                   System.out.println("Assim continuavam a perguntar incessantemente para o pobre homem, que tudo que queria era nada saber.\n\n\n\n");
                   try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                   System.out.println("Se para muitos o saber era tudo que importava, o homem sabia melhor, ele entendia o real significado do que era saber demais e sofrer por isso.\n\n\n\n");
                    try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                     System.out.println("Sua cidade inteira fora destruida em busca dele e de seu saber, e como seria dificil entender a unica coisa que ainda ele, o mais sabio entre os homens, nao sabia: \n\n\n\n\n\n");
                   
                    try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                     System.out.println("\'Por que eu?\'\n\n\n\n\n\n\n");
                       try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                     for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                      System.out.println("A casa nao mudou em nada.\n\n\n\n");
                       try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                          System.out.println("No fundo sua vontade de entender ainda eh grande, como entender?.\n\n\n\n");
                       try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                       System.out.println("Quem sou eu?\n\n\n\n");
                       try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                       System.out.println("Apos esta pequenas reflexao, voce ignora este subito pensamento e continua a fazer seus experimentos.\n\n\n\n");
                       try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                       System.out.println("Sua vida se torna apenas a mistura de substancias, nada mais faz sentido. Por que eu sou especial?.\n\n\n\n");
                       try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                       System.out.println("Para realizar a mistura, role o dado, as consequencias serao diferentes dependendo a resposta obtida.\n\n\n\n");
                       try {
                        Thread.sleep(1000);
                       } catch (InterruptedException ex) {}
                       for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                      if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {

                        System.out.println("Lançando o Dado...\n\n\n\n");
                      try {
                        Thread.sleep(3000);
                       } catch (InterruptedException ex) {}
                        dado = (int) (Math.random() * 9 + 1);
                        
                        System.out.println("Numero: " + dado);
                          try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                      }


                     
                      //Dado impar, mago misterioso    
                      if (dado % 2 == 0){
                            for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                          System.out.println("Poucos segundos antes da sua pocao ficar pronta voce ouve como se fosse uma colméia ao longe, que vai...\n\n\n\n");
                      //trys
                        try {
                          Thread.sleep(10000);
                            } catch (InterruptedException ex) {}
                            System.out.println("se aproximando...\n\n\n\n\n\n\n\n");
                        try {
                          Thread.sleep(4000);
                            } catch (InterruptedException ex) {}
                            System.out.println("se aproximando...\n\n\n\n\n\n\n\n");
                        try {
                          Thread.sleep(4000);
                            } catch (InterruptedException ex) {}
                          for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      System.out.println("\"UM MAGO?\"\n\n\n\n\n\n\n\n\n\n\n\n");
                        try {
                          Thread.sleep(4000);
                            } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Voce deve lutar com o mago! Ele recebeu sua pocao mas ela nao estava completa, entao ele acabou perdendo 100 de vida e 10 de ataque\n O mago misterioso possui:\n Vida: 700\nAtaque: 80\nDefesa: 200\n\n\n\n\n\n");
                        try {
                          Thread.sleep(11000);
                            } catch (InterruptedException ex) {}
                             for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        //Luta
                    do{
                    if (defesaEvilMago < 0){
                      defesaEvilMago = 0;
                    }
                    if(vidaEvilMago < 0){
                      vidaEvilMago = 0;
                      System.out.println("Sua vida: " + vidaMago + "\nVida do Inimigo: " + vidaEvilMago + "\n\n\n\n\n\n\n\n\n");
                      for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                    }
                    if (turno % 2 != 0){
                       System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                                  try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                            System.out.println("Numero: "+ dado);
                            try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                             
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                            if (defesaEvilMago < danot && defesaEvilMago != 0){
                                  danot = danot - defesaEvilMago;
                                  defesaEvilMago = 0;
                                  vidaEvilMago -= danot;
                                  System.out.printf("A armadura do mago foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaEvilMago + "\n\n\n\n\n\n");

                            }
                            else if (defesaEvilMago > danot){
                                if ((defesaEvilMago - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaEvilMago -= danot;
                                }
                                else if ((defesaEvilMago - danot) <= 100 ){
                                    danot /= 2;
                                    defesaEvilMago -= danot;
                                    vidaEvilMago -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + " de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para "+ defesaEvilMago + " mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaEvilMago <= 0){
                                  vidaEvilMago -= danot;
                                  System.out.printf("\nVoce causou: " + danot + " de dano em uma armadura nula!\n\n\n\n\n");
                                }
                                try {
                                  Thread.sleep(6000);
                                 } catch (InterruptedException ex) {}
                              }
                              
                          else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                            dadoEsquiva = (int) (Math.random() * 9 + 1);
                            System.out.println("Dado: " + dadoEsquiva);
                            if(dadoEsquiva <= 2){
                              System.out.printf ("O numero do dado de seu adversario foi " + dado + " entao, voce esquivou com sua passiva! Voce nao sofre dano nesta rodada");
                            }
                            else {
                              dado = (int) (Math.random() * 9 + 1);
                              danot = ataqueEvilMago * dado;
                              if ((defesaMago - danot) > 100){
                              defesaMago -= danot;
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaMago - danot) <= 100 ){
                                danot = danot/2;
                                defesaMago -= danot;
                                vidaMago -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf ("\nVoce recebeu: " + danot + " de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaMago +" \nSua vida foi reduzida em "+ vidaMago +"\n\n\n\n\n");
                                }
                              }
                             else if(defesaMago <= 0){
                                  vidaMago -= danot;
                                  System.out.printf ("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+ vidaMago +" de vida total\n\n\n\n\n");
                                }
                                else if (defesaMago < danot && defesaMago != 0){
                                 danot = danot - defesaMago;
                                  defesaMago = 0;
                                  vidaMago -= danot;
                                  System.out.printf ("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + " de dano, a sua vida total eh "+ vidaMago +"\n\n\n\n\n");
                                  
                                  }
                                  
                                }
                                try {
                                  Thread.sleep(15000);
                                 } catch (InterruptedException ex) {}
                              }
                            
            
                       for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 

                  if (turno == 1){
                       for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      System.out.println("\'Quem eh voce?\'\n\n\n\n\n\n");
                       try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                      System.out.println("Sua pergunta lhe da mais perguntas que respostas.\n\n\n\n\n");
                       try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                      }            
                   else if(turno == 2){  
                       for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      System.out.println("\'Quem eh voce?\'\n\n\n\n\n\n");
                       try {
                                  Thread.sleep(6000);
                                 } catch (InterruptedException ex) {}
                      System.out.println("Pergunta voce novamente e dessa vez nao pretende mais nada.\n\n\n\n\n\n");
                       try {
                                  Thread.sleep(6000);
                                 } catch (InterruptedException ex) {}
                      System.out.println("Sua voz eh como um ar aspero pelos ouvidos do mago, que prontamente responde: \n\n\n\n\n\n");
                       try {
                                  Thread.sleep(6000);
                                 } catch (InterruptedException ex) {}
                      for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      try {
                                  Thread.sleep(5000);
                                 } catch (InterruptedException ex) {}
                      System.out.println("\'Como saber quem eh quem neste mundo?\'\n\n\n\n\n\n\n\n\n\n\n");
                      try {
                                  Thread.sleep(9000);
                                 } catch (InterruptedException ex) {}
                    }
                  else if (turno == 4){
                       for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      if (dadoEsquiva <= 2){
                        System.out.println("Voce desvia do ataque, mas as palavras do mago ainda continuam lhe assombrando \n\n\n\n\n\n\n");
                          try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                      System.out.println("E agora, de repente, sua pergunta mudou\n\n\n\n\n\n\n");
                          try {
                                 Thread.sleep(7000);
                                } catch (InterruptedException ex) {}
                            
                          }
                      else if (dado > 2){
                        System.out.println("Voce toma este ataque, voce se sente mais fraco, mas ainda, nada eh tao forte como a duvida");
                        try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                      }
                      System.out.println("\'Quem somos nos?\'");
                        try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                                 for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("\'Quem sou eu?\'");
                      try {
                                  Thread.sleep(5000);
                                 } catch (InterruptedException ex) {}
                      
                  }
                 
                        
                      
 
                      turno += 1;
                    }while(vidaEvilMago > 0 && vidaMago > 0);
                     for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      if (vidaEvilMago <= 0){
                        System.out.println("Voce matou o mago, mas sua cabeca ainda possui tantas questoes, como ele chegou ali? Porque ele chegou ali?\n\n\n\n\n\n\n\n\n");
                        try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}

                        for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Voce entao pega todas as suas forças e então decide ir até a cidade. Descobrir quem é voce, e o que significa tudo isso.\n\n\n\n\n\n");
                         try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                          for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                            } 
                        System.out.println("No começo da sua viagem suas intenções eram claras: ver o mago da cidade\n\n\n\n\n");
                        try {
                              Thread.sleep(8000);
                              } catch (InterruptedException ex) {}
                        System.out.println("Porem no meio do caminho foi-se encontrado um jovem garoto que aos prantos disse:\n\n\n\n\n\n\n ");
                        try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                        System.out.println("\"Sen..hor, não faz naquela direção! O mago sumiu e as pessoas estão desesperadas por causa do... do...\"\n\n\n\n\n\n\n\n");
                        try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}  

                        System.out.println("\"Por causa de quem?\" - pergunta voce prontamente \n\n\n\n\n\n\n");
                        try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                        System.out.println("\"Por causa do novo mago...\" - diz com um tom que lhe arrepia completamente\n\n\n\n\n\n");
                        try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                        System.out.println("O resto da sua viagem foi um completo desperdicio, um grande peso surge em sua mente e você não entende o porquê, mas continua rumando a cidade! \n\n\n\n\n\n\n\n");
                        try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                         for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Chegando lá você encontra o mago e ele imediatamente lhe reconhece. Como teria este mago lhe reconhecido? Sendo que nem você conhece a si mesmo?\n\n\n\n\n\n\n\n");
                         for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Sua memória lhe prega peças, você sabe algumas coisas, mas nada sobre quem é você, talvez este mago seja sua unica chance de saber quem você é \n\n\n\n\n\n\n\n\n");
                         try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                        System.out.println("Voce: 1 - \"Luta\" com o mago ou \n2 -\"Discute\" com ele?\n\n\n\n\n\n\n\n");
                        EscolhaDado = sc.next();
                        for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                          if (EscolhaDado.equalsIgnoreCase ("Luta") || EscolhaDado.equals ("1")) {
                            System.out.println("\"Voce irá me enfrentar novamente? Nao se lembra o que aconteceu da última vez?\"\n\n\n\n\n\n\n\n\n");
                             try {
                              Thread.sleep(9000);
                              } catch (InterruptedException ex) {}
                                for (i = 0; i < 300; i++){
                                  System.out.print("\r\n");
                                }
                                System.out.println("Sua luta Começa!\n\n\n\n\n\n\n\n\n\n\n\n");
                                  try {
                              Thread.sleep(5000);
                              } catch (InterruptedException ex) {}
                                 do{
                            for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                            System.out.println("Sua vida: " + vidaMago + "\nVida do Inimigo: " + vidaBossMago + "\n\n\n\n\n\n\n\n\n");
                                 
                    if (turno % 2 != 0){
                       System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                                  try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                            System.out.println("Numero: "+ dado);
                            try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                             
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                            if (defesaBossMago < danot && defesaBossMago != 0){
                                  danot = danot - defesaBossMago;
                                  defesaBossMago = 0;
                                  vidaBossMago -= danot;
                                  System.out.printf("A armadura do mago foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaBossMago + "\n\n\n\n\n\n");

                            }
                            else if (defesaBossMago > danot){
                                if ((defesaBossMago - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaBossMago -= danot;
                                }
                                else if ((defesaBossMago - danot) <= 100 ){
                                    danot /= 2;
                                    defesaBossMago -= danot;
                                    vidaBossMago -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + " de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para "+ defesaBossMago + " mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaBossMago <= 0){
                                  vidaBossMago -= danot;
                                  System.out.printf("\nVoce causou: " + danot + " de dano em uma armadura nula!\n\n\n\n\n");
                                }
                                try {
                                  Thread.sleep(6000);
                                 } catch (InterruptedException ex) {}
                              }
                              
                          else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                            dadoEsquiva = (int) (Math.random() * 9 + 1);
                            System.out.println("Numero: " + dadoEsquiva);
                            if(dadoEsquiva <= 2){
                              System.out.printf ("O numero do dado de seu adversario foi " + dadoEsquiva + " entao, voce esquivou com sua passiva! Voce nao sofre dano nesta rodada");
                            }
                            else {
                              dado = (int) (Math.random() * 9 + 1);
                              danot = ataqueBossMago * dado;
                              if ((defesaMago - danot) > 100){
                              defesaMago -= danot;
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaMago - danot) <= 100 ){
                                danot = danot/2;
                                defesaMago -= danot;
                                vidaMago -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf ("\nVoce recebeu: " + danot + " de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaMago +" \nSua vida foi reduzida em "+ vidaMago +"\n\n\n\n\n");
                                }
                              }
                             else if(defesaMago <= 0){
                                  vidaMago -= danot;
                                  System.out.printf ("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+ vidaMago +" de vida total\n\n\n\n\n");
                                }
                                else if (defesaMago < danot && defesaMago != 0){
                                 danot = danot - defesaMago;
                                  defesaMago = 0;
                                  vidaMago -= danot;
                                  System.out.printf ("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + " de dano, a sua vida total eh "+ vidaMago +"\n\n\n\n\n");
                                  
                                  }
                                  
                                }
                                try {
                                  Thread.sleep(15000);
                                 } catch (InterruptedException ex) {}
                              }
                       for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
 
                      turno += 1;
                    }while(vidaBossMago > 0 && vidaMago > 0); 
                      if (vidaBossMago > 0){
                        
                      }
                          } //Fim Luta Mago Boss
                          else if (EscolhaDado.equalsIgnoreCase ("Discute") || EscolhaDado.equals ("2")) {
                            System.out.println("\"Você sabe de fato o que o significa tudo isso?\n\n\n\n\n\n\n\n");
                          
                          }
                      }
                    
                      else if (vidaMago <= 0){
                        for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Voce morreu! Tente novamente.\n\n\n\n\n\n\n");
                        System.exit(0);
                      }
                      }
                      
                      //Dado par
                      else if(dado % 2 != 0){
                            vidaMago += 120;
                            ataqueMago += 10;
                            vidaEvilMago = 700;
                            ataqueEvilMago = 80;
                            defesaEvilMago = 300; 

                            for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                            System.out.printf("Parabens! Sua pocao deu certo e voce recebeu 120 de Vida e 10 de Ataque! seus atributos ficaram:\nVida: %d\nAtaque: %d\n\n\n\n\n\n", vidaMago, ataqueMago);
                            //Mas que barulho é esse?
                            try{
                                Thread.sleep(6000);
                               } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                            System.out.println("De repente voce ouve um barulho em seu jardim, mas, nao faz sentido, quem estaria nessa regiao?\n\n\n\n\n\n");
                            try{
                                Thread.sleep(6000);
                               } catch (InterruptedException ex) {}
                            System.out.println("Voce chega no jardim, com sua arma em maos para verificar.\n\n\n\n\n\n\n");
                            try{
                                Thread.sleep(4000);
                               } catch (InterruptedException ex) {}
                            System.out.println("Nada eh visto a principio, entao, voce decide ir mais fundo. \n\n\n\n\n Suas maos tremem\n\n\n\n\nSua cabeca pensa:\n\n\n\n\n\n");
                            try{
                                Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                            }
                            System.out.println("\'Quem conseguiu me achar?\'\n\n\n\n\n\n\n\n\n");
                            try{
                                Thread.sleep(10000);
                               } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                            }
                            System.out.println("Voce nunca tinha se tocado que algum dia alguem poderia lhe achar, no entanto, voce procura denovo, e se depara com algo terrivel");
                              try{
                                Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                            System.out.println("Voce ve uma crianca sendo torturada por um monstro. Sua decisao nunca foi tao facil, se revelar ao mundo ou salvar a crianca?\n\n\n\n\n\n\n\n");
                            System.out.println("Digite 1 para se manter quieto ou 2 para salvar a criança, tambem pode digitar \"salvar\" ou \"ficar\"");
                            EscolhaDado = sc.next();
                            if (EscolhaDado.equalsIgnoreCase ("salvar") || EscolhaDado.equals ("2")){
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                                System.out.println("Voce vai para a luta!");
                                 System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 

                           System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                           EscolhaDado = sc.next();
                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                        if (defesaEvilMago < danot && defesaEvilMago != 0){
                                  danot = danot - defesaEvilMago;
                                  defesaEvilMago = 0;
                                  vidaEvilMago -= danot;
                                  System.out.println("A armadura do mago foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaEvilMago);

                            }
                            else if (defesaEvilMago > danot){
                                if ((defesaEvilMago - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaEvilMago -= danot;
                                }
                                else if ((defesaEvilMago - danot) <= 100 ){
                                    danot /= 2;
                                    defesaEvilMago -= danot;
                                    vidaEvilMago -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaEvilMago + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaEvilMago == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula!" + defesaEvilMago + "\n\n\n\n\n");
                                }
                                
                              
                       for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                          System.out.println("\"Como voce achou este lugar?\"\n\n\n\n\n\n");
                           try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                 for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                          System.out.println("Grita voce enquanto bate ferozmente no monstro\n\n\n\n\n");
                          for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                            System.out.println("COMO \n\n\n\n\n\n\n\n");
                            try {
                                  Thread.sleep(2000);
                                 } catch (InterruptedException ex) {}
                            System.out.println("VOCE\n\n\n\n\n\n\n\n");
                            try {
                                  Thread.sleep(2000);
                                 } catch (InterruptedException ex) {}
                            System.out.println("ME \n\n\n\n\n\n\n\n");
                            try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                              System.out.println("...\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                            System.out.println("De repende voce acorda em uma caverna, sua raiva o fez matar o monstro? Como voce foi parar em um local desconhecido?\n\n\n\n\n\n");
                             try {
                                  Thread.sleep(10000);
                                 } catch (InterruptedException ex) {}
                             for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                             System.out.println("Voce ve um homem ao seu lado:\n\n\n\"Quem eh voce? Onde eu estou?\"\n\n\n\n\n\n\n\n\n");
                             try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                             System.out.println("\"Voce nao sabe? hahahaha\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("\"Bem vindo a cadeia!\"\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                              System.out.println("\"Como eu posso estar preso? Eu estava salvando uma crianca de um monstro\"\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("\"Monstro?\" - Pergunta o homem que agora eh visivelmente um guarda - \"Aquele era o pai da crianca, senhor\"\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("De repente tudo fica escuro em sua mente, voce esta ficando louco? Nao... Sera a pocao? Nao...");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("NAO\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("NAO\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("NAOOOOOOOOOOOO\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                                 for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");}
                              System.out.println("Voce grita, espereia, bate sua cabeca na parede, mas nao a torna menos confusa\n\n\n\n\n\n");

                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Voce entende que possui apenas duas opcoes, tentar fugir ou aceitar sua sentenca, o que fazer? Digite 1 ou Fugir, ou Aceitar ou 2: \n\n\n\n\n\n\n\n\n");
                              EscolhaDado = sc.next();
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                            if (EscolhaDado.equalsIgnoreCase ("Fugir") || EscolhaDado.equals ("1")) {
                              System.out.println("Voce tem tudo que precisa, magia e determinação!\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Facilmente voce escapa da cela e da de encontro com um guarda, eh hora de lutar a sua saida!\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                      turno = 1;
                      do{
                          for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Sua vida: " + vidaMago + "\nVida do Inimigo: " + vidaGuarda + "\n\n\n\n\n\n\n\n\n");
                      if (turno % 2 != 0){
                       System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                        if (defesaGuarda < danot && defesaGuarda != 0){
                                  danot = danot - defesaGuarda;
                                  defesaGuarda = 0;
                                  vidaGuarda -= danot;
                                  System.out.println("A armadura do mago foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaGuarda);

                            }
                            else if (defesaGuarda > danot){
                                if ((defesaGuarda - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaGuarda -= danot;
                                }
                                else if ((defesaEvilMago - danot) <= 100 ){
                                    danot /= 2;
                                    defesaGuarda -= danot;
                                    vidaGuarda -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaGuarda + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaGuarda <= 0){
                                  vidaGuarda -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula!\n\n\n\n\n");
                                }
                                
                              }
                              
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dadoEsquiva = (int) (Math.random() * 9 + 1);
                            if(dadoEsquiva <= 2){
                              System.out.println("O numero do dado de seu adversario foi " + dado + "entao, voce esquivou com sua passiva! Voce nao sofre dano nesta rodada\n\n\n\n\n\n");
                            }
                            else {   
                              dado = (int) (Math.random() * 9 + 1);
                              danot = ataqueGuarda * dado;
                              if ((defesaMago - danot) > 100 && defesaMago != 0){
                              defesaMago -= danot;
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaMago - danot) <= 100 && defesaMago != 0){
                                danot = danot/2;
                                defesaMago -= danot;
                                vidaMago -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + " de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaMago +"\n Sua vida foi reduzida para "+ vidaMago +"\n\n\n\n\n");
                                }
                               else if(defesaMago == 0){
                                  vidaMago -= danot;
                                  System.out.printf("Sua armadura eh nula! E voce sofreu " + danot +" como dano verdadeiro, lhe deixando com "+ vidaMago +" de vida total\n\n\n\n\n");
                                }
                                else if (defesaMago < danot && defesaMago != 0){
                                 danot = danot - defesaMago;
                                  defesaMago = 0;
                                  vidaMago -= danot;
                                  System.out.println("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + "  de dano, a sua vida total eh "+ vidaMago);
                                  }
                                
                              }
                              
                            }
                        try {
                                  Thread.sleep(10000);
                                 } catch (InterruptedException ex) {}
                            }
                       for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                            turno += 1;
                            } while (vidaGuarda > 0 && vidaMago > 0);
                              if (vidaGuarda <= 0){
                              System.out.println("Consegui! \n\n\n\n\n\n\n\n");
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("Voce da de encontro com outro guarda! Tera que lutar novamente ou tentar a sorte passando sem ser visto. Suas chances de passar despercebido sao de 30 porcento. Voce: 1 - Luta ou 2 - foge");
                                EscolhaDado = sc.next();
                                
                                if (EscolhaDado.equalsIgnoreCase ("Foge") || EscolhaDado.equalsIgnoreCase ("2")){
                                  try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                dado = (int) (Math.random() * 9 + 1);
                                if (dado <= 3){
                                   for (i = 0; i < 300; i++){
                                    System.out.print("\r\n");
                                  }
                                  System.out.println("Voce consegue escapar!\n\n\n\n\n\n\n");
                                    try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                    System.out.println("Enquanto voce fuge, ainda resta uma pergunta em sua mente: \n\n\n\n\n");
                                  try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                     for (i = 0; i < 300; i++){
                                      System.out.print("\r\n");
                                      }
                                System.out.println("\"Quem sou eu?\"\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                  try {
                                  Thread.sleep(11000);
                                 } catch (InterruptedException ex) {}
                                 System.exit(1);
                                }
                                else if (dado > 3){
                                  EscolhaDado = "Luta";
                                   for (i = 0; i < 300; i++){
                                    System.out.print("\r\n");
                                    }
                                  System.out.println("Voce nao conseguiu escapar e tera que Lutar!\n\n\n\n\n");
                                }
                                else {
                                  System.exit(1);
                                  }
                                }
                                if (EscolhaDado.equalsIgnoreCase ("Luta") || EscolhaDado.equalsIgnoreCase("1")){
                                  System.out.println("Voce parece reconhecer esta pessoa...\n\n\n\n\n\n\n\n");
                                    try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("O MONSTRO?");
                                  try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                      System.out.print("\r\n");
                                      }
                                  System.out.println("O Monstro, digo, o pai da crianca possui estes atributos:\nVida:"+ VidaMonstroMago +"\nAtaque: "+ AtaqueMonstroMago + "\nDefesa: " + DefesaMonstroMago + "\n\n\n\n\n\n\n");
                              turno = 1;
                              do {
                                
                                 if (turno % 2 != 0){
                       System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                        if (DefesaMonstroMago < danot && DefesaMonstroMago != 0){
                                  danot = danot - DefesaMonstroMago;
                                  DefesaMonstroMago = 0;
                                  VidaMonstroMago -= danot;
                                  System.out.println("A armadura do mago foi reduzida para 0 e voce causou "+ danot + "  de dano, a vida total do seu alvo eh "+ VidaMonstroMago);

                            }
                            else if (DefesaMonstroMago > danot){
                                if ((DefesaMonstroMago - danot) > 100){
                                   System.out.println("Dano anulado");
                                   DefesaMonstroMago -= danot;
                                }
                                else if ((DefesaMonstroMago - danot) <= 100 ){
                                    danot /= 2;
                                    DefesaMonstroMago -= danot;
                                    VidaMonstroMago-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + " de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ DefesaMonstroMago + " mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(DefesaMonstroMago == 0){
                                  VidaMonstroMago -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula!\n\n\n\n\n");
                                }
                                
                              }
                              
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                            if(dado <= 2){
                              System.out.println("O numero do dado de seu adversario foi " + dado + "entao, voce esquivou com sua passiva! Voce nao sofre dano nesta rodada");
                            }
                            else {
                              danot = AtaqueMonstroMago * dado;
                              if ((defesaMago - danot) > 100){
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaMago - danot) <= 100 ){
                                danot = danot/2;
                                defesaMago -= danot;
                                vidaMago -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + "de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaMago +"Sua vida foi reduzida em "+ vidaMago +"\n\n\n\n\n");
                                }
                                }
                                else if(defesaMago == 0){
                                  vidaMago -= danot;
                                  System.out.printf("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+ vidaMago +" de vida total\n\n\n\n\n");
                                }
                              }
                            }
                      
                      turno += 1;
                              }while(vidaMago != 0 && VidaMonstroMago != 0);        
                              if (VidaMonstroMago <= 0){
                                System.out.println("Voce derrotou o monstro e conseguiu fugir, mas a que custo?\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("Nao so agora voce matou um pai, mas tambem nao respondeu a pergunta mais basica, e a mais importante: \n\n\n\n\n\n\n\n\n\n\n\n");
                                
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Quem eu sou?\" \n\n\n\n\n\n\n\n\n\n\n");
                              }
                              else if (vidaMago <= 0){
                              System.out.println("Caído\n\n\n\n derrotado\n\n\n\n eh isto que se resume voce agora.\n\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("tudo perdido, e porque? Por um monstro! Ah... um pai\n\n\n\n\n");
                                 try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("O rei se aproxima de voce, abaixa, e o olha com tristeza, as lagrimas chegam a cair em voce semimorto ao chao. \n\n\n\n\n\n");
                                 try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("\"Adeus amigo, nunca mais teras a gloria de outrora, mas sempre teras ela no meu coracao.\"\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                System.out.println("\"Quem foi ele, Senhor?\" - Pergunta o Guarda que o derrotou\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Foi o maior mago que ja existiu, filho. Nunca mais teremos alguem como ele.\"");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Nossa Senhor, mas entao ele era imbativel? Como eu o derrotei? Nao sou o maior nem da minha familia.\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Ele nao foi o maior por seus duelos, mas por sua disciplina, sua lealdade...\"\n\n E com dificuldade ele pronuncia as ultimas palavras que voce ouviu: \n\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(12000);
                              } catch (InterruptedException ex) {}
                               for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                              System.out.println("\"Ser o melhor amigo que eu poderia ter\"");
                              }
                            }
                                  }
                              else if (vidaMago <= 0){
                              System.out.println("Caído\n\n\n\n derrotado\n\n\n\n eh isto que se resume voce agora.\n\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("tudo perdido, e porque? Por um monstro! Ah... um pai\n\n\n\n\n");
                                 try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("O rei se aproxima de voce, abaixa, e o olha com tristeza, as lagrimas chegam a cair em voce semimorto ao chao. \n\n\n\n\n\n");
                                 try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("\"Adeus amigo, nunca mais teras a gloria de outrora, mas sempre teras ela no meu coracao.\"\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                System.out.println("\"Quem foi ele, Senhor?\" - Pergunta o Guarda que o derrotou\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Foi o maior mago que ja existiu, filho. Nunca mais teremos alguem como ele.\"");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Nossa Senhor, mas entao ele era imbativel? Como eu o derrotei? Nao sou o maior nem da minha familia.\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Ele nao foi o maior por seus duelos, mas por sua disciplina, sua lealdade...\"\n\n E com dificuldade ele pronuncia as ultimas palavras que voce ouviu: \n\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(12000);
                              } catch (InterruptedException ex) {}
                               for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                              System.out.println("\"Ser o melhor amigo que eu poderia ter\"");

                                }
                                else if (EscolhaDado.equalsIgnoreCase("Break")){
                                  System.exit(1);
                                }
                              }
                              //Fim Fuga
                            else if (EscolhaDado.equalsIgnoreCase ("Aceitar") || EscolhaDado.equals ("2")) {
                              System.out.println("talvez a decisao mais dificil seja a mais correta. Nao fugir pode fazer sua cabeca voltar ao normal, ou ao menos voce pensou.\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Voce nao tem tempo nem de terminar um racicionio, quando subitamente um homem com roupas finas e um linguajar rebruscado chega em sua cela.\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Velho amigo! Em que fundo de poço voce chegou. Oh Ceus! Nao posso ver voce assim.\" - o homem desconhecido vira para o guarda e diz - \"Que crime cometeu este homem? Soltem-lo imediatamente!\"\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Voce ri da ideia, teriam eles mandado o bobo da corte?\n\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Quando o guarda respondeu: \"Sim, magestade\" voce tremeu");
                               try {
                                  Thread.sleep(4000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Meus Deuses, eu chamei o rei de bobo da corte?Espera, este eh o rei? Como eu nao o reconheci... Velho... amigo?\"\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("O rei lhe convida para um jantar no parque real e lhe disse: \n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Agora que voltaste, poderemos finalmente acabar aquele projeto, aquele maldito mago nao sabera o que o atingiu!\" e lhe da um agradavel tapa nas costas");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Voce nao entende quem eh este mago, quem seria este rei ou que projeto ele estava falando\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(4000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Ao ver sua expressao o rei compreende e lhe pergunta: \"Que lhe acomete caro amigo? Por acaso perdeste conciencia do que fazes aqui?\"\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Sua resposta de sim o deixa intrigado e ele o manda de volta a cela. Nem seu amigo o quis? O que aconteceu comigo?\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Seu pensamento voa, quem sou eu? Um ar toma sua cabeca, e surge a pergunta: \n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("\"Quem sou eu?\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                            }
                         }   //fim salvar   
                    else if (EscolhaDado.equalsIgnoreCase("ficar") || EscolhaDado.equals("2")){
                      System.out.println("Você tem certeza? A criança está na presença de um monstro. Digite \"sim\" ou \"nao\"\n\n\n\n\n\n\n\n");
                      EscolhaDado = sc.next();
                      if (EscolhaDado.equalsIgnoreCase("sim")) {
                        System.out.println("Sua escolha de não salvar a criança gerou fez com que sua cidade fosse destruída, e você foi morto pelo novo mago da cidade. \n\n\n\n\n\n\n");
                        System.exit(1);
                      }
                     else{
                          for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                                System.out.println("Voce vai para a luta!");
                                 System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 

                           System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                           EscolhaDado = sc.next();
                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                        if (defesaEvilMago < danot && defesaEvilMago != 0){
                                  danot = danot - defesaEvilMago;
                                  defesaEvilMago = 0;
                                  vidaEvilMago -= danot;
                                  System.out.println("A armadura do mago foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaEvilMago);

                            }
                            else if (defesaEvilMago > danot){
                                if ((defesaEvilMago - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaEvilMago -= danot;
                                }
                                else if ((defesaEvilMago - danot) <= 100 ){
                                    danot /= 2;
                                    defesaEvilMago -= danot;
                                    vidaEvilMago -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaEvilMago + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaEvilMago == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula!" + defesaEvilMago + "\n\n\n\n\n");
                                }
                                
                              
                       for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                          System.out.println("\"Como voce achou este lugar?\"\n\n\n\n\n\n");
                           try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                 for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                          System.out.println("Grita voce enquanto bate ferozmente no monstro\n\n\n\n\n");
                          for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                            System.out.println("COMO \n\n\n\n\n\n\n\n");
                            try {
                                  Thread.sleep(2000);
                                 } catch (InterruptedException ex) {}
                            System.out.println("VOCE\n\n\n\n\n\n\n\n");
                            try {
                                  Thread.sleep(2000);
                                 } catch (InterruptedException ex) {}
                            System.out.println("ME \n\n\n\n\n\n\n\n");
                            try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                              System.out.println("...\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                            System.out.println("De repende voce acorda em uma caverna, sua raiva o fez matar o monstro? Como voce foi parar em um local desconhecido?\n\n\n\n\n\n");
                             try {
                                  Thread.sleep(10000);
                                 } catch (InterruptedException ex) {}
                             for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                             System.out.println("Voce ve um homem ao seu lado:\n\n\n\"Quem eh voce? Onde eu estou?\"\n\n\n\n\n\n\n\n\n");
                             try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                             }
                             System.out.println("\"Voce nao sabe? hahahaha\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("\"Bem vindo a cadeia!\"\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  }
                              System.out.println("\"Como eu posso estar preso? Eu estava salvando uma crianca de um monstro\"\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("\"Monstro?\" - Pergunta o homem que agora eh visivelmente um guarda - \"Aquele era o pai da crianca, senhor\"\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("De repente tudo fica escuro em sua mente, voce esta ficando louco? Nao... Sera a pocao? Nao...");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("NAO\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("NAO\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                              System.out.println("NAOOOOOOOOOOOO\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                                 } catch (InterruptedException ex) {}
                                 for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");}
                              System.out.println("Voce grita, espereia, bate sua cabeca na parede, mas nao a torna menos confusa\n\n\n\n\n\n");

                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Voce entende que possui apenas duas opcoes, tentar fugir ou aceitar sua sentenca, o que fazer? Digite 1 ou Fugir, ou Aceitar ou 2: \n\n\n\n\n\n\n\n\n");
                              EscolhaDado = sc.next();
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                            if (EscolhaDado.equalsIgnoreCase ("Fugir") || EscolhaDado.equals ("1")) {
                              System.out.println("Voce tem tudo que precisa, magia e determinação!\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Facilmente voce escapa da cela e da de encontro com um guarda, eh hora de lutar a sua saida!\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                      turno = 1;
                      do{
                          for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                        System.out.println("Sua vida: " + vidaMago + "\nVida do Inimigo: " + vidaGuarda + "\n\n\n\n\n\n\n\n\n");
                      if (turno % 2 != 0){
                       System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                        if (defesaGuarda < danot && defesaGuarda != 0){
                                  danot = danot - defesaGuarda;
                                  defesaGuarda = 0;
                                  vidaGuarda -= danot;
                                  System.out.println("A armadura do mago foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaGuarda);

                            }
                            else if (defesaGuarda > danot){
                                if ((defesaGuarda - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaGuarda -= danot;
                                }
                                else if ((defesaEvilMago - danot) <= 100 ){
                                    danot /= 2;
                                    defesaGuarda -= danot;
                                    vidaGuarda -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaGuarda + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaGuarda <= 0){
                                  vidaGuarda -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula!\n\n\n\n\n");
                                }
                                
                              }
                              
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dadoEsquiva = (int) (Math.random() * 9 + 1);
                            if(dadoEsquiva <= 2){
                              System.out.println("O numero do dado de seu adversario foi " + dado + "entao, voce esquivou com sua passiva! Voce nao sofre dano nesta rodada\n\n\n\n\n\n");
                            }
                            else {   
                              dado = (int) (Math.random() * 9 + 1);
                              danot = ataqueGuarda * dado;
                              if ((defesaMago - danot) > 100 && defesaMago != 0){
                              defesaMago -= danot;
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaMago - danot) <= 100 && defesaMago != 0){
                                danot = danot/2;
                                defesaMago -= danot;
                                vidaMago -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + " de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaMago +"\n Sua vida foi reduzida para "+ vidaMago +"\n\n\n\n\n");
                                }
                               else if(defesaMago == 0){
                                  vidaMago -= danot;
                                  System.out.printf("Sua armadura eh nula! E voce sofreu " + danot +" como dano verdadeiro, lhe deixando com "+ vidaMago +" de vida total\n\n\n\n\n");
                                }
                                else if (defesaMago < danot && defesaMago != 0){
                                 danot = danot - defesaMago;
                                  defesaMago = 0;
                                  vidaMago -= danot;
                                  System.out.println("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + "  de dano, a sua vida total eh "+ vidaMago);
                                  }
                                
                              }
                              
                            }
                        try {
                                  Thread.sleep(10000);
                                 } catch (InterruptedException ex) {}
                            }
                       for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                            turno += 1;
                            } while (vidaGuarda > 0 && vidaMago > 0);
                              if (vidaGuarda <= 0){
                              System.out.println("Consegui! \n\n\n\n\n\n\n\n");
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("Voce da de encontro com outro guarda! Tera que lutar novamente ou tentar a sorte passando sem ser visto. Suas chances de passar despercebido sao de 30 porcento. Voce: 1 - Luta ou 2 - foge");
                                EscolhaDado = sc.next();
                                
                                if (EscolhaDado.equalsIgnoreCase ("Foge") || EscolhaDado.equalsIgnoreCase ("2")){
                                  try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                dado = (int) (Math.random() * 9 + 1);
                                if (dado <= 3){
                                   for (i = 0; i < 300; i++){
                                    System.out.print("\r\n");
                                  }
                                  System.out.println("Voce consegue escapar!\n\n\n\n\n\n\n");
                                    try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                    System.out.println("Enquanto voce fuge, ainda resta uma pergunta em sua mente: \n\n\n\n\n");
                                  try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                     for (i = 0; i < 300; i++){
                                      System.out.print("\r\n");
                                      }
                                System.out.println("\"Quem sou eu?\"\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                  try {
                                  Thread.sleep(11000);
                                 } catch (InterruptedException ex) {}
                                 System.exit(1);
                                }
                                else if (dado > 3){
                                  EscolhaDado = "Luta";
                                   for (i = 0; i < 300; i++){
                                    System.out.print("\r\n");
                                    }
                                  System.out.println("Voce nao conseguiu escapar e tera que Lutar!\n\n\n\n\n");
                                }
                                else {
                                  System.exit(1);
                                  }
                                }
                                if (EscolhaDado.equalsIgnoreCase ("Luta") || EscolhaDado.equalsIgnoreCase("1")){
                                  System.out.println("Voce parece reconhecer esta pessoa...\n\n\n\n\n\n\n\n");
                                    try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("O MONSTRO?");
                                  try {
                                  Thread.sleep(4000);
                                 } catch (InterruptedException ex) {}
                                  for (i = 0; i < 300; i++){
                                      System.out.print("\r\n");
                                      }
                                  System.out.println("O Monstro, digo, o pai da crianca possui estes atributos:\nVida:"+ VidaMonstroMago +"\nAtaque: "+ AtaqueMonstroMago + "\nDefesa: " + DefesaMonstroMago + "\n\n\n\n\n\n\n");
                              turno = 1;
                              do {
                                
                                 if (turno % 2 != 0){
                       System.out.println("Digite -1- ou -Lancar- para jogar o Dado: \n\n\n");
                        EscolhaDado = sc.next();

                            if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total do mago
                      danot = ataqueMago * dado;
                      //Break
                           }
                           else {
                        System.exit(1);
                            }
                        if (DefesaMonstroMago < danot && DefesaMonstroMago != 0){
                                  danot = danot - DefesaMonstroMago;
                                  DefesaMonstroMago = 0;
                                  VidaMonstroMago -= danot;
                                  System.out.println("A armadura do mago foi reduzida para 0 e voce causou "+ danot + "  de dano, a vida total do seu alvo eh "+ VidaMonstroMago);

                            }
                            else if (DefesaMonstroMago > danot){
                                if ((DefesaMonstroMago - danot) > 100){
                                   System.out.println("Dano anulado");
                                   DefesaMonstroMago -= danot;
                                }
                                else if ((DefesaMonstroMago - danot) <= 100 ){
                                    danot /= 2;
                                    DefesaMonstroMago -= danot;
                                    VidaMonstroMago-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + " de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ DefesaMonstroMago + " mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(DefesaMonstroMago == 0){
                                  VidaMonstroMago -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula!\n\n\n\n\n");
                                }
                                
                              }
                              
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                            if(dado <= 2){
                              System.out.println("O numero do dado de seu adversario foi " + dado + "entao, voce esquivou com sua passiva! Voce nao sofre dano nesta rodada");
                            }
                            else {
                              danot = AtaqueMonstroMago * dado;
                              if ((defesaMago - danot) > 100){
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaMago - danot) <= 100 ){
                                danot = danot/2;
                                defesaMago -= danot;
                                vidaMago -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + "de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaMago +"Sua vida foi reduzida em "+ vidaMago +"\n\n\n\n\n");
                                }
                                }
                                else if(defesaMago == 0){
                                  vidaMago -= danot;
                                  System.out.printf("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+ vidaMago +" de vida total\n\n\n\n\n");
                                }
                              }
                            }
                      
                      turno += 1;
                              }while(vidaMago != 0 && VidaMonstroMago != 0);        
                              if (VidaMonstroMago <= 0){
                                System.out.println("Voce derrotou o monstro e conseguiu fugir, mas a que custo?\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("Nao so agora voce matou um pai, mas tambem nao respondeu a pergunta mais basica, e a mais importante: \n\n\n\n\n\n\n\n\n\n\n\n");
                                
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Quem eu sou?\" \n\n\n\n\n\n\n\n\n\n\n");
                              }
                              else if (vidaMago <= 0){
                              System.out.println("Caído\n\n\n\n derrotado\n\n\n\n eh isto que se resume voce agora.\n\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("tudo perdido, e porque? Por um monstro! Ah... um pai\n\n\n\n\n");
                                 try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("O rei se aproxima de voce, abaixa, e o olha com tristeza, as lagrimas chegam a cair em voce semimorto ao chao. \n\n\n\n\n\n");
                                 try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("\"Adeus amigo, nunca mais teras a gloria de outrora, mas sempre teras ela no meu coracao.\"\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                System.out.println("\"Quem foi ele, Senhor?\" - Pergunta o Guarda que o derrotou\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Foi o maior mago que ja existiu, filho. Nunca mais teremos alguem como ele.\"");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Nossa Senhor, mas entao ele era imbativel? Como eu o derrotei? Nao sou o maior nem da minha familia.\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Ele nao foi o maior por seus duelos, mas por sua disciplina, sua lealdade...\"\n\n E com dificuldade ele pronuncia as ultimas palavras que voce ouviu: \n\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(12000);
                              } catch (InterruptedException ex) {}
                               for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                              System.out.println("\"Ser o melhor amigo que eu poderia ter\"");
                              }
                            }
                                  }
                              else if (vidaMago <= 0){
                              System.out.println("Caído\n\n\n\n derrotado\n\n\n\n eh isto que se resume voce agora.\n\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("tudo perdido, e porque? Por um monstro! Ah... um pai\n\n\n\n\n");
                                 try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                System.out.println("O rei se aproxima de voce, abaixa, e o olha com tristeza, as lagrimas chegam a cair em voce semimorto ao chao. \n\n\n\n\n\n");
                                 try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                                System.out.println("\"Adeus amigo, nunca mais teras a gloria de outrora, mas sempre teras ela no meu coracao.\"\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                                System.out.println("\"Quem foi ele, Senhor?\" - Pergunta o Guarda que o derrotou\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Foi o maior mago que ja existiu, filho. Nunca mais teremos alguem como ele.\"");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Nossa Senhor, mas entao ele era imbativel? Como eu o derrotei? Nao sou o maior nem da minha familia.\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Ele nao foi o maior por seus duelos, mas por sua disciplina, sua lealdade...\"\n\n E com dificuldade ele pronuncia as ultimas palavras que voce ouviu: \n\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(12000);
                              } catch (InterruptedException ex) {}
                               for (i = 0; i < 300; i++){
                                System.out.print("\r\n");
                                }
                              System.out.println("\"Ser o melhor amigo que eu poderia ter\"");

                                }
                                else if (EscolhaDado.equalsIgnoreCase("Break")){
                                  System.exit(1);
                                }
                              }
                              //Fim Fuga
                            else if (EscolhaDado.equalsIgnoreCase ("Aceitar") || EscolhaDado.equals ("2")) {
                              System.out.println("talvez a decisao mais dificil seja a mais correta. Nao fugir pode fazer sua cabeca voltar ao normal, ou ao menos voce pensou.\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Voce nao tem tempo nem de terminar um racicionio, quando subitamente um homem com roupas finas e um linguajar rebruscado chega em sua cela.\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Velho amigo! Em que fundo de poço voce chegou. Oh Ceus! Nao posso ver voce assim.\" - o homem desconhecido vira para o guarda e diz - \"Que crime cometeu este homem? Soltem-lo imediatamente!\"\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Voce ri da ideia, teriam eles mandado o bobo da corte?\n\n\n\n\n\n\n\n\n");
                               try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Quando o guarda respondeu: \"Sim, magestade\" voce tremeu");
                               try {
                                  Thread.sleep(4000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Meus Deuses, eu chamei o rei de bobo da corte?Espera, este eh o rei? Como eu nao o reconheci... Velho... amigo?\"\n\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("O rei lhe convida para um jantar no parque real e lhe disse: \n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("\"Agora que voltaste, poderemos finalmente acabar aquele projeto, aquele maldito mago nao sabera o que o atingiu!\" e lhe da um agradavel tapa nas costas");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Voce nao entende quem eh este mago, quem seria este rei ou que projeto ele estava falando\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(4000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Ao ver sua expressao o rei compreende e lhe pergunta: \"Que lhe acomete caro amigo? Por acaso perdeste conciencia do que fazes aqui?\"\n\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.out.println("Sua resposta de sim o deixa intrigado e ele o manda de volta a cela. Nem seu amigo o quis? O que aconteceu comigo?\n\n\n\n\n\n");
                                try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("Seu pensamento voa, quem sou eu? Um ar toma sua cabeca, e surge a pergunta: \n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
                              System.out.println("\"Quem sou eu?\"\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");}
                              System.out.println("Sua mente pira com tamanha pergunta, você não entende mais nada, tudo que você pensa é: \n\n\n\n\n\n\n\n\n\n");
                              try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              for (i = 0; i < 300; i++){
                              System.out.print("\r\n");}
                              for (i = 0; i < 300; i++){
                                System.out.println("Quem sou eu?");
                                }
                                  try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                              System.exit(1);
                              }
                            }
                     }
                    }

                     //fim dado > 8
                      else {
                        System.exit(1);
                      }
    }

                    

          //Fim Mago
        //Fim do Mago
        
        else if (Classe.equals ("2") || Classe.equalsIgnoreCase  ("Lutador")){
                    System.out.println("");
                   try {
                        Thread.sleep(2000);
                       } catch (InterruptedException ex) {}
                   System.out.println("");
                   try {
                        Thread.sleep(2000);
                       } catch (InterruptedException ex) {}
                   System.out.println("");
                    try {
                        Thread.sleep(2000);
                       } catch (InterruptedException ex) {}
                     System.out.println("");
                    try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                     for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                  System.out.println("Ir para: \n 1 - Regiao a 200km ou\n2 - A regiao mais vizinha?\n");
                  Escolha = sc.next();
            //Caso o Lutador va para a Cidade mais longe
            if (Escolha.equalsIgnoreCase("duzentos") || Escolha.equals("200")){
                      
                        System.out.println("Digite -1- ou -Lancar- para jogar o Dado: ");
                         EscolhaDado = sc.next();

                      if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {

                        System.out.println("\n Lançando o Dado...");
                         dado = (int) (Math.random() * 9 + 1);
                           try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                         System.out.println("Numero: " + dado);
                            }
                        else {
                          System.out.println("Era para ser 1 ou Lancar");
                          }
                  }
            //Caso o Lutador va para a Cidade mais Perto
            else if (Escolha.equalsIgnoreCase("cem") || Escolha.equals("100")){
                      //Falta História
                        System.out.println("Digite -1- ou -Lancar- para jogar o Dado: ");
                        EscolhaDado = sc.next();

                      if (EscolhaDado.equalsIgnoreCase ("Lancar") || EscolhaDado.equals ("1")) {

                        System.out.println("\n Lançando o Dado...");
                        dado = (int) (Math.random() * 9 + 1);
                         System.out.println("Numero: " + dado);
                            }
                        else {
                          System.out.println("Era para ser 1 ou Lancar");
                          }
                  }
                   else if (Escolha.equalsIgnoreCase ("break")){
                      System.exit(0);
                    }

            }
        //Fim do Lutador
        //Inicio da Arqueira/História
        else if (Classe.equals("3") || Classe.equalsIgnoreCase("Arqueiro")){
            System.out.println("\'Como eu cheguei até aqui?\' \n\n\n\n");
                   try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                   System.out.println("\'Estou em cima de um campo de batalha...? Mas... Como?\'\n\n\n\n");
                   try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                   System.out.println("Voce olha para baixo e tudo que ve sao os restos do que parece ter matado uma populacao maior que a da pequena cidade fria e isolada que voce veio\n\n\n\n");
                    try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                     System.out.println("Quem teria feito? Quem eram aquelas pessoas que morreram logo a baixo de seus pes, e como voce nao viu nada? Nao se lembra de nada, como se... voce tivesse sido envenenado?\n\n\n");
                      try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                     System.out.println("Tudo que voce sabe eh que voce precisa entender isso:\n\'Nao posso deixar alguem assim sair impune\'\n\n\n\n");
                    try {
                        Thread.sleep(4000);
                       } catch (InterruptedException ex) {}
                    
                     System.out.println("\n\n\nVoce logo acha seu arco, sorte sua que nao perdeu, se nao o mago teria ficado brabo com voce por perder o unico arco deste tipo: suas flechas nao acabam\n\n\n");
                    //Pergunta
                    try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                     for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                     System.out.println("\n\nSe a decisao de pegar o arco em maos o foi instantanea, agora se ve em um conflito: descer e se expor, ou se manter no alto? A possibilidade de morrer eh bem menor no alto, mas voce ve ao longe um homem quase morto, seria possivel deixa-lo morrer para tentar se salvar? O que voce faz?\n\n\n1 - Desce para salvar o homem\n2 - Mantem a sua posicao atual? (Digite o numero ou \'Descer\' ou \'Manter\'\n\n\n\n\n");
                    Escolha = sc.next();
                    for (i = 0; i < 300; i++){
                              System.out.print("\r\n");
                              }
            //Arqueira escolhe "salvar" o homem
                if (Escolha.equalsIgnoreCase ("Descer") || Escolha.equals ("1")){
                    System.out.println("Voce prontamente desce! Afinal, eh a marca de um cavaleiro ajudar os necessitados!\n\n\n\n\n\n\n");
                    try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                    System.out.println("Este pensamento por motivos que sua memoria nao permite explorar o fazem rir. O que estaria sua propria memoria escondendo de voce?\n\n\n\n\n\n\n");
                    try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                    for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                        }
                    System.out.println("Enquanto voce avanca com cautela, um monstro estranhamente familiar eh visto a distancia. Voce tenta correr, agora, e salvar o homem, mas o monstro chega primeiro.\n\n\n\n\n\n\n");
                    try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                    System.out.println("Voce tem certeza que este monstro foi quem causou tamanha ruina, este campo enorme de corpos empilhados por ai.\n\n\n\n\n\n");
                    try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                    System.out.println("Um impulso lhe toma conta e voce atira uma flecha no monstro!\n\n\n\n\n");
                    try {
                        Thread.sleep(6000);
                        } catch (InterruptedException ex) {}
                    System.out.println("O monstro fica um pouco atordoado com uma flecha, mas vira em sua direcao pronto para o combate, sua raiva eh gigante, ate que...");
                    try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                    System.out.println("Ele o ve\n\n\n\n");
                    try {
                        Thread.sleep(4000);
                        } catch (InterruptedException ex) {}
                    System.out.println("Quase que respeitoso e com um ar de assustado, o monstro pega o homem ferido e corre para longe, mandando amigos lhe matarem!\n\n\n\n\n\n\n");
                    try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                    System.out.println("Eh hora da luta!\n\n\n\n\n\n\n");
                EscolhaHabilidade = 0;
                  do{
                    if(defesaMonstro1 < 0){
                      defesaMonstro1 = 0;
                    }
                    if(defesaMonstro2 < 0){
                      defesaMonstro2 = 0;
                    }
                    if (defesaMonstro3 < 0){
                      defesaMonstro3 = 0;
                    }
                    if(vidaMonstro1 < 0){
                      vidaMonstro1 = 0;
                    }
                    if (vidaMonstro2 < 0){
                      vidaMonstro2 = 0;
                    }
                    if (vidaMonstro3 < 0){
                      vidaMonstro3 = 0;
                    }

                      for (i = 0; i < 300; i++){
                           System.out.print("\r\n");
                            } 
                      System.out.println("Sua vida: " + vidaArqueiro + "\nVida do Inimigo 1: " + vidaMonstro1 + "\nVida do Inimigo 2: "+vidaMonstro2 +"\nVida do Inimigo 3: "+ vidaMonstro3
                       +"\n\n\n\n\n\n\n");
                      if (turno % 2 != 0){
                      if (EscolhaHabilidade == 0){ 
                        System.out.println("Deseja usar a 1 - \"habilidade\" e ficar sem jogar um turno, ou dar um 2 - \"ataque\" basico?: \n\n\n");
                         EscolhaDado = sc.next();

                              if (EscolhaDado.equalsIgnoreCase ("Ataque") || EscolhaDado.equals ("2")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total da arqueira
                      danot = ataqueArqueiro * dado;
                      System.out.println("Qual monstro voce deseja atacar:\n 1 - Com vida: "+ vidaMonstro1 +"\nE defesa: "+defesaMonstro1 + "\n2- Com vida: "+vidaMonstro2 +"\nE defesa: " +defesaMonstro2 + "\nOu 3 - Com vida: " + vidaMonstro3 + "\nE defesaMonstro3: "+ defesaMonstro3 + "?\nDigite o numero(ou escreva por extenso): \n\n\n\n\n\n\n\n\n\n");
                      EscolhaDado = sc.next();
                      if (EscolhaDado.equalsIgnoreCase("1") || EscolhaDado.equalsIgnoreCase("um")){     
                        if (defesaMonstro1 < danot && defesaMonstro1 != 0){
                                  danot = danot - defesaMonstro1;
                                  defesaMonstro1 = 0;
                                  vidaMonstro1 -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaMonstro1);

                            }
                            else if (defesaMonstro1 > danot){
                                if ((defesaMonstro1 - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro1 -= danot;
                                }
                                else if ((defesaMonstro1 - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro1 -= danot;
                                    vidaMonstro1-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaMonstro1 + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro1 == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em"+ vidaMonstro1 +"\n\n\n\n\n");
                                  }
                          
                            else if (EscolhaDado.equalsIgnoreCase ("habilidade") || EscolhaDado.equals ("1")){
                             EscolhaHabilidade = 1;
                             } 
                            }
                            if (EscolhaDado.equalsIgnoreCase("2") || EscolhaDado.equalsIgnoreCase("dois")){     
                        if (defesaMonstro2 < danot && defesaMonstro2 != 0){
                                  danot = danot - defesaMonstro2;
                                  defesaMonstro2 = 0;
                                  vidaMonstro2 -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaBossArqueiro);

                            }
                            else if (defesaMonstro2 > danot){
                                if ((defesaMonstro2 - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro2 -= danot;
                                }
                                else if ((defesaMonstro2 - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro2 -= danot;
                                    vidaMonstro2-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaMonstro2 + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro2 == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em"+ vidaMonstro2 +"\n\n\n\n\n");
                                  }
                            }
                            else if (EscolhaDado.equalsIgnoreCase ("habilidade") || EscolhaDado.equals ("1")){
                             EscolhaHabilidade = 1;
                             } 
                            }
                            if (EscolhaDado.equalsIgnoreCase("3") || EscolhaDado.equalsIgnoreCase("tres")){     
                        if (defesaMonstro3 < danot && defesaMonstro3 != 0){
                                  danot = danot - defesaMonstro3;
                                  defesaMonstro3 = 0;
                                  vidaMonstro3 -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaMonstro3);

                            }
                            else if (defesaMonstro3 > danot){
                                if ((defesaMonstro3 - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro3 -= danot;
                                }
                                else if ((defesaMonstro3 - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro3 -= danot;
                                    vidaMonstro3-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaMonstro3 + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro3 == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em"+ vidaMonstro3 +"\n\n\n\n\n");
                                  }
                          
                           
                            }
                          }  
                      else if (EscolhaHabilidade == 1){
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                  dado = (int) (Math.random() * 9 + 1);
                                  danot = (ataqueArqueiro * dado) * 3;                          
                       System.out.println("Qual monstro voce deseja atacar:\n 1 - Com vida: "+ vidaMonstro1 +"\nE defesa: "+defesaMonstro1 + "\n2- Com vida: "+vidaMonstro2 +"\nE defesa: " +defesaMonstro2 + "\nOu 3 - Com vida: " + vidaMonstro3 + "\nE defesaMonstro3: "+ defesaMonstro3 + "?\nDigite o numero(ou escreva por extenso): \n\n\n\n\n\n\n\n\n\n");
                      EscolhaDado = sc.next();
                       if (EscolhaDado.equalsIgnoreCase("1") || EscolhaDado.equalsIgnoreCase("um")){     
                        if (defesaMonstro1 < danot && defesaMonstro1 != 0){
                                  danot = danot - defesaMonstro1;
                                  defesaMonstro1 = 0;
                                  vidaMonstro1 -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaMonstro1);

                            }
                            else if (defesaMonstro1 > danot){
                                if ((defesaMonstro1 - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro1 -= danot;
                                }
                                else if ((defesaMonstro1 - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro1 -= danot;
                                    vidaMonstro1-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaMonstro1 + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro1 == 0){
                                  vidaMonstro1 -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em"+ vidaMonstro1 +"\n\n\n\n\n");
                                  }
                          
                            else if (EscolhaDado.equalsIgnoreCase ("habilidade") || EscolhaDado.equals ("1")){
                             EscolhaHabilidade = 1;
                             } 
                            }

                          
                      else if (defesaMonstro2 < danot && defesaMonstro2 != 0){
                                  danot = danot - defesaMonstro2;
                                  defesaMonstro2 = 0;
                                  vidaMonstro2 -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + "  de dano, a vida total do seu alvo eh "+ vidaBossArqueiro);

                            }
                            else if (defesaMonstro2 > danot){
                                if ((defesaMonstro2 - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro2 -= danot;
                                }
                                else if ((defesaMonstro2 - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro2 -= danot;
                                    vidaMonstro2-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para "+ defesaMonstro2 + "mas a vida sofreu danos:  "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro2 == 0){
                                  vidaMonstro2 -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em "+ vidaMonstro2 +"\n\n\n\n\n");
                                  }

                        else if (EscolhaDado.equalsIgnoreCase("3") || EscolhaDado.equalsIgnoreCase("tres")){                     
                       if (defesaMonstro3 < danot && defesaMonstro3 != 0){
                                  danot = danot - defesaMonstro3;
                                  defesaMonstro3 = 0;
                                  vidaMonstro3 -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + "  de dano, a vida total do seu alvo eh "+ vidaMonstro3);

                            }
                            else if (defesaMonstro3 > danot){
                                if ((defesaMonstro3 - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro3 -= danot;
                                }
                                else if ((defesaMonstro3 - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro3 -= danot;
                                    vidaMonstro3-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + " de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para "+ defesaMonstro3 + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro3 == 0){
                                  vidaMonstro3 -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em "+ vidaMonstro3 +"\n\n\n\n\n");
                                    }
                                 
                                  }
                                }
                              try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                           }
                             //Termina Turno da Arqueira
                            //Turno do Inimigo
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                              danot = ataqueConjunto * dado;
                              if ((defesaArqueiro - danot) > 100){
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaArqueiro - danot) <= 100 ){
                                danot = danot/2;
                                defesaArqueiro -= danot;
                                vidaArqueiro -= danot;
                                if (defesaArqueiro >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + "de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaArqueiro +"Sua vida foi reduzida em "+ vidaArqueiro +"\n\n\n\n\n");
                                }
                              }
                            }
                              else if (defesaArqueiro < danot && defesaArqueiro != 0){
                                 danot = danot - defesaArqueiro;
                                  defesaArqueiro = 0;
                                  vidaArqueiro -= danot;
                                  System.out.println("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + " de dano, a sua vida total eh "+ vidaArqueiro);
                                  }
                              else if(defesaArqueiro == 0){
                                vidaArqueiro -= danot;
                                System.out.printf("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+vidaArqueiro+" de vida total\n\n\n\n\n");      
                            }
                        vidaConjunta = vidaMonstro1 + vidaMonstro2 + vidaMonstro3;  
                        try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                     for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                     turno += 1;
                  } while(vidaArqueiro > 0 && vidaConjunta > 0); 
                    if (vidaConjunta < 0){
                      System.out.println("Sua ideia é boa! Você consegue matar seus inimigos. Chegando com tamanha proximidade você vê a feiura de seus inimigos, sua face deformada pela maldade. Parece qeu você sente o cheiro caracteristico da maldade neles. \n\n\n\n\n\n\n\n");
                     try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                    System.out.println("Agora é hora de fazer o Mestre deles pagar!\n\n\n\n\n\n");
                     try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                    System.out.println("O senhor deles é tão deformado que sua maldade o é sabida, sua memória ainda o falha mas tamanha é a importancia deste monstro, quem seria isto?\n\n\n\n\n\n");
                     try {
                        Thread.sleep(9000);
                       } catch (InterruptedException ex) {}
                    
                    System.out.println("Seu Covil fica logo a frente, e será talvez o maior desafio o invadir, mas seu coração está decidido!\n\n\n\n\n\n\n");
                     try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                   for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                    System.out.println("No Covil do Monstro\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("Seu sangue ferve, suas orelhas queimam? Este fato lhe faz rir. Talvez esta distração seja uma vantagem? Você deixa este pensamento de lado, você precisa salvar o homem. Quem seria ele? Talvez... Um amigo?\n\n\n\n\n\n");
                     try {
                        Thread.sleep(12000);
                       } catch (InterruptedException ex) {}
                   for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                     System.out.println("Chegando perto de onde o temivel vilão estava, voce encontra 2 guardas.\n\n\n\n\n\n\n\n\n");
                      dado = (int) (Math.random() * 1 + 1);  
                      if (dado == 1){
                        System.out.println("Voce passa tranquilamente por eles, usando suas habilidades e matando-os\n\n\n\n\n\n\n ");
                         try {
                        Thread.sleep(9000);
                       } catch (InterruptedException ex) {}
                      }
                      else if (dado == 2){
                        System.out.println("Você não consegue passar dos guardas");
                         try {
                        Thread.sleep(12000);
                       } catch (InterruptedException ex) {}
                      dado = (int) (Math.random() * 1 + 1);  
                        if (dado == 1){
                          System.out.println("Você consegue fugir!");
                        }
                        else if(dado == 2){
                          System.out.println("Os guardas lhe veem e o prendem. Eles o levam para o chefe que então ri e lhe diz: \n\n\n\n\n\n\n\n\n\n\n");
                            try {
                        Thread.sleep(9000);
                       } catch (InterruptedException ex) {}
                        }
                      }
                    }
                  
                  }//Fim Arqueira Desce para Salvar

            //Arqueira Ficando no HighGround
             else if (Escolha.equalsIgnoreCase("Manter") || Escolha.equals ("2")){

                    System.out.println("Como uma boa arqueira, voce permanece no alto, esperando...\n\n\n\n\n\n");
                      try {
                                  Thread.sleep(6000);
                              } catch (InterruptedException ex) {}
    
                    System.out.println("Esperando...\n\n\n\n\n\n");
                      try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                    System.out.println("Esperando...\n\n\n\n\n");
                      try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                    System.out.println("De repente os monstros chegam perto do homem.\n\n\n\n\n\n");
                      try {
                            Thread.sleep(7000);
                          } catch (InterruptedException ex) {}
                      System.out.println("Eles o tentam levar preso, mas voce nao pode deixar isto acontecer \n\n\n\n\n\n");
                        try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                      System.out.println("	!\n\n\n\n\n\n\n\n");
                        try {
                                  Thread.sleep(7000);
                              } catch (InterruptedException ex) {}
                               for (i = 0; i < 300; i++){
                               System.out.print("\r\n");
                               }
                          dado = (int) (Math.random() * 9 + 1);  
                  if (dado < 5){
                        System.out.println("Sua habilidade pega e derrota todos os monstros!");
                      
                      }
                  else if (dado >= 5) {
                        System.out.println("Sua habilidade acerta um dos monstros mas apenas raspa no outro!\n\n\n\n\n");
                        try {
                              Thread.sleep(7000);
                          } catch (InterruptedException ex) {}
                        System.out.println("Voce corre tem uma escolha: matar o monstro ou fugir, e voce escolhe em ir para cima dele!\n\n\n\n\n\n\n");
                      try {
                              Thread.sleep(7000);
                          } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                               System.out.print("\r\n");
                        }
                        System.out.println("Enquanto corre para cima do monstro, seu sangue esta fervendo, sua cabeca nunca se sentiu tao bem, ate que comeca o duelo!\n\n\n\n\n\n\n\n");
                        turno = 1;
                    do{
                    if (defesaMonstro < 0){
                      defesaMonstro = 0;
                    }
                    if(VidaMonstro < 0){
                      VidaMonstro = 0;
                      System.out.println("Sua vida: " + vidaArqueiro + "\nVida do Inimigo: " + VidaMonstro + "\n\n\n\n\n\n\n\n\n");
                      if (turno % 2 != 0){
                      if (EscolhaHabilidade == 0){ 
                        System.out.println("Deseja usar a 1 - \"habilidade\" e ficar sem jogar um turno, ou dar um 2 - \"ataque\" basico?: \n\n\n");
                         EscolhaDado = sc.next();

                              if (EscolhaDado.equalsIgnoreCase ("Ataque") || EscolhaDado.equals ("2")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total da arqueira
                      danot = ataqueArqueiro * dado;
                           
                        if (defesaMonstro < danot && defesaMonstro != 0){
                                  danot = danot - defesaMonstro;
                                  defesaMonstro = 0;
                                  VidaMonstro -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ VidaMonstro);

                            }
                            else if (defesaMonstro > danot){
                                if ((defesaMonstro - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaMonstro -= danot;
                                }
                                else if ((defesaMonstro - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro -= danot;
                                    VidaMonstro -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para"+ defesaMonstro + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em"+ VidaMonstro +"\n\n\n\n\n");
                                  }
                                }
                            else if (EscolhaDado.equalsIgnoreCase ("habilidade") || EscolhaDado.equals ("1")){
                             EscolhaHabilidade = 1;
                             } 
                          }
                          else if (EscolhaHabilidade == 1){
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                  dado = (int) (Math.random() * 9 + 1);
                                  danot = (ataqueArqueiro * dado) * 3;
                                 
                        if (defesaEvilMago < danot && defesaMonstro != 0){
                                  danot = danot - defesaMonstro;
                                  defesaMonstro = 0;
                                  VidaMonstro -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ VidaMonstro);

                            }
                                else if ((defesaMonstro - danot) <= 100 ){
                                    danot /= 2;
                                    defesaMonstro -= danot;
                                    VidaMonstro -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzida para "+ defesaMonstro + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaMonstro == 0){
                                  VidaMonstro -= danot;
                                  System.out.printf("\nVoce causou: " + danot + "de dano em uma armadura nula! Como dano verdadeiro! Deixando a vida do alvo em "+ VidaMonstro +"\n\n\n\n\n");
                                  }
                           }
                             //Termina Turno da Arqueira
                            //Turno do Inimigo
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                              danot = AtaqueMonstro * dado;
                              if ((defesaArqueiro - danot) > 100){
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaArqueiro - danot) <= 100 && defesaArqueiro != 0){
                                danot = danot/2;
                                defesaArqueiro -= danot;
                                vidaArqueiro -= danot;
                                if (defesaArqueiro >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + "de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaArqueiro +"Sua vida foi reduzida em "+ vidaArqueiro +"\n\n\n\n\n");
                                }
                              }
                            else if (defesaArqueiro < danot && defesaArqueiro != 0){
                                  danot = danot - defesaArqueiro;
                                  defesaArqueiro = 0;
                                  vidaArqueiro -= danot;
                                  System.out.println("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + " de dano, a sua vida total eh "+ vidaArqueiro);
                            }   
                            else if(defesaArqueiro == 0){
                                  vidaArqueiro -= danot;
                                  System.out.printf("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+vidaArqueiro+" de vida total\n\n\n\n\n");
                                }
                            }  
                        try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                     for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                    }
                        if (turno == 3){
                          System.out.println("Voce ataca o monstro que nem ao menos finge se importar com a dor\n\n\n\n\n\n");
                           try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                        System.out.println("Sua memoria ainda eh vaga, mas lembra que ja enfrentou-o varias vezes.\n\n\n\n\n");
                        try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                        System.out.println("Voce voa com seu arco, tudo eh natural para voce. \n\n\n\n\n");
                        try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                        System.out.println("E agora que uma vida esta em risco, chegou a hora de realmente matar este bicho para sempre!\n\n\n\n\n");
                        }
                            turno += 1;
                        }while(vidaArqueiro > 0 && VidaMonstro > 0);
                         for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                        }
                        if (vidaArqueiro <= 0){
                          System.out.println("Voce morreu, tente novamente!\n\n\n\n\n\n");
                          System.exit(1);
                        }
                        else if (VidaMonstro <= 0){
                          System.out.println("Seu arco eh uma bencao\n\n\n\n\n\n");
                           try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                          System.out.println("Tem horas que voce nem sente que ele esta em suas maos\n\n\n\n\n\n");
                          try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                        System.out.println("Talvez por isso a facilidade em matar este monstro!\n\n\n\n\n\n\n");
                             try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                         for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                       }
                       System.out.println("Sua alegria agora eh instantanea, voce salvou este homem! Ou ao menos... Espera que sim\n\n\n\n\n\n\n\n");
                           try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                         for (i = 0; i < 300; i++){
                        System.out.print("\r\n");}
                      System.out.println("Voce procura o homem em todos os lados, mas quando percebe, ele esta no ultimo lugar que voce pensava, ou talvez... no primeiro: \n\n\n\n\n\n\n\n\n");
                       try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                          System.out.println("Na prisao\n\n\n\n\n");
                           try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                        System.out.print("\r\n");}
                        System.out.println("Voce nao consegue se lembrar quem cuida dessa prisao, mas eh obvio que sao os monstros, eles cercam o perimetro e estao por toda a parte \n\n\n\n\n\n\n");
                        try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                        System.out.print("\r\n");}
                        System.out.println("Voce por ser um arqueiro experiente - Ao menos voce lembra desta licao - voce espera...\n\n\n\n\n\n\n\n");
                         try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                        System.out.println("E espera...\n\n\n\n\n\n");
                         try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                       System.out.println("E espera...\n\n\n\n\n\n");
                        try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                        System.out.print("\r\n");}
                      System.out.println("Ate que encontra uma brecha! \n\n\n\n\n");
                      try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                       System.out.println("Um soldado inexperiente esta guardando uma porta lateral sozinhho, ele possui 150 de vida.\n\n\n\n\n");
                       try {
                        Thread.sleep(7000);
                       } catch (InterruptedException ex) {}
                       System.out.println("Voce mira, posiciona e atira...");
                       dado = (int) (Math.random() * 9 + 1);
                        if (dado == 1){
                          System.out.println("Errando o alvo e revelando sua posicao");
                           try {
                          Thread.sleep(7000);
                            } catch (InterruptedException ex) {}
                          System.out.println("Os guardas prontamente vem atras de voce, perseguindo pela floresta e...\n\n\n\n\n\n ");
                           try {
                            Thread.sleep(7000);
                            } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                            System.out.print("\r\n");}  
                            dado = (int) (Math.random() * 9 + 1);
                            if (dado > 9) {
                              System.out.println ("voce consegue fugir! Garantindo que voce saiu vivo... Mas o homem nao.\n\n\n\n\n\n\n");
                              try {
                            Thread.sleep(7000);
                            } catch (InterruptedException ex) {}
                            System.out.println("Depois que você saiu, o mundo ficou... tranquilo? Que teria acontecido?\n\n\n\n\n\n\n\n\n");
                              System.exit(1);
                            }
                            else if (dado <= 9) {
                              System.out.println("voce nao consegue fugir, sendo preso junto ao homem ferido\n\n\n\n\n\n\n");
                              }
                            }
                        else if (dado != 1) {
                          System.out.println("Acertando e matando o alvo!");
                          try {
                              Thread.sleep(5000);
                               } catch (InterruptedException ex) {}
                           }
                          for (i = 0; i < 300; i++){
                            System.out.print("\r\n");}  
                           System.out.println("Voce esconde o corpo do guarda e entra na porta do castelo.\n\n\n\n\n\n");
                           try {
                          Thread.sleep(7000);
                            } catch (InterruptedException ex) {}    
                            System.out.println("Sua vida nao importa, so importa salvar aquele homem\n\n\n\n\n\n");
                            try {
                              Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                           }
                           System.out.println("Seria aquele homem importante para voce? Seria ele o unico sobrevivente daquela batalha?\n\n\n\n\n\n\n");
                           try {
                              Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                           System.out.println("Seu pensamento divaga tanto que voce nem ve quando chega nas celas, o homem prontamente vem ao seu encontro e diz com uma felicidade tremenda: \n\n\n\n\n\n\n\n\n");
                           try {
                              Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                           for (i = 0; i < 300; i++){
                            System.out.print("\r\n");}  
                            System.out.println("\"Mestre, o Senhor esta vivo! Como estou alegre em o ver!\"\n\n\n\n\n\n\n\n");
                            try {
                              Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                            System.out.println("Sem tempo para perguntas voces correm para fora do castelo!");
                            try {
                              Thread.sleep(5000);
                               } catch (InterruptedException ex) {}
                          System.out.println("Sua mente nao reage a este novo fato. Mestre...?\n\n\n\n\n\n\n");
                          try {
                              Thread.sleep(7000);
                               } catch (InterruptedException ex) {}
                          System.out.println("Chegando a saida a porta esta trancada e o guarda sumiu! Em um piscar de olhos, sua unica saida eh lutar para sair de la, a unica porta possivel de se ultrapassar eh a com um guarda com\nVida: 2500\nAtaque: 100\nDefesa: 100\n\n\n\n\n\n\n\n");
                          try {
                              Thread.sleep(9000);
                               } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                            System.out.print("\r\n");}  
                        EscolhaHabilidade = 0;
                        
                        System.out.println("Sua vida: " + vidaMago + "\nVida do Inimigo: " + vidaBossArqueiro + "\n\n\n\n\n\n\n\n\n");
                          for (i = 0; i < 300; i++){
                            System.out.print("\r\n");}  
                           if (turno % 2 != 0){
                      if (EscolhaHabilidade == 0){ 
                        System.out.println("Deseja usar a 1 - \"habilidade\" e ficar sem jogar um turno, ou dar um 2 - \"ataque\" basico?: \n\n\n");
                         EscolhaDado = sc.next();

                              if (EscolhaDado.equalsIgnoreCase ("Ataque") || EscolhaDado.equals ("2")) {
                              for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                      //dano total da arqueira
                      danot = ataqueArqueiro * dado;
                           
                        if (defesaBossArqueiro < danot && defesaBossArqueiro != 0){
                                  danot = danot - defesaBossArqueiro;
                                  defesaBossArqueiro = 0;
                                  vidaBossArqueiro -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + "  de dano, a vida total do seu alvo eh "+ vidaBossArqueiro);

                            }
                            else if (defesaBossArqueiro > danot){
                                if ((defesaBossArqueiro - danot) > 100){
                                   System.out.println("Dano anulado");
                                   defesaBossArqueiro -= danot;
                                }
                                else if ((defesaBossArqueiro - danot) <= 100 ){
                                    danot /= 2;
                                    defesaBossArqueiro -= danot;
                                    vidaBossArqueiro-= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzido para "+ defesaBossArqueiro + "mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaBossArqueiro <= 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + " de dano em uma armadura nula! Como dano verdadeiro, deixando a vida do alvo em "+ vidaBossArqueiro +"\n\n\n\n\n");
                                  }
                                }
                            else if (EscolhaDado.equalsIgnoreCase ("habilidade") || EscolhaDado.equals ("1")){
                             EscolhaHabilidade = 1;
                             } 
                          }
                          else if (EscolhaHabilidade == 1){
                             System.out.println("Lançando o Dado...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                                  dado = (int) (Math.random() * 9 + 1);
                                  danot = (ataqueArqueiro * dado) * 3;
                                 
                        if (defesaBossArqueiro < danot && defesaBossArqueiro != 0){
                                  danot = danot - defesaBossArqueiro;
                                  defesaBossArqueiro = 0;
                                  vidaBossArqueiro -= danot;
                                  System.out.println("A armadura do alvo foi reduzida para 0 e voce causou "+ danot + " de dano, a vida total do seu alvo eh "+ vidaBossArqueiro);

                            }
                                else if ((defesaBossArqueiro - danot) <= 100 ){
                                    danot /= 2;
                                    defesaBossArqueiro -= danot;
                                    vidaBossArqueiro -= danot;
                                    
                                  System.out.printf("\nVoce causou: " + danot + "de dano, mas a defesa foi maior, a armadura do alvo foi reduzida para "+ defesaBossArqueiro + " mas a vida sofreu danos: "+ danot + "\n\n\n\n\n");
                                }
                                    }
                                
                            else if(defesaBossArqueiro == 0){
                                  
                                  System.out.printf("\nVoce causou: " + danot + " de dano em uma armadura nula! Como dano verdadeiro! Deixando a vida do alvo em "+ vidaBossArqueiro +"\n\n\n\n\n");
                                  }
                            try {
                        Thread.sleep(10000);
                       } catch (InterruptedException ex) {}
                           }
                             //Termina Turno da Arqueira
                            //Turno do Inimigo
                      else if (turno % 2 == 0) {
                           for (i = 0; i < 300; i++){
                                 System.out.print("\r\n");
                                  } 
                          System.out.println("Lançando o Dado do inimigo...\n\n\n\n");
                             try {
                                  Thread.sleep(3000);
                                 } catch (InterruptedException ex) {}
                              dado = (int) (Math.random() * 9 + 1);
                              danot = ataqueBossArqueiro * dado;
                              if ((defesaArqueiro - danot) > 100){
                              System.out.println("Dano anulado");
                              }
                              else if ((defesaArqueiro - danot) <= 100 ){
                                danot = danot/2;
                                defesaArqueiro -= danot;
                                vidaArqueiro -= danot;
                                if (defesaMago >= 0){
                                  System.out.printf("\nVoce recebeu: " + danot + " de dano, mas a sua defesa foi maior, a sua armadura, no entanto, foi reduzida para 0 e o dano causado negando a armadura foi: "+ defesaArqueiro +"Sua vida foi reduzida para "+ vidaArqueiro +"\n\n\n\n\n");
                                }
                              }
                            }
                              else if (defesaArqueiro < danot && defesaArqueiro != 0){
                                 danot = danot - defesaArqueiro;
                                  defesaArqueiro = 0;
                                  vidaArqueiro -= danot;
                                  System.out.println("A sua armadura foi reduzida para 0 e voce sofreu "+ danot + "  de dano, a sua vida total eh "+ vidaArqueiro);
                                  }
                              else if(defesaArqueiro == 0){
                                vidaArqueiro -= danot;
                                System.out.printf("Sua armadura eh nula! E voce sofreu" + danot +" como dano verdadeiro, lhe deixando com "+vidaArqueiro+" de vida total\n\n\n\n\n");      
                            }  
                        try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                     for (i = 0; i < 300; i++){
                        System.out.print("\r\n");
                     }
                     
                        if(turno == 2){
                          System.out.println("\"MORRA MONSTROOOOOOOOOOOOOOO!\"\n\n\n\n\n\n\n\n");
                             try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                          for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                          System.out.println("O guarda grita e lhe distrai, causando 100 de dano adicional\n\n\n\n\n\n\n\n");
                          vidaArqueiro -= 100;
                          try {
                        Thread.sleep(5000);
                       } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                          System.out.println("\"Por que este grito me distraiu tanto?\" - Voce se pergunta enquanto prepara para dar o proximo ataque!\n\n\n\n\n\n");
                         try {
                          Thread.sleep(8000);
                            } catch (InterruptedException ex) {}
                         }
                        } while(vidaArqueiro != 0 && vidaBossArqueiro != 0);
                        if (vidaArqueiro <= 0){
                          System.out.println("Voce perdeu! \"Como isso eh possivel?\"\n\n\n\n\n\n");
                           try {
                          Thread.sleep(8000);
                            } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                        }
                        else if(vidaBossArqueiro <= 0){
                          System.out.println("Voce ganhou! Mas de repente... \n\n\n\n\n\n\n\n");
                          try {
                          Thread.sleep(8000);
                            } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                          System.out.println("UM TIRO, NAS SUAS COSTAS!\n\n\n\n\n\n\n");
                           try {
                          Thread.sleep(8000);
                            } catch (InterruptedException ex) {}
                            for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                        }   
                     }

                System.out.println("Lentamente voce comeca a morrer, seu arco ja esta sendo looteado pelos monstros, e voce comeca a recuperar sua memoria\n\n\n\n\n\n");
                       try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                System.out.println("Sua mente parece mais clara, a batalha... Aquela batalha...");
                  try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                System.out.println("\"Eu era o monstro esse tempo todo? Mas...\"\n Sua voz comeca a falhar ate mesmo em sua propria conciencia\n\n\n\n\n\n\n");
                 try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                System.out.println("\"Como.. Como.. pode?\"\n\n\n\n\n\n\n\n\n\n\n\n");
                 try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                System.out.println("Tudo entao se torna claro, todas os monstros que voce matou, eram homens. E quem voce salvou? Apenas seu numero 2, para morrer junto contigo\n\n\n\n\n\n\n\n\n\n\n\n");
                 try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                System.out.println("O ultimo pensamento que lhe acomete eh este:\n\n\n\n\n\n\n\n\n\n\n\n");
                 try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                System.out.println("Quem sou eu?\n\n\n\n\n\n\n\n\n\n\n\n");
                 try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                          }
                System.out.println("Sou eu um monstro por querer ajudar?\n\n\n\n\n\n\n\n\n\n\n\n");
                try {
                        Thread.sleep(8000);
                        } catch (InterruptedException ex) {}
                        for (i = 0; i < 300; i++){
                          System.out.print("\r\n");
                      }
              }
             //Fim da Arqueira 
            //Way Out
          else if (Escolha.equalsIgnoreCase ("break")){
                      System.exit(0);
                    }
             
             
    //Caso Queiram sair no começo
    }
else if (inicio.equalsIgnoreCase ("break")){
  System.exit(0);
}

else {
      for (i = 0; i < 300; i++){
      System.out.print("\r\n");
    }
    System.out.println("Leia as regras mongo");
  }

    }
  }
  
