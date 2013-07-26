package dotapick;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;








public class Dotapick extends JavaPlugin implements Listener {
    Inventory radiantinv;
    Inventory scourgeinv;
    List<String> picklist = new ArrayList<>();
    List<String> whopickedlist = new ArrayList<>();
    ItemStack itemstack0 = new ItemStack(Material.WOOL);
    ItemStack itemstack1 = new ItemStack(Material.WOOL);
    ItemStack itemstack2 = new ItemStack(Material.WOOL);
    ItemStack itemstack3 = new ItemStack(Material.WOOL);
    ItemStack itemstack4 = new ItemStack(Material.WOOL);
    ItemStack itemstack5 = new ItemStack(Material.WOOL);
    ItemStack itemstack6 = new ItemStack(Material.WOOL);
    ItemStack itemstack7 = new ItemStack(Material.WOOL);
    ItemStack itemstack8 = new ItemStack(Material.WOOL);
    ItemStack itemstack9 = new ItemStack(Material.WOOL);
    ItemStack itemstack10 = new ItemStack(Material.WOOL);
    ItemStack itemstack11 = new ItemStack(Material.WOOL);
    
    
   
      
    
    @Override
    public void onEnable() {       
                radiantinv = Bukkit.getServer().createInventory(null,54,"Choose your class Radiant");
                scourgeinv = Bukkit.getServer().createInventory(null,54,"Choose your class");
                Bukkit.getPluginManager().registerEvents(this, this);
                
        
                itemstack0.setDurability((short)5);
                ItemMeta imeta = Bukkit.getItemFactory().getItemMeta(Material.STONE);
                imeta.setDisplayName("Warrior");
                List<String> warriorlore = new ArrayList<>();
                warriorlore.add("xdd");
                warriorlore.add("line 2");
                imeta.setLore(warriorlore);
                itemstack0.setItemMeta(imeta);
                radiantinv.setItem(0,itemstack0);
                scourgeinv.setItem(0,itemstack0.clone());
        
                itemstack1.setDurability((short)5); 
                ItemMeta imetarogue = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetarogue.setDisplayName("Rogue");
                List<String> roguelore = new ArrayList<>();
                roguelore.add("xdd");
                roguelore.add("line 2");
                imetarogue.setLore(roguelore);
                itemstack1.setItemMeta(imetarogue);
                radiantinv.setItem(1,itemstack1);
                scourgeinv.setItem(1,itemstack1.clone());
                
                itemstack2.setDurability((short)5); 
                ItemMeta imetahunter = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetahunter.setDisplayName("Hunter");
                List<String> hunterlore = new ArrayList<>();
                hunterlore.add("xdd");
                hunterlore.add("line 2");
                imetahunter.setLore(hunterlore);
                itemstack2.setItemMeta(imetahunter);
                radiantinv.setItem(2,itemstack2);
                scourgeinv.setItem(2,itemstack2.clone());
                
                itemstack3.setDurability((short)5); 
                ItemMeta imetacleric = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetacleric.setDisplayName("Cleric");
                List<String> clericlore = new ArrayList<>();
                clericlore.add("xdd");
                clericlore.add("line 2");
                imetacleric.setLore(clericlore);
                itemstack3.setItemMeta(imetacleric);
                radiantinv.setItem(3,itemstack3);
                scourgeinv.setItem(3,itemstack3.clone());
                
                itemstack4.setDurability((short)5); 
                ItemMeta imetaberserker = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetaberserker.setDisplayName("Berserker");
                List<String> berserkerlore = new ArrayList<>();
                berserkerlore.add("xdd");
                berserkerlore.add("line 2");
                imetaberserker.setLore(berserkerlore);
                itemstack4.setItemMeta(imetaberserker);
                radiantinv.setItem(4,itemstack4);
                scourgeinv.setItem(4,itemstack4.clone());
                
                itemstack5.setDurability((short)5); 
                ItemMeta imetasorcerer = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetasorcerer.setDisplayName("Sorcerer");
                List<String> sorcererlore = new ArrayList<>();
                sorcererlore.add("xdd");
                sorcererlore.add("line 2");
                imetasorcerer.setLore(sorcererlore);
                itemstack5.setItemMeta(imetasorcerer);
                radiantinv.setItem(5,itemstack5);
                scourgeinv.setItem(5,itemstack5.clone());
                
                itemstack6.setDurability((short)5); 
                ItemMeta imetamage = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetamage.setDisplayName("Mage");
                List<String> magelore = new ArrayList<>();
                magelore.add("xdd");
                magelore.add("line 2");
                imetamage.setLore(magelore);
                itemstack6.setItemMeta(imetamage);
                radiantinv.setItem(6,itemstack6);
                scourgeinv.setItem(6,itemstack6.clone());
                
                itemstack7.setDurability((short)5); 
                ItemMeta imetaengineer = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetaengineer.setDisplayName("Mage");
                List<String> engineerlore = new ArrayList<>();
                engineerlore.add("xdd");
                engineerlore.add("line 2");
                imetaengineer.setLore(engineerlore);
                itemstack7.setItemMeta(imetaengineer);
                radiantinv.setItem(7,itemstack7);
                scourgeinv.setItem(7,itemstack7.clone());
                
                itemstack8.setDurability((short)5); 
                ItemMeta imetanecromancer = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetanecromancer.setDisplayName("Necromancer");
                List<String> necromancerlore = new ArrayList<>();
                necromancerlore.add("xdd");
                necromancerlore.add("line 2");
                imetanecromancer.setLore(necromancerlore);
                itemstack8.setItemMeta(imetanecromancer);
                radiantinv.setItem(8,itemstack8);
                scourgeinv.setItem(8,itemstack8.clone());
                
                itemstack9.setDurability((short)5); 
                ItemMeta imetalycan = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetalycan.setDisplayName("Lycan");
                List<String> lycanlore = new ArrayList<>();
                lycanlore.add("xdd");
                lycanlore.add("line 2");
                imetalycan.setLore(lycanlore);
                itemstack9.setItemMeta(imetalycan);
                radiantinv.setItem(9,itemstack9);
                scourgeinv.setItem(9,itemstack9.clone());
                
                itemstack10.setDurability((short)5); 
                ItemMeta imetachronomancer = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetachronomancer.setDisplayName("Chronomancer");
                List<String> chronomancerlore = new ArrayList<>();
                chronomancerlore.add("xdd");
                chronomancerlore.add("line 2");
                imetachronomancer.setLore(chronomancerlore);
                itemstack10.setItemMeta(imetachronomancer);
                radiantinv.setItem(10,itemstack10);
                scourgeinv.setItem(10,itemstack10.clone());
                
                itemstack11.setDurability((short)5); 
                ItemMeta imetamonk = Bukkit.getItemFactory().getItemMeta(Material.STONE);    
                imetamonk.setDisplayName("Monk");
                List<String> monklore = new ArrayList<>();
                monklore.add("xdd");
                monklore.add("line 2");
                imetamonk.setLore(monklore);
                itemstack11.setItemMeta(imetamonk);
                radiantinv.setItem(11,itemstack11);
                scourgeinv.setItem(11,itemstack11.clone());
                
                
                whopickedlist.add(0,"");
                whopickedlist.add(1,"");
                whopickedlist.add(2,"");
                whopickedlist.add(3,"");
                whopickedlist.add(4,"");
                whopickedlist.add(5,"");
                whopickedlist.add(6,"");
                whopickedlist.add(7,"");
                whopickedlist.add(8,"");
                whopickedlist.add(9,"");
                whopickedlist.add(10,"");
                whopickedlist.add(11,"");


    }
 
