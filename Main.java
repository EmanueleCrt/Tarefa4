public class Main{
    public static void Main(String[] args)throws ExcecaoDivisaoZero{
        int a[] = new int[10];
        int b[] = new int[10];
        for(int i = 0; i< 10; i++){
            a[i] = 0;
            b[i] = i;
        }
        Arrays teste = new Arrays();
        teste.setArrayA(a);
        teste.setArrayB(b);
        teste.Divisao();
    }
}