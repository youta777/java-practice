class Jikkou01 {
    public static void main(String[] args){
	Saifu mySaifu = new Saifu();
	int get = mySaifu.getOkane();
	mySaifu.setOkane(get+5000);
	System.out.println("okane="+mySaifu.getOkane());
    }
}