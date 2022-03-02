package BlackJack;

import Player.Player;

public class TwistState implements PlayerState{

    public void setState(BlackJack game, Player player, BlackJackAction action) {
        player.getHand().add(game.getDeck().playACard());
        if(game.getScore(player.getHand())>= game.maxScore) {
            game.setPlayerState(new EndState(), player, action);
        }
        else{
            game.setPlayerState(new ReadyToPlayState(), player, action);
        }
    }
    public BlackJackAction getState(){
        return BlackJackAction.TWIST;
    }

}
