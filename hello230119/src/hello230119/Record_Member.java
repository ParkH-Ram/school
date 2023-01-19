package hello230119;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor   //Ȯ�� �غ���   // ��θ� �ʱ�ȭ? 
@NoArgsConstructor    // �⺻ �Ű������� ����   ������ ����
@Data  // ������̼�
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
