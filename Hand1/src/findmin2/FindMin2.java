package findmin2;

public class FindMin2
{
  public int findMin2(int[] input)
  {
    int z=0;
    for (int i =1; i< input.length; i++)
    {
      if (input[z]>input[i])
      {
        z=i;
      }
    }
      return input[z];
    }
  }
