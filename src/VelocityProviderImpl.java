public class VelocityProviderImpl implements VelocityProvider {
        
    private static final VelocityProvider INSTANCE = new VelocityProviderImpl();
    
    
    private VelocityProviderImpl() {
        //Since we are working with a static instance, this class should not be instantiated from outside of it
        //and it will be a singleton.
    }
    
    public static VelocityProvider getInstance() {
        return INSTANCE;
    }
    
    @Override
    public int getCardUsageCount(Payment payment, Duration duration) {
        return 0;
    }
    
    @Override
    public void registerPayment(Payment payment) {
        //nothing
    }
}
