class Test02A{
    public static void main(String[] args){
	Dog akita = new Dog();
	String box = akita.getName();
	box += "-KOH"; 
	akita.setName(box); 
	
	System.out.println(akita.getName());  // HACHI-KOH

	System.out.println(box.length());  // 9

	System.out.println(box.toLowerCase());  // hachi-koh

	System.out.println(box.replace("HA","PO"));  // POCHI-KOH

	String str[] = box.split("-"); 
	System.out.println(str[0]);  // HACHI
    }
}