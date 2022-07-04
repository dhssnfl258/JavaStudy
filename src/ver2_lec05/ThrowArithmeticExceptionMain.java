package ver2_lec05;

public class ThrowArithmeticExceptionMain {
    public static void main(String[] args) throws GetArithmeticException{

        throw new GetArithmeticException("숫자계산에서 예외가 발생했습니다.");

    }
}
