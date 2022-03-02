package BlackJack;

import Player.Player;

public class EndState implements PlayerState{
    
    public void setState(BlackJack game, Player player, BlackJackAction action){
        game.userOutput.output("End");
        game.determineWinner(game.players);
    }

    public BlackJackAction getState(){
        return BlackJackAction.END;
    }
}
