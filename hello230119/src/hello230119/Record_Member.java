package hello230119;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor   //확인 해보기   // 모두를 초기화? 
@NoArgsConstructor    // 기본 매개변수가 없는   생성자 포함
@Data  // 어노테이션
public class Record_Member {
	private String id;
	private String name;
	private int age;
	
	Record_Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Record_Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
