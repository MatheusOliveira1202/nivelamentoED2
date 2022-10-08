public class questao6
  {
      No raiz;

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


    public void meioDaLista(No raiz)
    {
      if(raiz == null || raiz.proximo == null)
      {
        System.out.println(raiz);
      }
      No auxiliarUmaVez = raiz;
      No auxiliarEmDobro = raiz;
      while(auxiliarEmDobro.proximo != null && auxiliarEmDobro.proximo.proximo != null)
      {
        auxiliarEmDobro = auxiliarEmDobro.proximo.proximo;
        auxiliarUmaVez = auxiliarUmaVez.proximo;
      }
      System.out.println("Elemento do meio da lista : " + auxiliarUmaVez.valor);
    }
    
    void printar()
    {
      No auxiliar = raiz;
      int numeroNaOrdem = 1;
      while(auxiliar != null)
      {
        System.out.println(numeroNaOrdem + ". -> " + auxiliar.valor);
        auxiliar = auxiliar.proximo;
        numeroNaOrdem += 1;
      }
    }
    
    No empilhar(String valor)
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

    No desempilhar()
    {
      No retirado = null;
      if(raiz == null)
      {
        return null;
      }
      else if(raiz != null && raiz.proximo == null)
      {
        raiz = null;
      }
      else
      {
        No penultimo = raiz;
        No ultimo = penultimo.proximo; 

        while(ultimo.proximo != null)
        {
          penultimo = ultimo;
          ultimo = ultimo.proximo;
        }
        retirado = ultimo;
        penultimo.proximo = null;
      }

      return retirado;
    }
    
    
  }