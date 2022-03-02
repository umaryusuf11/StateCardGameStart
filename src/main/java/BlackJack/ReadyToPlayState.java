package BlackJack;

import Player.Player;

public class ReadyToPlayState implements PlayerState{

    public void setState(BlackJack game, Player player, BlackJackAction action) {
        action = game.getPlayerAction(player);
        PlayerState state = this;
        if (action == BlackJackAction.TWIST) {
            state = new TwistState();
        } else if (action == BlackJackAction.STICK){
            state = new StickState();
        } else {
            state = new EndState();
        }
        game.setPlayerState(state, player, action);
    }

    public BlackJackAction getState(){
        return BlackJackAction.READY_TO_PLAY;
    }
}
