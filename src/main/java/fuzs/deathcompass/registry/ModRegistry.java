package fuzs.deathcompass.registry;

import fuzs.deathcompass.DeathCompass;
import fuzs.deathcompass.world.item.DeathCompassItem;
import fuzs.puzzleslib.registry.RegistryManager;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModRegistry {
    private static final RegistryManager REGISTRY = RegistryManager.of(DeathCompass.MOD_ID);
    public static final RegistryObject<Item> DEATH_COMPASS_ITEM = REGISTRY.registerItem("death_compass", () -> new DeathCompassItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static void touch() {

    }
}
