import java.util.Arrays;
import java.util.Scanner;

public class CovidTracker extends HashTableMap {

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    HashTableMap map = new HashTableMap(10);
    System.out.println(
        "Welcome to UW-Madison COVID Tracker!\nCommands:\nI: Insert\nG: Get object\nS: Size \nC: Contains \nR: Remove object\nL: Clear\nQ: Quit");
    String commands = scnr.nextLine().trim().toLowerCase();
    while (commands.charAt(0) != 'q') {
      System.out.print("Enter a command:");
      commands = scnr.nextLine().trim().toLowerCase();
      switch (commands) {
        case "s":
          System.out.println(map.size());
          break;
        case "i":
          System.out.println("Enter student ID:");
          int id1 = scnr.nextInt();
          System.out.println("Enter student location:");
          String location = scnr.next();
          System.out.println("Enter student status:");
          String status = scnr.next();
          Student object = new Student(id1, location, status);
          map.put(id1, object);
          System.out.println("Student " + id1 + " is added");
          break;
        case "r":
          System.out.println("Enter student ID:");
          int id = scnr.nextInt();
          System.out.print(map.remove(id) + "is removed");
          break;
        case "m":
          System.out.println(
              "Menu:\nG: Get object\nS: Size \nC: Contains \nR: Remove object\nL: Clear\nQ: Quit");
          break;
        case "l":
          map.clear();
          System.out.println("Map is cleared");
          break;
        case "g":
          System.out.println("Enter student ID:");
          int id2 = scnr.nextInt();
          System.out.print(map.get(id2));
          break;
        case "c":
          System.out.println("Enter student ID:");
          int id3 = scnr.nextInt();
          System.out.println(map.containsKey(id3));
          break;
        case "q":
          System.out.println("Bye!");
          break;
        default:
          System.out.println("That is not an input. Type m for commands.");
      }

    }
  }


}
