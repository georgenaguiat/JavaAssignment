package alfredBot;

import java.util.Date;
class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int alexisIndex = conversation.indexOf("Alexis");
        int alfredIndex = conversation.indexOf("Alfred");

        if (alexisIndex != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (alfredIndex != -1) {
            return "At your service. As you wish, naturally.";
        }else {
            return "Right. And with that I shall retire.";
        }
        
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

