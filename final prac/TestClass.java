public class TestClass{
    public static void myMethod(int index, int[] array){

        if(index < array.length -1)
            myMethod (index+1, array);

        System.out.println(array[index]);
    }

    public static void main(String args[]){

        int[] myArray = {1, 2, 3, 4, 5};
        
        myMethod (0, myArray);
    }
}
