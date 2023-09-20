/*Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.*/



class Animal {
    public void Animalsound(){
        System.out.println("the animal make a sound..");
    }
}
class Pig extends Animal {
    public void Animalsound(){
        System.out.println("The pig says: we wee..");
    }
}
class dog extends Animal {
    public void Animalsound(){
        System.out.println("the dog says : bow wow..");
    }
}


class Main{
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new dog();
        myAnimal.Animalsound();
        myPig.Animalsound();
        myDog.Animalsound();


    }
}
