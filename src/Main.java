public class Main {
    public static void main(String[] args)
    {
        double costSpring = 240.23;
        double costSummer = 185.34;
        double costFall = 189.58;
        double costWinter = 428.94;
        double totalCost = costFall + costSpring + costWinter + costFall;

        System.out.println("Your Maintenance cost  for Spring is " +costSpring);
        System.out.println("Your Maintenance cost  for Summer is " +costSummer);
        System.out.println("Your Maintenance cost  for Fall is " +costFall);
        System.out.println("Your Maintenance cost  for Winter is " +costWinter);
        System.out.println("Your total Maintenance cost is  " +totalCost);
    }
}