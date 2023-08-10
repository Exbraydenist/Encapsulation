public class Storage {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean flippable;
    private final String registerNumber;
    private final boolean fragile;

    public Storage(Dimensions dimensions,
                   double weight,
                   String deliveryAddress,
                   boolean flippable,
                   String registerNumber,
                   boolean fragile) {
//      this.dimensions = new Dimensions(dimensions.width, dimensions.height, dimensions.length);
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.flippable = flippable;
        this.registerNumber = registerNumber;
        this.fragile = fragile;
    }
    public Storage setDimensions(Dimensions dimensions) {
        return new Storage(dimensions, weight, deliveryAddress, flippable, registerNumber, fragile);
    }

    public Storage setWeight(double weight) {
        return new Storage(dimensions, weight, deliveryAddress, flippable, registerNumber, fragile);
    }

    public Storage setDeliveryAddress(String deliveryAddress) {
        return new Storage(dimensions, weight, deliveryAddress, flippable, registerNumber, fragile);
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String toString() {
        return "\nВес: " + weight + ";\nобъем: " + dimensions.getVolume() + ";\nадрес: " + deliveryAddress;
    }
}
