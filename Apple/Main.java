package Apple;

public class Main {
    public static void main(String[] args) {
        Human chianh = new Human("chí anh","bê đê",100);
        Human nhangkhanh = new Human("nhặng khánh","nhặng",1);
        Apple apple = new Apple();
        while (apple.getWeight() > 0){
            chianh.eatApple(apple);
            nhangkhanh.eatApple(apple);
        }
        chianh.checkAppleWeight(apple);
        nhangkhanh.checkAppleWeight(apple);
    }
}
