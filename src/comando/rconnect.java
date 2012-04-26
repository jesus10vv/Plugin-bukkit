package comando;
//All the imports
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.command.*;
/**
* Basic for Bukkit
*
* @author Samkio
*/
//Starts the class
public class rconnect extends JavaPlugin{
	Logger log;
	public void onEnable(){
		log = this.getLogger();
		log.info("Mi plugin ha sido activado!");
	}
 
	public void onDisable(){
		log.info("Mi plugin ha sido desactivado");
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		if(cmd.getName().equalsIgnoreCase("basic")){ // If the player typed /basic then do the following...
			// doSomething
			

		if ((sender instanceof Player)) {
			sender.sendMessage("You must NOT be a player!");// doSomething
	        } else {
	           sender.sendMessage("You must be a player!");
	           return false;
	        }
	        return false;
	}
		return true;
	} //If this has happened the function will break and return true. if this hasn't happened the a value of false will be returned.
}
