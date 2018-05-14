class Test03B {
    public static void main(String[] args){
	Dog3 sakura = new Dog3();
	Dog3 momo = new Dog3();

	sakura.numOfLegs = 10;

	System.out.println(momo.numOfLegs);

	Dog3.showNumLegs();

	//	Dog3.showName();
    }
}
  