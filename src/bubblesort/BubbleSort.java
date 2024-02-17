package bubblesort;

//thiskuhjkhkikjlkj
public class BubbleSort {

    public static void main(String[] args) {
        
        int array[]={90,80,70,60,50,40};
        int temp;
        int n=array.length;
        
        for(int phrase=0;phrase<(n-1);phrase++)
        {
            for(int round=0;round<((n-phrase)-1);round++)
            {
                if(array[round]>array[round+1])
                {
                    temp=array[round];
                    array[round]=array[round+1];
                    array[round+1]=temp;
                }
            }
        }
        
        for(int k=0;k<array.length;k++)
        {
            System.out.println(" "+array[k]);
        }
        
    }
    
}
