import java.util.*; 
 
 public class Strings {
    
    
    public static void  selectionSort( String[] array )
  {
    
     // Find the string reference that should go in each cell of
     // the array, from cell 0 to the end
     for ( int j=0; j < array.length-1; j++ )
     {
       // Find min: the index of the string reference that should go into cell j.
      // Look through the unsorted strings (those at j or higher) for the one that is first in lexicographic order
       int min = j;
      for ( int k=j+1; k < array.length; k++ )
       if ( array[k].compareTo( array[min] ) < 0 ) min = k;  
     // Swap the reference at j with the reference at min 
       String temp = array[j];
     array[j] = array[min];
       array[min] = temp;
     }
     }
  
     public static void  Insertionsort (String array[],int f){
        String temp="";
        for(int i=0; i< f ;i++){
            for(int j=i+1; j< f ; j++){
                 if(array[i].compareToIgnoreCase(array[j])>0){
                     temp = array[i];
                    array[i]=array[j];
                     array[j]=temp;
                    }
                 }
        }
   }





    




}
