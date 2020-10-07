package main;

public class Matrix {
    public int[][] mt;

    Matrix (int[][]mt)
    {
        this.mt = mt;
    }

    public void summation (Matrix m1, Matrix m2, Matrix m3)
    {
        if (m1.mt.length == m2.mt.length & m1.mt[0].length == m2.mt[0].length)
        {
            int[][] mt3 = new int[m1.mt.length][m1.mt[0].length];
            for (int i = 0; i < m1.mt.length; i++)
            {
                for (int j = 0; j < m1.mt[0].length; j++)
                {
                    mt3[i][j] = m1.mt[i][j] + m2.mt[i][j];
                }
            }
            Matrix m4 = new Matrix (mt3);
            m3 = m4;
        }
    }
    public void subtrution (Matrix m1, Matrix m2, Matrix m3)
    {
        if (m1.mt.length == m2.mt.length & m1.mt[0].length == m2.mt[0].length)
        {
            int[][] mt3 = new int[m1.mt.length][m1.mt[0].length];
            for (int i = 0; i < m1.mt.length; i++)
            {
                for (int j = 0; j < m1.mt[0].length; j++)
                {
                    mt3[i][j] = m1.mt[i][j] - m2.mt[i][j];
                }
            }
            Matrix m4 = new Matrix (mt3);
            m3 = m4;
        }
    }
    public void multiplication (Matrix m1, Matrix m2, Matrix m3)
    {
        if (m1.mt.length == m2.mt[0].length & m1.mt[0].length == m2.mt.length)
        {
            int[][] mt3 = new int[m1.mt.length][m1.mt[0].length];
            for (int i = 0; i < m1.mt.length; i++)
            {
                for (int j = 0; j < m2.mt[0].length; j++)
                {
                    for (int k = 0; k < m2.mt.length; k++)
                    {
                        mt3[i][j] += m1.mt[i][k] * m1.mt[k][j];
                    }
                }
            }
            Matrix m4 = new Matrix (mt3);
            m3 = m4;
        }}
        public void transposition(Matrix m1, Matrix m2) {
            int[][] mt3 = new int[m1.mt[0].length][m1.mt.length];
            for (int i = 0; i < m1.mt.length; i++)
            {
                for (int j = 0; j < m2.mt[0].length; j++)
                {
                    mt3[j][i] = m1.mt[i][j];
                }
            }
            Matrix m4 = new Matrix (mt3);
            m2 = m4;
        }
}
