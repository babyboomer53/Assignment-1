/**
 * This class contains fields and methods with which information about a
 * bicycle and the materials and components comprising that bicycle can be
 * maintained and manipulated.
 */
public class BicycleSKU {
    private String manufacturer;
    private String model;
    private String color;
    private String frameset;
    private String fork;
    private String wheels;
    private String drivetrain;
    private double weight;
    private double price;
    private int quantity;

    /**
     * This is the version of the constructor called when an object of this type
     * is instantiated without arguments.
     */
    public BicycleSKU() {
        super();
    }

    /**
     * This version of the constructor expects no fewer than ten arguments, the
     * values of which are used to initialize its instance variables.
     *
     * @param manufacturer a String containing the manufacturer's name
     * @param model        a String containing the model name
     * @param color        a String containing bicycle's color
     * @param frameset     a String describing the frame set
     * @param fork         a String describing the fork
     * @param wheels       a String describing the wheelset
     * @param drivetrain   a String describing the drivetrain
     * @param weight       a floating-point number (type double) specifying the
     *                     bicycle's weight
     * @param price        a floating-point number (type double) specifying the
     *                     bicycle's price
     * @param quantity     a whole number (type int) the total quantity of this item
     */
    public BicycleSKU(String manufacturer,
                      String model,
                      String color,
                      String frameset,
                      String fork,
                      String wheels,
                      String drivetrain,
                      double weight,
                      double price,
                      int quantity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.frameset = frameset;
        this.fork = fork;
        this.wheels = wheels;
        this.drivetrain = drivetrain;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
    }

    /**
     * This method returns a String containing the name of the manufacturer
     *
     * @return a String containing the name of the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * This method expects a single String argument, which it will use to set
     * the value of the manufacturer instance variable
     *
     * @param manufacturer a String containing the manufacturer's name
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * This method returns the content of the model instance variable.
     *
     * @return a String containing the model name
     */
    public String getModel() {
        return model;
    }

    /**
     * This method expects a single String argument, which it will use to set
     * the value of the model variable
     *
     * @param model a String containing the model name
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return a String containing the value stored in the color instance
     * variable
     */
    public String getColor() {
        return color;
    }

    /**
     * This method expects a single String argument, which it will use to set
     * the value of the color  variable
     *
     * @param color is a string containing the frameset's color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return a string containing a description of the frame set
     */
    public String getFrameset() {
        return frameset;
    }

    /**
     * @param frameset Is a String containing a description of the frame set
     */
    public void setFrameset(String frameset) {
        this.frameset = frameset;
    }

    /**
     * @return a String object containing a description of the fork
     */
    public String getFork() {
        return fork;
    }

    /**
     * @param fork is a String object containing a description of the fork
     */
    public void setFork(String fork) {
        this.fork = fork;
    }

    /**
     * @return a String object containing a description of the wheelset
     */
    public String getWheels() {
        return wheels;
    }

    /**
     * @param wheels is a String object containing a description of the wheelset
     */
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    /**
     * @return a String object containing the manufacturer of the drivetrain
     */
    public String getDrivetrain() {
        return drivetrain;
    }

    /**
     * @param drivetrain is a String object containing the name of the
     *                   drivetrain manufacturer
     */
    public void setDrivetrain(String drivetrain) {
        this.drivetrain = drivetrain;
    }

    /**
     * @return a floating-point number (type double) representing the weight
     * in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight a floating-point number (type double) representing the
     *               bicycles weight in pounds
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return a floating-point number (type double) representing the unit
     * price in dollars
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price a floating-point number (type double) representing the
     *              bicycles price in dollars
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return a whole number (type int) representing the current quantity of
     * this item
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity a whole number (type int) used to replace the current
     *                 quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @param delta a whole number (type int) representing the amount by which
     *              to reduce the current inventory
     */
    public void reduceInventoryBy(int delta) {
        quantity -= delta;
    }

    /**
     * @param delta a whole number (type int) representing the amount by which
     *              to increase the current inventory
     */
    public void increaseInventoryBy(int delta) {
        quantity += delta;
    }

    /**
     * @return a floating-point number (type double) containing the dollar value
     * of all units in stock
     */
    public double totalValue() {
        return quantity * price;
    }

    /**
     * This method returns the current state of the object – that is, a list
     * of all its fields contents. It does so by calling this class's toString()
     * method.
     */
    public void display() {
        System.out.println(toString());
    }

    /**
     * @return a formatted string containing an annotated list of the
     * contents of the object's fields.
     */
    @Override
    public String toString() {
        return String.format("Mfg: %s%nModel: %s%nColor: %s%nFrameset: " +
                        "%s%nFork: %s%nWheels: %s%nDrivetrain: %s%nWeight: %" +
                        ".2f lbs%nPrice: $%,.2f%nQuantity: %d%n",
                manufacturer, model, color,
                frameset, fork, wheels, drivetrain, weight, price, quantity);
    }
}