package ru.kpfu.npp.math;

/**
 * Created by teren_000 on 15.03.14.
 */
public class MatrixArrayImpl {
    // class field
    private  int [][] matrix;

    private static final int MAX_ROWS = 30;
    private static final int MAX_COLUMNS = 30;

    public MatrixArrayImpl() {
        //this.matrix = new int [MAX_ROWS] [MAX_COLUMNS]
        this.matrix = new int [MAX_ROWS][];
        for (int i=0; i<MAX_ROWS; i++)
        {
            matrix[i]=new int[MAX_COLUMNS];
        }

    }
    //access methods
    public int getValue (int row, int col)    {
        if (row<MAX_ROWS && col<MAX_COLUMNS) {
            return this.matrix[row][col];
        }
        else throw new IndexOutOfBoundsException();
    }
    public void setValue (int row, int col, int value)
    {
        if (row<MAX_ROWS && col<MAX_COLUMNS)
        {
            this.matrix[row][col] = value;
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }
    }

    public MatrixArrayImpl add (MatrixArrayImpl m)
    {
        MatrixArrayImpl res = new MatrixArrayImpl();
        for (int i = 0; i<30; i++)
        {
            for (int j=0; j<30; j++)
            {
                res.matrix [i][j] = matrix[i][j] + m.matrix [i][j];
            }
        }
        return res;
    }

    public String toString ()
    {
        String str = "";
        for (int i=0; i<MAX_ROWS; i++)
        {
            for (int j = 0; j<MAX_COLUMNS; j++)
            {
                str+=matrix [i][j] + " ";
            }
            str+="\n";
        }
        return str;
    }


}

