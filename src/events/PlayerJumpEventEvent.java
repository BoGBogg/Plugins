package events;


import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJumpEvent;

public class PlayerJumpEventEvent implements Listener{
	
	@EventHandler
	public void on(PlayerJumpEvent event)
	{
		Player player = event.getPlayer();
		player.setCanClimbWalls();
		
	}

}
