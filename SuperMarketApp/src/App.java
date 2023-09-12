import Classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();
        PromoClient.setAction("Акция 3в1");
        PromoClient.setMaxPromoCount(3);

        iActorBehaviour client1 = new OrdinaryClient("boris");
        iActorBehaviour client2 = new SpecialClient("prezident", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new PromoClient("Sly4aino Zashel");
        iActorBehaviour client5 = new PromoClient("Ya tolko sprosit");
        iActorBehaviour client6 = new PromoClient("Nado y4itsya");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);

        magnit.update();

        System.out.printf("\nКоличество участников акции \"%s\": %d", PromoClient.getPromo(),
                PromoClient.getPromoCount());
    }
}
