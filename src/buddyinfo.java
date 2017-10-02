public class buddyinfo
{
	private String name;
	private int age;
	private String adress;
	public static void main(String[] args) 
	{
		
	}
	public buddyinfo(String name, int age, String adress)
	{
		this.name = name;
		this.age = age;
		this.adress = adress;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public String getname()
	{
		return this.name;
	}
	public void setage(int age)
	{
		this.age = age;
	}
	public int getage()
	{
		return this.age;
	}
	public void setadress(String adress)
	{
		this.adress = adress;
	}
	public String getadress()
	{
		return this.adress;
	}
}