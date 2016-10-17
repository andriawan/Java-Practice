package Adv;

public class Cust implements Comparable<Cust> {

	Integer Id;
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null ){
			return false;
		}
		
		if(getClass() != obj.getClass()){
			return false;
		}
		
		final Cust others = (Cust) obj;
		
		if(this.Id != others.Id && (this.Id == null || !this.Id.equals(others.Id))){
			return false;
		}
		
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 10;
		hash = 10 * hash + (this.Id != null ? this.Id.hashCode(): 0);
		return hash;
	}

	@Override
	public int compareTo(Cust c) {
		return getId().compareTo(c.getId());
	}

}
