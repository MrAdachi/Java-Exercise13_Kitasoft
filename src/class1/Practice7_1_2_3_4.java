package class1;

class Dog {
    private String Name;
    private int age;
    private String breed;
    
    // コンストラクタ
    public Dog(String breed) {
    	this.breed = breed;
    }

    public void SetName(String Name) {
    	this.Name = Name;
    }
    
    public void SetAge(int age) {
    	this.age = age;
    }

    public void ShowProfile() {
    	System.out.println( "犬種は" + this.breed + "、名前は" + this.Name + "、年齢は" + this.age + "歳です。" );
    }
}

public class Practice7_1_2_3_4 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("チワワ");
		Dog dog2 = new Dog("ブルドック");
		dog1.SetName("ポチ");
		dog1.SetAge(5);
		dog2.SetName("ハチ");
		dog2.SetAge(10);
		dog1.ShowProfile();
		dog2.ShowProfile();
	}

}
