class CodeList
{
    public static void main(String[] args) {
        for (int k = 0; k < 65535; k++)
        {
            System.out.print((char)k);
            System.out.print('\t');
            if ( k % 10 == 0 )
            {
                System.out.println();
            }
        }
    }
}