package ex06_exception_class;

@SuppressWarnings("serial")
public class UpDownException extends Exception {
	
	//constructor
	public UpDownException() {
		super("1 ~ 100 사이의 값을 입력해야 합니다.");	// 예외메시지를 Exception에게 전달하면 됩니다.
	}
}
