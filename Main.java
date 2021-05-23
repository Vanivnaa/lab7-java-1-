package waterpump;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("\tВодяний насос: ");
        
        WaterPump fecal = new WaterPump();
        System.out.println(fecal);
       
        System.out.println("\n\tВодяний насос: ");

        WaterPump whirling = new WaterPump("Leo", 4000, 9600, 1250);
        System.out.println(whirling);

        System.out.println("\n\tВодяний насос: ");

        WaterPump borehole = new WaterPump("Lex", 1200, 13000, 1500, "червоний", 8.5f , 15, "borehole", "Польща", 10);
        System.out.println(borehole);

        WaterPump.printStaticNumOfPump();

    }
}