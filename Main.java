class Main {
  public static void main(String[] args) 
  {
    rodarQuestao5();
    rodarQuestao6();
    rodarQuestao7();
    rodarQuestao8();
  }

  static void rodarQuestao8()
  {
    questao8 questao = new questao8();
    questao.ordenar();
  }

  static void rodarQuestao6()
  {
    questao6 questao = new questao6();
    questao.empilhar("Bat Country");
    questao.empilhar("This Means War");
    questao.empilhar("Beast and the Harlot");
    questao.empilhar("So Far Away");
    questao.empilhar("Dear God");
    questao.empilhar("Hail To The King");
    questao.empilhar("Nightmare");
    questao.empilhar("Seize The Day");
    questao.empilhar("Afterlife");
    questao.empilhar("Buried Alive");
    questao.empilhar("Shepherd Of Fire");
    questao.empilhar("The Stage");
    questao.empilhar("Chapter four");
    questao.printar();
    System.out.println("");
    questao.meioDaLista(questao.raiz);
  }

  static void rodarQuestao5()
  {
    Pilha pilha = new Pilha();
    questao5 questao = new questao5();
    questao.gerenciarPaginas(pilha);
  }

  static void rodarQuestao7()
  {
    System.out.println(" ");
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Aqui começa o resultado da questão 7");
    System.out.println(" ");
    System.out.println(" ");
    questao7 questao = new questao7();
    questao.AdicionarMusica("Bat Country");
    questao.AdicionarMusica("This Means War");
    questao.AdicionarMusica("Beast and the Harlot");
    questao.AdicionarMusica("The Trooper");
    questao.AdicionarMusica("A little piece of heaven");
    questao.printarPlaylist();
  }
  
}