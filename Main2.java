class Prog2
{
    String name = "Shiva";
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }
}

class Main2
{
    public static void main(String[] args) {
        Prog2 obj1 = new Prog2();
        obj1.setName("Shiva Chand");
        System.out.println(obj1.getName());
    }
}