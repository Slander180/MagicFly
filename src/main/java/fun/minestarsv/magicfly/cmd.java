package fun.minestarsv.magicfly;



public class cmd implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command arg0, String arg1, String[] arg2) {
        Player player = (Player) sender;

        Boolean is_fly = player.isFlying();

        if (sender instanceof Player){

            if (is_fly){
                player.setFlying(false);
                player.sendMessage(ChatColor.RED + "Flight disabled  ");
            }
            else {
                player.setFlying(true);
                player.sendMessage(ChatColor.YELLOW + "Flight activated  ");
            }
        }

        return false;
    }
}
