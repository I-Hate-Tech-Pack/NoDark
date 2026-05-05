package cn.hwoxu.nodark;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Nodark.MODID)
public class Nodark {

    public static final String MODID = "nodark";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Nodark(IEventBus modEventBus, ModContainer modContainer) {

    }
}
