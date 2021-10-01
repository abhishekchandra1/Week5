public class Delivered implements PackageState
{
    //Singleton
    private static Delivered Instance  = new Delivered();

    private void Delivered() {}

    public static String Deliveredinstance() {
        return "instance";
    }

    //Business logic
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is delivered!!");
    }
}