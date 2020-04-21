package HashCodeveEquals;

import java.util.HashSet;
import java.util.Set;

public class Main {
	static class Player {
		private String isim;
		private int id;
		public Player(String isim, int id) {
			
			this.isim = isim;
			this.id = id;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "||||" + id + " isim: " + isim + "||||";
			
			
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((isim == null) ? 0 : isim.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Player other = (Player) obj;
			if (id != other.id)
				return false;
			if (isim == null) {
				if (other.isim != null)
					return false;
			} else if (!isim.equals(other.isim))
				return false;
			return true;
		}
	
		

		
	}
public static void main(String args[]) {
	Set<Player> hashset = new HashSet<Player>();
	
	Player player2 = new Player("erdi", 3);
	Player player3 = new Player("emir", 7);
	Player player4 = new Player("ferdo", 5);
	Player player1 = new Player("ferdo", 5);
	
	hashset.add(player1);
	hashset.add(player2);
	hashset.add(player3);
	hashset.add(player4);
	
	for(Player p : hashset) {
		System.out.println(p);
	}
//	hashset.add("Java");
//	hashset.add("python");
//	hashset.add("c");
//	hashset.add("css");
//	hashset.add("css");
//	
//	for(String s : hashset) {
//		System.out.println(s);
//	}
}
}
