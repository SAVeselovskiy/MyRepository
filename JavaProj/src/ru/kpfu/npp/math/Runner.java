package ru.kpfu.npp.math;

public class Runner {
    public static void main (String args[]){
        MatrixArrayImpl myMatrix = new MatrixArrayImpl();
        for (int i=0; i<30; i++)
        {
            for (int j=0; j<30; j++)
                myMatrix.setValue(i, j, i-j);
        }
        System.out.println((myMatrix.add(myMatrix)));
    }
}
