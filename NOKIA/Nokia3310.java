import java.util.Scanner;

public class Nokia3310{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println(" MENU");

System.out.println("1. Phonebook");

System.out.println("2. Message");

System.out.println("3. Chat");

System.out.println("4. Call register");

System.out.println("5. Tone");

System.out.println("6. Settings");

System.out.println("7. Call divert");

System.out.println("8. Games");

System.out.println("9. calculator");

System.out.println("10. Reminders");

System.out.println("11. Clock");

System.out.println("12. profile");

System.out.println("13. Sim service");

System.out.println("Enter menu:  ");

int gem = input.nextInt();


switch (gem){
   case 1: System.out.println("Phone book");
    System.out.println("1: Search");
    System.out.println("2: Service Nos");
    System.out.println("3: Add name");
    System.out.println("4: Erase");
    System.out.println("5: Edit");
    System.out.println("6: Assign tone");
    System.out.println("7: Send b'card");
    System.out.println("8: Options");
    System.out.println("9: Speed dials");
    System.out.println("10: Voice tags");
   
System.out.print("Enter option: ");
int phonebook = input.nextInt();

switch (phonebook) {
    case 1: System.out.println("1: Search");
break;
    case 2: System.out.println("2: Service Nos");
break;
    case 3: System.out.println("3: Add name");
break;
    case 4: System.out.println("4: Erase");
break;
    case 5: System.out.println("5: Edit");
break;
    case 6: System.out.println("6: Assign tone");
break;
    case 7: System.out.println("7: Send b'card");
break;
    case 8: System.out.println("8: Options");
            System.out.println("1: Type of view");
            System.out.println("2: Memory status");

System.out.print("Enter option: ");
 int options = input.nextInt();
 switch (options) {
    case 1: System.out.println("1: Type of view");
break;
    case 2: System.out.println("2: Memory status");
break;
    default: System.out.println("Wrong parameter");
break;
}
break;

    case 9: System.out.println("9: Speed dials");
break;
    case 10: System.out.println("10: Voice tags");
break;
    default: System.out.println("wrong parameter");
break;


    
    System.out.println("1: Write message");
    System.out.println("2: Inbox");
    System.out.println("3: Outbox");
    System.out.println("4: Picture message");
    System.out.println("5: Template");
    System.out.println("6: Smileys");
    System.out.println("7: Message Settings");
    System.out.println("8: Info Service");
    System.out.println("9: Voice mailbox numbe");
    System.out.println("10: Service command editor");

   System.out.print("Enter option: ");
  int message = siko.nextInt();
switch(Message){
    case 1: System.out.println("1: Write Message");
break;
    case 2: System.out.println("2: Inbox");
break;
    case 3: System.out.println("3: Outbox");
break;
    case 4: System.out.println("4: Picture Messsage");
break;
    case 5: System.out.println("5: Template");
break;
    case 6: System.out.println("6: Smileys");
break;
    case 7: System.out.println("Message Setting");

            System.out.println("Enter Option: ");
            int choices = input.nextInt();
              switch(choices) {
                case 1 : System.out.print("1.Message centre number");
        break;
                case 2 : System.out.print("Messages sent as");
        break;
                case 3 : System.out.print("Message validity");
        break;
}           
break
               System.out.print("Enter common");
               int urban = input.nextInt();
                switch(urban) {
            case 1 : System.out.print("Delivery report");
        break;
            case 2 : System.out.print("Reply via same centre")
        break;
            case 3 : System.out.print("Character support")
        break;
}
break;
               case 8 : System.out.print("Info service");
  break;
               case 9 : System.out.print("Voice mailbox number");
  break;
                case 10 :System.out.print("Service command editor");
    break;

   
         case 3 : System.out.println("Chat");
break;

        case 4 : System.out.print("Call register");
      
        System.out.println("1: Missed calls");
        System.out.println("2: Recieve calls");
        System.out.println("3: Dialled numbers");
        System.out.println("4: Erase recent call list");
        System.out.println("5: call duration");
        System.out.println("6: Call costs");
        System.out.println("7: Call cost Settings");
        System.out.println("8: Prepaid credit");

     System.out.print("Enter option: ");
  int message = biggy.nextInt();
switch(Message){
    case 1: System.out.println("1: Missed call");
break;
    case 2: System.out.println("2: Recieved calls");
break;
    case 3: System.out.println("3: Dialled numbers");
break;
    case 4: System.out.println("4: Erase recent call list");
break;
    case 5: System.out.println("5: Call duration");

            System.out.println("Enter Option: ");
            int bokku = input.nextInt();
              switch(bokku) {
                case 1 : System.out.println("last call duration");
        break;
                case 2 : System.out.println("All calls duration");
        break;
                case 3 : System.out.println("Recieved calls duration");
        break;
                case 4 : System.out.println("Dialled call duration");
        break;
                 case 5 : System.out.println("Clear timers");
        break;
  }
  break;

break
    case 6: System.out.println("6: Call cost");
            System.out.print("Enter option: ");
            int smile = input.nextInt();
            switch(smile){
            case 1 : System.out.println("last call cost");
        break;
                case 2 : System.out.println("All calls cost");
        break;
                case 3 : System.out.println("Clear counters");
    break;
        }
        break;

    case 7: System.out.println("Call cost Settings");

            System.out.println("Enter Option: ");
            int Sammy = input.nextInt();
              switch(Sammy) {
                case 1 : System.out.print("1.Call cost limit");
        break;
                case 2 : System.out.print("Cost in");
        break;
    }
        break;

         case 8 : System.out.println("Prepaid credit");
  
                




}

}

}
}
