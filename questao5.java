import java.util.*;

public class questao5 
{ 
  int escolhaDaPagina = 0;

  questao5()
  {
    System.out.println("Você está na Home do site");
    System.out.println(" ");
    System.out.println("Para qual página gostaria de ir?");
    System.out.println(" ");
    System.out.println("Aperte 1 para Celulares");
    System.out.println("Aperte 2 para Televisores");
    System.out.println("Aperte 3 para Samsung");
    System.out.println("Aperte 4 para Apple");
    System.out.println("Aperte 5 para 4K");
    System.out.println("Aperte 6 para 8K");
    System.out.println("Aperte 7 para voltar");
    System.out.println(" "); 
  }
  
  public void gerenciarPaginas(Pilha trilhaPaginas)
  {
    if(trilhaPaginas.raiz == null)
    {
      trilhaPaginas.empilhar("Home"); 
    }
    Scanner leitor = new Scanner(System.in);
    escolhaDaPagina = leitor.nextInt();
    switch (escolhaDaPagina)
    {
      case 1: 
        trilhaPaginas.empilhar("Celulares");
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
      case 2: 
        trilhaPaginas.empilhar("Televisores");
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
      case 3: 
        trilhaPaginas.empilhar("Samsung");
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
      case 4: 
        trilhaPaginas.empilhar("Apple");
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
      case 5: 
        trilhaPaginas.empilhar("TV 4K");
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
      case 6: 
        trilhaPaginas.empilhar("TV 8K");
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
      case 7: 
        trilhaPaginas.desempilhar();
        System.out.println("escolhaDaPagina : " + escolhaDaPagina);
        trilhaPaginas.printar();
        gerenciarPaginas(trilhaPaginas);
        break;
    }
  }
  
}