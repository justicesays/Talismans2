package Talismans2.keybinding;

import Talismans2.lib.Key;
import Talismans2.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;

/**
 * @author Gigabit101
 */

public class KeyInputEventHandler {
	private static Key getPressedKeybinding() {
		if (Keybindings.craft.isPressed()) {
			return Key.CRAFT;
		}

		return Key.UNKNOWN;
	}

	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event) {
		LogHelper.info(getPressedKeybinding());
	}

}
