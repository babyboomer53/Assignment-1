public class Driver {
    public static void main(String[] arguments) {
        BicycleSKU bike0 = new BicycleSKU();
        BicycleSKU bike1 = new BicycleSKU();
        BicycleSKU bike2 = new BicycleSKU();



        bike1.setManufacturer("Trek");
        bike1.setModel("Emonda");
        bike1.setColor("Rage Red/Trek Black");
        bike1.setFrameset("Ultralight 800 Series OCLV Carbon");
        bike1.setFork("Emonda SLR full carbon, tapered carbon steerer");
        bike1.setWheels("Bontrager Aeolus Pro 37, OCLV Carbon," + "Tubeless " +
                "Ready, 37mm rim depth, 100x12mm thru axle");
        bike1.setDrivetrain("Shimano Ultegra Di2 R8050/70");
        bike1.setWeight(15.84);
        bike1.setPrice(8299.99);
        bike1.setQuantity(2);

        bike2.setManufacturer("Specialized");
        bike2.setModel("S-Works Venge Disc");
        bike2.setColor("GLOSS METALLIC WHITE SILVER/LITE SILVER FADE");
        bike2.setFrameset("S-Works FACT 11r carbon");
        bike2.setFork("S-Works FACT carbon, 100x12mm thru-axle, flat-mount disc");
        bike2.setWheels("Roval CLX 64 Disc, carbon, tubeless-ready");
        bike2.setDrivetrain("SRAM RED eTAP AXS");
        bike2.setWeight(15.65);
        bike2.setPrice(12500.00);
        bike2.setQuantity(1);

        System.out.println("HERE IS A DUMP OF THE TWO OBJECTS THAT WERE " +
                "INITIALIZED USING THE MUTATOR METHODS…");

        bike0.display();
        System.out.println();
        bike1.display();
        System.out.println();
        bike2.display();

        BicycleSKU bike3 = new BicycleSKU("Cannondale",
                "SystemSix",
                "Matte Black",
                "BallisTec Hi-MOD Carbon",
                "BallisTec Hi-MOD Carbon, 1-1/8\" - 1-1/4\" steerer",
                "HollowGram 64 SL KNØT, Carbon, 20h front, 24h rear",
                "Shimano Dura-Ace Di2, braze-on",
                16.80,
                12000.00,
                1
        );

        BicycleSKU bike4 = new BicycleSKU("Holland",
                "Exogrid Jet",
                "Brushed Titanium",
                "Titanium/Carbon Hybrid",
                "ENVE 2.0",
                "ENVE Classic 25 Carbon Clincher",
                "Shimano Ultegra Di2",
                18.00,
                7999.99,
                1
        );

        System.out.println("HERE IS A DUMP OF THE TWO OBJECTS THAT WERE " +
                "INITIALIZED USING ARGUMENTS PASSED TO THE CONSTRUCTOR…");

        bike4.display();
        bike3.display();

        System.out.println("THE FOLLOWING DISPLAYS THE QUANTITY ON HAND BOTH " +
                "BEFORE AND AFTER THE BicycleSKU object's reduceInventoryBy() METHOD" +
                " IS CALLED…");
        System.out.println("Quantity of the Trek Emonda on hand: " +
                bike1.getQuantity());
        bike1.reduceInventoryBy(1);
        System.out.printf("Quantity of the Trek Emonda on hand: %d%n%n",
                bike1.getQuantity());

        BicycleSKU[] inventory = {bike1, bike2, bike3, bike4};

        System.out.println("AFTER POPULATING AN ARRAY WITH BicycleSKU " +
                "OBJECTS, THE ARRAY IS TRAVERSED TO CALL THE display() METHOD" +
                " OF EACH ELEMENT...");
        for (BicycleSKU bicycleSKU : inventory) {
            System.out.println(bicycleSKU);
        }
    }
}
