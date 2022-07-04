package ver2_lec05;

public class GetArithmeticException extends  ArithmeticException{

    public GetArithmeticException(String message){
        super("메세지 :::" + message);
    }
}
