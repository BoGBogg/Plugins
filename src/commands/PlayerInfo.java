package commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class PlayerInfo extends Command {
	
	public PlayerInfo() 
	{
	  super("Kick", "Kicke einen Spieler vom Server.");
	}
	
    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
             Player player = (Player) sender;
            if(player.hasPermission("command.kick")) {
            	if(args.length == 0) {
            	} else if(args.length == 1) {
            		Player target = player.getPlayer();
            		if(target != null) {
            			target.kick();
            			target.sendMessage("§2Du hast den Spieler erflogreich gekickt.");
            	} else
            		player.sendMessage("§aDer Spieler §6\" + args[0] + \" §cist nicht auf dem Server.");
            } else 
            	player.sendMessage("§cBitte benutze §6/kick <spieler>§c!");
        } else
        	player.sendMessage("§cDu hast für den Command keine rechte!");
     
        return false;
  }
}
        
    
	

	
