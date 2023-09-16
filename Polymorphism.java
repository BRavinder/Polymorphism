class Animal {
    public void animalsound(){
        System.out.println("the animal make a sound..");
    }
}
class Pig extends Animal {
    public void animalsound(){
        System.out.println("The pig says: we wee..");
    }
}
class dog extends Animal {
    public void animalsound(){
        System.out.println("the dog says : bow wow..");
    }
}


class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new dog();
        myAnimal.animalsound();
        myPig.animalsound();
        myDog.animalsound();


    }
}