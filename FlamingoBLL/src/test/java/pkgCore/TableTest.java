package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {

	@Test
	public void test() {
		Table t = new Table();
		Player p1 = new Player("John",1);
		Player p2 = new Player("Alex",2);
		t.AddPlayerToTable(p1);
		t.AddPlayerToTable(p2);
		assertEquals(t.GetPlayerFromTable(p1),p1);
	}

	
}
