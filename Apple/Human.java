package Apple;

public class Human {
    private String name;
    private String male;
    private int weight;

    public Human(String name, String male, int weight) {
        this.name = name;
        this.male = male;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void Speak(String words) {
        System.out.println(words);
    }

    public void eatApple(Apple apple) {
        if (apple.getWeight() > 0) {
            weight += 1;
            apple.setWeight(apple.getWeight() - 1);
            System.out.println(name + "Đã ăn một miếng táo");
        } else {
            System.out.println("không còn táo để ăn");
        }
    }

    public void checkAppleWeight(Apple apple) {
        System.out.println("khối lượng của quả táo là :" + apple.getWeight() + "đv");
    }
}