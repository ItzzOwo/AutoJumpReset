package AutoJumpReset;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import com.google.common.eventbus.Subscribe;
import net.minecraft.network.play.server.S12PacketEntityVelocity;
import AutoJumpReset.PacketEvent;

public class Jump {
   public static final Minecraft mc = Minecraft.getMinecraft();

   @Subscribe
   public void onPacket(PacketEvent e) {
       if (e.isIncoming()) {
           if (e.getPacket() instanceof S12PacketEntityVelocity) {
               if (((S12PacketEntityVelocity) e.getPacket()).getEntityID() == mc.thePlayer.getEntityId()) {
                   if(mc.thePlayer.onGround) {
                       mc.thePlayer.jump();
                   }
               }
           }
       }
   }

}
