import java.util.*;
public class adressbook
{
	private ArrayList<buddyinfo> buddies;
	public static void main(String[] args) 
	{
		System.out.println("Adress Book.");
		adressbook contacts = new adressbook();
		buddyinfo newbuddy = new buddyinfo("johan", 19, "501 kinderheim");
		contacts.addbuddy(newbuddy);
		contacts.removebuddy(newbuddy);
	}
	public adressbook(ArrayList<buddyinfo> buddies)
	{
		super();
	}
	public adressbook()
	{
		
	}
	
	public void addbuddy(String name, int age, String Adress)
	{
		buddyinfo newbuddy = new buddyinfo(name,age,Adress);
		buddies.add(newbuddy);
	}
	public void addbuddy(buddyinfo newbuddy)
	{
		buddies.add(newbuddy);
	}
	public void removebuddy(buddyinfo badbuddy)
	{
		for(buddyinfo buddy: buddies)
			if(buddy.equals(badbuddy))
				buddies.remove(buddy);
		
	}
	
	public ArrayList<buddyinfo> getBuddies() {
		return buddies;
	}
	public void setBuddies(ArrayList<buddyinfo> buddies) {
		this.buddies = buddies;
	}
}