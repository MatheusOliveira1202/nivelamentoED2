public class questao7
  {
      No raiz;
      String explicacao = "A estrutura mais indicada para criar essa suposta playlist é uma lista encadeada, pois cada elemento vai apontar para o próximo e ao rodar essa playlist partindo da raíz(primeiro elemento, no caso a primeira música) ela vai sempre apontar pra próxima música depois e com uma lista encadeada poderemos adicionar quantas músicas quisermos e todas sempre serão adicionadas após a última já adicionada.";

      class No
      {
        String valor;
        No proximo;

        No(String val)
        {
          valor = val;
          proximo = null;
        }
      }

    void printarPlaylist()
    {
      No auxiliar = raiz;
      int numeroNaOrdem = 1;
      System.out.println("Músicas da playlist : ");
      while(auxiliar != null)
      {
        System.out.println(numeroNaOrdem + ". -> " + auxiliar.valor);
        auxiliar = auxiliar.proximo;
        numeroNaOrdem += 1;
      }
    }
    
    No AdicionarMusica(String valor)
    {
      No novo = new No(valor);
      novo.proximo = null;
      if(raiz == null)
      {
        raiz = novo;
      }
      else
      {
        No ultimo = raiz;
        while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
        }
        ultimo.proximo = novo;
      }
      return novo;
    }
  }