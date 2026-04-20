package ru.mantiyt.rideeggkeeper;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.plugin.java.JavaPlugin;
import ru.mantiyt.rideeggkeeper.commands.EggCommand;
import ru.mantiyt.rideeggkeeper.item.ItemEgg;
import ru.mantiyt.rideeggkeeper.menu.Events;
import ru.mantiyt.rideeggkeeper.menu.MenuHolder;
import ru.mantiyt.rideeggkeeper.utils.Event;

public final class RideEggKeeper extends JavaPlugin {
    private static NamespacedKey oskolEggKey;
    private static NamespacedKey enderEggKey;
    public static RideEggKeeper instance;
    public static MenuHolder holder;
    public static ItemEgg itemEgg;

    @Override
    public void onEnable() {
        instance = this;
        holder = MenuHolder.INSTANCE;
        itemEgg = new ItemEgg();

        oskolEggKey = new NamespacedKey(this, "oskol");
        enderEggKey = new NamespacedKey(this, "ender");

        registerEvents();
        registerCommands();
    }

    private void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new Event(), this);
        Bukkit.getPluginManager().registerEvents(new Events(), this);
    }

    private void registerCommands() {
        EggCommand executor = new EggCommand();
        getCommand("rideeggkeeper").setExecutor(executor);
        getCommand("rideeggkeeper").setTabCompleter(executor);
        getCommand("eggkeeper").setExecutor(executor);
    }

    public static NamespacedKey getOskolEggKey() {
        return oskolEggKey;
    }

    public static NamespacedKey getEnderEggKey() {
        return enderEggKey;
    }

    public static RideEggKeeper getInstance() {
        return instance;
    }
}