    @Override
    public void onDisable() {
        
    }
	@Override    
public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
            if (sender instanceof Player) {
            Player player = (Player) sender;
            } else{
                sender.sendMessage("You must be a player!");
                    return false;}
            if(cmd.getName().equalsIgnoreCase("pick")){ 
		////sender.sendMessage("fuck you");

                Player player = (Player)sender;
                player.openInventory(radiantinv);
            }
            if(cmd.getName().equalsIgnoreCase("repick")){
                
                int xd5 = whopickedlist.indexOf(sender.getName());
                String xd6 = ""+xd5;
                sender.sendMessage(xd6);
                whopickedlist.remove(xd5);
                whopickedlist.add(xd5, "");
                
                ItemStack itemstackre = radiantinv.getItem(xd5);
                itemstackre.setDurability((short)5);
                radiantinv.setItem(xd5,itemstackre);
                Player player = (Player)sender;
                player.openInventory(radiantinv);

		return true;
	} 
	return false;   
    }            
    @EventHandler
    public boolean onInventoryClickEvent(InventoryClickEvent event){
                // 14 red 
                
                Inventory inv = event.getInventory();
                String inv2 = inv.getName();  
                String pick1 = ""+event.getRawSlot();
                String name = ""+event.getWhoClicked().getName();
                
                

                if (inv2.equals("Choose your class Radiant")) {
                 event.setCancelled(true);
                // ((Player)event.getWhoClicked()).sendMessage(inv2);
                 ((Player)event.getWhoClicked()).sendMessage(pick1);
                 
                 
                } 
                else{((Player)event.getWhoClicked()).sendMessage("fuck du");
                return false;}
                
                if (whopickedlist.contains(name)!=true)
                {}else{return false;}
                
                if (event.getRawSlot() >= 0){}///just check to ignore clicks outside of inventory window(-999?)
                else {return false;}
                
                if (event.getRawSlot() < 12){}///checks max number of classes hard coded ;(((
                else {return false;}
                
                if (picklist.contains(pick1)!=true){    
                ((Player)event.getWhoClicked()).sendMessage("gz"); 
                
                
                ItemStack xxd = event.getCurrentItem();
                xxd.setDurability((short)14);
                radiantinv.setItem(event.getRawSlot(),xxd); 
                picklist.add(pick1);
                ItemMeta xd3 = xxd.getItemMeta();
                String xd2 = ""+xd3.getDisplayName();
                ((Player)event.getWhoClicked()).sendMessage(xd2);
                CommandSender sender = (CommandSender) event.getWhoClicked();
                String sender2 = "hero admin class " +sender.getName()+ " " + xd2;
                getServer().dispatchCommand(getServer().getConsoleSender(), sender2);
                
                whopickedlist.add(event.getRawSlot(),name);
                
                            
                
                
                return true;}
                
               
    
                return false;
    }
 
  
    
    
    
    
}
            
            
                    

  

    
    
