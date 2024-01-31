class Animal 
{
    public int age;         //Field
    public String gender;

    public void isMammal()  //Method
    {
        System.out.println("Method public void isMammal in class Animal");
    }

    public void mate()
    {
        System.out.println("Method public void mate in class Animal");
    }

    public static void main(String [] args) //main Method
    {
        Animal myAnimal = new Animal(); //Animal objects
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();    //Calls public methods
        myAnimal.mate();
        myZebra.run();
    }

}

class Fish extends Animal
{
    private int sizeInFeet;

    private void canEat()
    {
        System.out.println("Method private void canEat in subclass Fish");
    }

}

class Zebra extends Animal
{
    public boolean is_wild;

    public void run()
    {
        System.out.println("Method public void run in subclass Zebra");
    }
}
