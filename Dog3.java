class Dog3 {
    Dog3(){ 
	name = "JOHN";
    }
    
    Dog3(String s){
	name = s;
	    }
    
    String name="HACHI";
    
    void setName(String s){
	name=s;
    
    }
    String whoami(){
	return name;
    }
    
    static int numOfLegs = 4;

    static int showNumLegs(){
	return numOfLegs;
    }

    /*    static String showName(){
	return name;
    }
    */
}

