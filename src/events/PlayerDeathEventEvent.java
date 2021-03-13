package events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerDeathEvent;

public class PlayerDeathEventEvent implements Listener {
	
	@EventHandler
	public void on(PlayerDeathEvent event)
	{
		Player player = event.getEntity().getPlayer();
	  event.setDeathMessage(player.getName() + "ist gestorben.");
	  
		
	}

}
