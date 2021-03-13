package commands;


import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class Plugin extends Command {
	
	public Plugin() 
	{
	  super("Info");
	}
	
	 @Override
	 public boolean execute(CommandSender sender, String string, String[] args)  {
		 sender.sendMessage("Test1");
		 return false;
	 }
	
}
