public class Main {
    
    public static void main(String[] args) {
        final VelocityProvider velocityProvider = VelocityProvider.getProvider();
        velocityProvider.registerPayment(new Payment());
    }
}
