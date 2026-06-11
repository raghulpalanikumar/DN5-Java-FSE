interface Food
{
    String prepare();
}
class Pizza implements Food
{
    public String prepare()
    {
        return "Preparing Pizza";
    }
}
class Burger implements Food
{
    public String prepare()
    {
        return "Preparing Burger";
    }
}
class FoodFactory
{
    public static Food getFood(String order)
    {
        Food food;

        if(order.equalsIgnoreCase("Pizza"))
        {
            food = new Pizza();
        }
        else if(order.equalsIgnoreCase("Burger"))
        {
            food = new Burger();
        }
        else
        {
            throw new IllegalArgumentException("Food not available");
        }

        return food;
    }
}

public class FoodApp {
    public static void main(String args[])
    {
        String order = "Pizza";
        Food food = FoodFactory.getFood(order);
        System.out.println(food.prepare());
    }
}   
