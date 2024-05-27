package net.melange.mcmelange.item;

import net.melange.mcmelange.MelangeMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@SuppressWarnings("unused")
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MelangeMod.MODID);

    //ITEMS GO HERE//

    public static final RegistryObject<Item> TEST =
            ITEMS.register("test", () -> new Item(
            new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //#############//

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
