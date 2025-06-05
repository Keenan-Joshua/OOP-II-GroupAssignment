//scenario: there are different ways of sending a message: gamil ond teams
//Adheres to the Interface Segregation Principle 
public interface deliveryMethod { 
    void deliver(String message);
}
//the interface is implemented in all classes
public class gmailApplication implements deliveryMethod{
    public void deliver(String message){
        System.out.println("Sending message via Gmail: " + message);
    }

}

public class teamsApplication implements deliveryMethod {
    public void deliver(String message){
        System.out.println("Sending message via Teams: "+message);
    }

}

public class sendMessage {
    public void send(deliveryMethod method, String message) {
        method.deliver(message);
    }

}


//does not adhere
//no interface as in this case "deliveryMethod"
public class sendMessage{
    public void send(String type, String message){
        if(type.equals("gmailApplication")){//uses if-else instead of polymorphism
            System.out.println("Sending message via gmail: "+message);
        }
        else if(type.equals("teamsApplication")){
            System.out.println("Sending message via teams: "+message);
        }
        else{
            System.out.println("Invalid application type");
        }

    }
}
