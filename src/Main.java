import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<Worker>();
        int days = 1;
        while (true){
            String Command = scanner.nextLine();
            if (Command.equals("Buy")){
                workers.add(new Worker());
                Person.Money = Person.Money - 50;
            } else if (Command.equals("Stats")) {
                System.out.println("You have "+Person.Money+" money");
                System.out.println("You have "+ workers.size()+" workers");
                for (Worker worker : workers){
                    System.out.print(worker.getPower() + " ");
                }
                System.out.println();
            } else if (Command.equals("Work")) {
                Person.Money = Person.Money + 10 * (Worker.power*workers.size());
                System.out.println("You have "+Person.Money+" money");
                System.out.println("You have "+ workers.size()+" workers");
                for (Worker worker : workers){
                    System.out.print(worker.getPower() + " ");
                }
                System.out.println();
                System.out.println(days++);

            } else if (Command.equals("Lvlup")) {
                int i=1;
                System.out.println("You have " + workers.size() + " men");
                for (Worker worker : workers){
                    System.out.println("№"+ i + " plvl = "+worker.getPower() + "; ");
                    i++;
                }
                System.out.println("Enter number ("+ (workers.indexOf(workers.get(0))+1)+"-"+(workers.indexOf(workers.get(workers.size()-1))+1)+")");
                try {
                    int temp = scanner.nextInt();
                    Worker worker = workers.get(temp-1);
                    int plvl = (worker.getPower()+2);
                    System.out.println("plvl "+ worker.getPower() +" >>> "+ plvl);
                    worker.setPower(plvl);
                } catch (java.util.InputMismatchException e){
                    System.out.println("catch - java.util.InputMismatchException");
                } catch (java.lang.IndexOutOfBoundsException e){
                    System.out.println("catch - java.lang.IndexOutOfBoundsException");
                }
            }
        }



    }

}