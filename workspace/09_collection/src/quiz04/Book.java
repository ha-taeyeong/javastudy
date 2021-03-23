package quiz04;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data	// getter, setter, noargsconstructor, toString, equals, haschCode
@AllArgsConstructor
public class Book {
	
	// field
	private int bNo;
	private String bTitle;
	private String bWriter;

}
