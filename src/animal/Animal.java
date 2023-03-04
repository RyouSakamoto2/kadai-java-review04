package animal;

public class Animal {
    
    private String name;  // 名前
    private int age;      // 年齢
    
    // コンストラクタ
    public Animal() {
    }

    // 引数ありコンストラクタ
    public Animal(String name, int age) {
    this.name = name;
    this.age = age;
    }

    public String getName() {
        return name;
    }
    
    public String setName(String name) {
        return this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    // 話すメソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }

}
