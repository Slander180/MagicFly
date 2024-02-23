package fun.minestarsv.magicfly;

public final class Magicfly extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginCommand("fly").setExecutor(new cmd());
        getServer().getPluginManager().registerEvents(new fun.minestarsv.afly.start(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.LIGHT_PURPLE + "Magic Fly ON Shod : v1");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "Magic Fly OFF Shod");
    }
}
