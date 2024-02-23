package fun.minestarsv.afly;



public class start implements Listener {
    public void event(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String pl_name = player.getName();

        if (player.hasPermission("afly.use")){
            player.sendMessage(ChatColor.YELLOW + "Magic Fly enabled v_1.0");
        }
    }
}
