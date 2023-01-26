abstract class Vehicle
{
    int Bmw = 1000, Benz = 2000, Toyota = 1600, Honda = 1700;
    public abstract String brand(String brandname);
    public abstract void vehiclePrice(String brandNameForPrice);
}
class RoadTransport extends Vehicle
{
    public String brand(String brandName)
    {
        System.out.println("Brand is: "+brandName);
        return brandName;
    }
    public void vehiclePrice(String brandNameForPrice)
    {
        System.out.println(brandNameForPrice);
        if(brandNameForPrice == "Bmw"){
            System.out.println("Price of the vehicle is: "+Bmw);
        }
        else if (brandNameForPrice == "Benz") {
            System.out.println("Price of the vehicle is: "+Benz);
        }
        else if (brandNameForPrice == "Toyota") {
            System.out.println("Price of the vehicle is: "+Toyota);
        }
        else if (brandNameForPrice == "Honda") {
            System.out.println("Price of the vehicle is: "+Honda);
        } 
        else {
            System.out.println("Price not Available");
        }
    }
} 
class Main 
{
    public static void main(String[] args) 
    {
        RoadTransport obj1 = new RoadTransport();
        obj1.vehiclePrice(obj1.brand("Honda"));
    }
}