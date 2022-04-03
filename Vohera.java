import java.util.Scanner;

class Vohera {
    public static void main(String[] args){
        System.out.println("Enter the no.of Pizzas bought: ");
        Scanner s=new Scanner(System.in);
        int TotalPizzas=s.nextInt();
        System.out.println("Enter the no.of Puffs bought: ");
        int TotalPuffs=s.nextInt();
        System.out.println("Enter the no.of CoolDrinks bought: ");
        int TotalCoolDrinks=s.nextInt();

        int TotalPizzaPrize=TotalPizzas*100;
        int TotalPuffsPrize=TotalPuffs*20;
        int TotalCoolDrinksPrize=TotalCoolDrinks*10;

        System.out.println("NO of Pizzas = "+TotalPizzas);
        System.out.println("No of Puffs = "+TotalPuffs);
        System.out.println("No of CoolDrinks = "+TotalCoolDrinks);
        System.out.println("TotalPrize "+(TotalPizzaPrize+TotalCoolDrinksPrize+TotalPuffsPrize));






    }
}
