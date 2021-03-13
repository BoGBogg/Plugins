package events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.potion.Effect;

public class BlockBreakEventEvent implements Listener {
	
	@EventHandler
	public void on(BlockBreakEvent event)
	{
		Player player = event.getPlayer();
		player.sendMessage("Du hast einen Block abgebaut.");
		player.addEffect(Effect.getEffect(Effect.HASTE).setDuration(300 * 20).setAmplifier(2).setVisible(false));
		
	}


}
