package Classes;

/**
 * @apiNote
 */
public class PromoClient extends Actor {
    private static String promo;
    private int id;
    private static int maxPromoCount;
    private static int promoCount;
    private static int currentId;

    static {
        currentId = 0;
        promoCount = 0;
        maxPromoCount = 0;
    }

    public static void setAction(String promo) {
        PromoClient.promo = promo;
    }

    public static String getPromo() {
        return PromoClient.promo;
    }

    public static void setMaxPromoCount(int newMaxPromoCount) {
        PromoClient.maxPromoCount = newMaxPromoCount;
    }

    public static int getPromoCount() {
        return promoCount;
    }

    public PromoClient(String name) {
        super(name);
        this.id = ++currentId;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean take) {
        PromoClient.promoCount++;
        super.isTakeOrder = take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        super.isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void returnOrder() {
        super.returnOrder();
        promoCount--;
    }
}
