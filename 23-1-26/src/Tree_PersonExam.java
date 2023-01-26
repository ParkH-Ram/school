import java.util.TreeSet;

public class Tree_PersonExam {
	public static void main(String[]args) {
		//Tree 拿泛记 积己
		TreeSet<Tree_Person> tree = new TreeSet<Tree_Person>();
		
		//按眉 历厘
		tree.add(new Tree_Person("全辨悼", 44));
		tree.add(new Tree_Person("付疵户", 55));
		tree.add(new Tree_Person("荤苞户", 32));
		
		//按眉甫 窍唱究 啊廉坷扁
		for(Tree_Person person : tree) {
			System.out.println(person.name + " " +  person.age);
		}
	}

}
