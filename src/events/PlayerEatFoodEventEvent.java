package events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerEatFoodEvent;
import cn.nukkit.potion.Effect;

public class PlayerEatFoodEventEvent implements Listener {
	
	@EventHandler
	public void on(PlayerEatFoodEvent event)
	{
		Player player = event.getPlayer();
		player.sendMessage("§2Du hast dein leckeres Essen gegessen :D");
		player.addEffect(Effect.getEffect(Effect.FIRE_RESISTANCE).setDuration(300 * 20).setAmplifier(2).setVisible(false));
		
	}
}
