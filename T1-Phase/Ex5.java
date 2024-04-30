/*
Date:-13/03/2024
Name:-Krish Zinzuvadiya 
AIM :-During ipl match 2024 security guard welcomes each team player with gifts 
      he checks identity of each player at gate no 1 
      if players belongs to team mi then the gives them gold coin  
      if players belongs to team gt then the gives them silver coin
      creat nessacry class to use instanceof operator to check identity to player and give gift accroding to
      parent class player 
      child classes-mi playes & gt player 
      create method check idntity int both child classes    
*/
class Ex5 {
    public static void main(String[] args) {
        Player p1;
        MiPlayer mi = new MiPlayer();
        GtPlayer gt = new GtPlayer();
        p1 = mi;
        mi.checkIdentity(p1);
        gt.checkIdentity(p1);
    }
}

class Player {

}

class MiPlayer extends Player {
    void checkIdentity(Player p) {
        if (p instanceof MiPlayer) {
            System.out.println("Gold coin");
        } else {
            System.out.println("Not Mi Player ");
        }
    }
}

class GtPlayer extends Player {
    void checkIdentity(Player p) {
        if (p instanceof GtPlayer) {
            System.out.println("Silver coin");
        } else {
            System.out.println("Not Gt Player ");
        }
    }
}