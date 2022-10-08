public class Pilha
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

    String printar()
    {
      No auxiliar = raiz;
      String resultadoFinal = "";
      while(auxiliar != null)
      {
        resultadoFinal = resultadoFinal + " > " + auxiliar.valor;
        auxiliar = auxiliar.proximo;
      }
      System.out.println(resultadoFinal);
      return resultadoFinal;
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