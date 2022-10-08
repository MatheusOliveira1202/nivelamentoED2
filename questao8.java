public class questao8
{
  int[] caixas = {35, 33, 42, 10, 14, 19, 27, 44, 26, 31};

  public void ordenar()
  {
    for(int i = 0; i < caixas.length - 1; i++)
    {
      for(int j = 0; j < caixas.length - 1 - i; j++)
      {
        if(caixas[j] > caixas[j + 1]) 
        {
          int aux = caixas[j];
          caixas[j] = caixas[j + 1];
          caixas[j + 1] = aux;
        }
      }
    }
    for(int k = 0; k < caixas.length - 1; k++)
    {
      System.out.print(caixas[k] + ", "); 
    }
  }
  
}