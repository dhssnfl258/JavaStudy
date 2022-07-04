package ver2_lec05;

public class ThrowExceptionMain {
    public static void main(String[] args) throws  TimeoutException{
        //throw new TimeoutException("에러를 발생시켰습니다.");
        throw new TimeoutException("이것은 파일의 입출력 도중 발생한 에러입니다.");

    }
}
