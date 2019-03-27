package main;
public class Item{
    public String itemName;
    public int mrp;
    public  void addItem(String itemName,int mrpItem){
        this.itemName = itemName; //write your code here
    	this.mrp = mrpItem; //-------------------

    }
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
    
}