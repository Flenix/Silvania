package co.uk.silvania.Silvania;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundRegistry {
	
	@ForgeSubscribe
	public void onSound(SoundLoadEvent event) {
		try {
			event.manager.soundPoolSounds.addSound("/mods/Silvania/resources/audio/skinandbones.ogg", Silvania.class.getResource("/mods/Silvania/resources/audio/skinandbones.ogg"));
		}
		
		catch (Exception e) {
			System.err.println("Failed to register sound file: Xylexia - Skin & Bones");
		}
	}

}
