public class SelectionSortTest {
    public static void main (String[] args){
        int [] array = new int [4];
        array[0] =4 ;
        array[1] =2 ;
        array[2] =3 ;
        array[3] =1;
        displayArray(array);
        selectionSort(array);
        displayArray(array);

    }

public static void selectionSort (int [] array) {
    int index = 0;
    for (int i=0; i<array.length; i++){
        int lowest = array[i];
        int temp = array[i];
        int j = i+1;
        while (j<array.length){
            if(array[j]<lowest){
                lowest =array[j];
                index = j;
                j++;
            }
            j++;
        }
       if(lowest != array[i]){
        array[i] = lowest;
        array[index] = temp;
       } 
       continue;
    }
}

public static void displayArray(int [] array){
    for (int i=0; i<array.length; i++){
        System.out.println(array[i]);
    }
}
}