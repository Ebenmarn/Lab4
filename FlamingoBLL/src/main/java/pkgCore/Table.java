package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	private HashMap<UUID,Player> PlayersMap = new HashMap<UUID,Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		//TODO: Implement this method
		PlayersMap.put(p.getPlayerID(), p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		//TODO: Implement this method
		PlayersMap.remove(p.getPlayerID());
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		//TODO: Implement this method	
		return PlayersMap.get(p.getPlayerID());
	}
}
