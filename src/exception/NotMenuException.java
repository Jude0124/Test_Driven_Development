package exception;

public class NotMenuException extends Exception{
    public NotMenuException() {
        super("메뉴가 존재하지 않습니다.");
    }
}
