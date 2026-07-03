package mom.starchie.plugtato;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public static void main(String[] args) {
        System.out.print("potato");
    }
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Plugtato has been enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Plugtato has been disabled!");
    }
}
