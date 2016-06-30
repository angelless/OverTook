package walking;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.level.particle.EnchantmentTableParticle;
import cn.nukkit.level.particle.Particle;
import cn.nukkit.math.Vector3;
import cn.nukkit.plugin.PluginBase;

public class Walk extends PluginBase implements Listener{

	@Override
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler
	public void onWalking(PlayerMoveEvent event){
		Player player = event.getPlayer();
		Particle particle = new EnchantmentTableParticle(new Vector3(player.getX(), player.getY(), player.getZ()));
		player.getLevel().addParticle(particle);
	}
}
