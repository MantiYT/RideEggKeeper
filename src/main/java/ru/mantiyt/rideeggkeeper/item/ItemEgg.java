package ru.mantiyt.rideeggkeeper.item;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import ru.mantiyt.rideeggkeeper.RideEggKeeper;

public class ItemEgg {

    public ItemStack getOskolEgg(int amount) {
        ItemStack item = new ItemStack(Material.PUFFERFISH_SPAWN_EGG, amount);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&B&5&6&7&0&0О&x&C&0&6&B&0&0с&x&C&A&7&0&0&0к&x&D&5&7&4&0&0о&x&D&F&7&9&0&0л&x&E&A&7&D&0&0о&x&F&4&8&2&0&0ч&x&F&F&8&6&0&0н&x&F&4&8&2&0&0о&x&E&A&7&D&0&0е &x&D&5&7&4&0&0я&x&C&A&7&0&0&0й&x&C&0&6&B&0&0ц&x&B&5&6&7&0&0о"));

        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', " "));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Особенности:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&x&E&7&E&7&E&7 - получайте &x&F&F&8&6&0&0осколочные яйца"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&0.&x&E&7&E&7&E&7   добывая вещи из посылок;"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&x&E&7&E&7&E&7 - можно обменять на &x&F&F&8&6&0&0яйца призыва"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&0.&x&E&7&E&7&E&7   у специального NPC на спавне."));
        lore.add(ChatColor.translateAlternateColorCodes('&', " "));
        meta.setLore(lore);

        meta.getPersistentDataContainer().set(RideEggKeeper.getOskolEggKey(), PersistentDataType.INTEGER, 1);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack getEnderEgg(int amount) {
        ItemStack item = new ItemStack(Material.ENDERMAN_SPAWN_EGG, amount);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&x&7&6&0&0&B&2О&x&7&B&0&0&B&Aс&x&8&1&0&0&C&3к&x&8&7&0&0&C&Bо&x&8&D&0&0&D&4л&x&9&2&0&0&D&Cо&x&9&8&0&0&E&5ч&x&9&E&0&0&E&Dн&x&A&4&0&0&F&6о&x&A&A&0&0&F&Fе &x&A&4&0&0&F&6э&x&9&E&0&0&E&Dн&x&9&8&0&0&E&5д&x&9&2&0&0&D&Cе&x&8&D&0&0&D&4р &x&8&7&0&0&C&Bя&x&8&1&0&0&C&3й&x&7&B&0&0&B&Aц&x&7&6&0&0&B&2о"));

        meta.addEnchant(Enchantment.LUCK, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.translateAlternateColorCodes('&', " "));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&8Особенности:"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&x&E&7&E&7&E&7 - получайте такие &x&A&A&0&0&F&Fосколочные эндер яйца"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&0.&x&E&7&E&7&E&7   исследуя и сражаясь за &x&A&A&0&0&F&FЭндер-мир;"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&x&E&7&E&7&E&7 - можно обменять на ценное &x&A&A&0&0&F&FЯйцо Дракона"));
        lore.add(ChatColor.translateAlternateColorCodes('&', "&5&0.&x&E&7&E&7&E&7   у специального NPC на спавне."));
        lore.add(ChatColor.translateAlternateColorCodes('&', " "));
        meta.setLore(lore);

        meta.getPersistentDataContainer().set(RideEggKeeper.getEnderEggKey(), PersistentDataType.INTEGER, 1);
        item.setItemMeta(meta);
        return item;
    }
}