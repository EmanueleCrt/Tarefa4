
public class ExcecaoDivisaoZero extends Exception{
    public ExcecaoDivisaoZero(String msg){
        super(msg);
    }
    
    public ExcecaoDivisaoZero(String msg, Throwable causa){
        super(msg, causa);
    }
    
}