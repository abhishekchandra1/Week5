public class InTransit implements PackageState
{
    //Singleton
    private static InTransit instance = new InTransit();

    private InTransit() {}

    public static InTransit instance() {
        return instance;
    }

    //Business logic and state transition
    @Override
    public void updateState(DeliveryContext ctx)
    {
        System.out.println("Package is in transition !!");
        ctx.setCurrentState(OutForDelivery.instance());
    }
}