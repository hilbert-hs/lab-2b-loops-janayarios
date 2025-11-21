import java.util.Scanner;

  public class Tickets {
public static void main(String[] args) {
  // write your code here
  Scanner scan = new Scanner(System.in);
    
  double ticketCostTotal = 0;
  String ticket = "";
  int numTickets = 0;
  int NumBTicket = 0;
  int NumPTicket = 0;
  int NumLTicket = 0;

    while (!(ticket.toLowerCase().equals("q"))) {
      System.out.println("What ticket will you buy? [B P L. Type Q to exit loop]");
      ticket = scan.nextLine();
      if (  !(ticket.toLowerCase().equals("b")) && !(ticket.toLowerCase().equals("p")) && !(ticket.toLowerCase().equals("l")) && !(ticket.toLowerCase().equals("q")))
      {
        System.out.println("That is not a ticket!");
      }
      else if (ticket.equals("B") || ticket.equals("b"))
      {
        ticketCostTotal += 75;
        numTickets++;
        NumBTicket++;
      }
      else if (ticket.equals("P") || ticket.equals("p"))
      {
        ticketCostTotal += 30;
        numTickets++;
        NumPTicket++;

      }
      else if (ticket.equals("L") || ticket.equals("l"))
      {
        ticketCostTotal += 21;
        numTickets++;
        NumLTicket++;
      }
    }

    System.out.println(NumBTicket + "...Box Ticket(s)........$" + (NumBTicket * 75));
    System.out.println(NumPTicket + "...Pavilion Ticket(s)...$" + (NumPTicket * 30));
    System.out.println(NumLTicket + "...Lawn Ticket(s).......$" + (NumLTicket * 21));
    System.out.println("....Convenience Fee......$" + (1.50 * numTickets));
    System.out.println("....Total................$" + ((1.50 * numTickets) + ticketCostTotal));
  } 
}


// write any helper methods here
