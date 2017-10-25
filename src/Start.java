public class Start {

    public static void main(String[] args) {

        //Objekter der henter information fra de andre klasser.
        DatHoldet datHoldet = new DatHoldet();
        MineMetoder mineMetoder = new MineMetoder();

        //Tomme system.out.println() er til linjeskift, til bruger venlighed når koden køres.
        System.out.println();

        System.out.println("Kort vælges fra enum. Nummer 9");
        //Kører getCard metoden/enum metoden.
        mineMetoder.getCard();

        System.out.println();
        System.out.println("Printer tal fra 0-10 med getWhile metoden.");
        //Kører getWhile metoden.
        mineMetoder.getWhile();

        System.out.println();
        System.out.println();
        System.out.println("Printer tal fra 0-10 med getFor metoden.");
        //Køre getFor metoden.
        mineMetoder.getFor();

        System.out.println();
        System.out.println();
        System.out.println("Printer et tilfældigt tal mellem 0 og 10.");
        //Kører getRandom metoden.
        mineMetoder.getRandom();

        System.out.println();
        System.out.println("Brug af scanner til at udregne areal af cirkel med bruger bestemt radius.");
        //Kører getScanner metoden.
        mineMetoder.getScanner();


    }


}
