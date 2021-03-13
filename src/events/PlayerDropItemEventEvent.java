package events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerDropItemEvent;
import cn.nukkit.potion.Effect;


public class PlayerDropItemEventEvent implements Listener {
	
	@EventHandler
	public void on(PlayerDropItemEvent event)
	{
		Player player = event.getPlayer();
		player.sendMessage("§cHoplla du hast dein Item Gedroppt, weil du dein Item gedroppt hast muss du abwarten bis der Effekt weg geht!!!");
		player.addEffect(Effect.getEffect(Effect.LEVITATION).setDuration(300 * 20).setAmplifier(2).setVisible(false));
	}
}
