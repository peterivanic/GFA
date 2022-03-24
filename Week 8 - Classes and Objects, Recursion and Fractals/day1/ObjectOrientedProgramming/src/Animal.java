public class Animal {
    public int hunger = 50;
    public int thirst = 50;

    public void eat(){
        hunger -=1;
    }
    public void drink(){
        thirst -=1;
    }
    public void play(){
        thirst +=1;
        hunger +=1;
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();

        for (int i = 0; i<5;i++){
            dog.play();
            cat.play();
        }

        dog.eat();
        dog.drink();
        cat.eat();
        cat.drink();

        System.out.println(dog.hunger +" "+ dog.thirst);
        System.out.println(cat.hunger +" "+ cat.thirst);
    }
}
