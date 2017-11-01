package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {

	@Test
	public void test() {
		GamePlay gp = new GamePlayBlackJack(eGameType.POKER);
		ArrayList<Player> Players = new ArrayList<Player>();
		Player p1 = new Player("John",1);
		Player p2 = new Player("Alex",2);
		Player p3 = new Player("Joy",3);
		Player p4 = new Player("Lucy",4);
		Players.add(p1);
		Players.add(p2);
		Players.add(p3);
		Players.add(p4);
		gp.AddPlayersToGame(Players);
		assertEquals(gp.GetPlayerInGame(p1),p1);
		assertEquals(gp.GetPlayerInGame(p2),p2);
		assertEquals(gp.GetPlayerInGame(p3),p3);
		assertEquals(gp.GetPlayerInGame(p4),p4);
		gp.RemovePlayerFromGame(p1);
		gp.RemovePlayerFromGame(p2);
		gp.RemovePlayerFromGame(p3);
		gp.RemovePlayerFromGame(p4);
	}

}
