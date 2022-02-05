package Java_Lab_Work;
class Car 
{
public String manufacturer;
public String model;
public int year;

  Car(String manufacturer, String model, int year)
  {
      this.manufacturer = manufacturer;
      this.model = model;
      this.year = year;
  }
  public void start()
  {
      System.out.println("Starting the car");
  }
  public void stop()
  {
      System.out.println("Stopping the car");
  }
  public void move()
  {
      System.out.println("The car is moving");
  }
  public void accelarate()
  {
      System.out.println("Let's speed up");
  }
}