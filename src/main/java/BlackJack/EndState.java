package BlackJack;

import Player.Player;

public class EndState implements PlayerState{
    
    public void setState(BlackJack game, Player player, BlackJackAction action){
        if(action == BlackJackAction.END) {
            game.userOutput.output("End");
            game.determineWinner(game.players);
        }
        else{
            game.determineWinner(game.players);
            game.showPlayers();
            game.resetPlayers();
            game.dealCards();
            game.setPlayerState(new ReadyToPlayState(), player, action);
        }
    }

    public BlackJackAction getState(){
        return BlackJackAction.END;
    }
}
