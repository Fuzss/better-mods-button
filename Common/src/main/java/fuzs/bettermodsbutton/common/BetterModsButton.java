package fuzs.bettermodsbutton.common;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterModsButton {
    public static final String MOD_ID = "bettermodsbutton";
    public static final String MOD_NAME = "Better Mods Button";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
