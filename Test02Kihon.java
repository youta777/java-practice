class Test02Kihon {
    public static void main(String[] args){
	float ave = 0.0f;
	float sum = 0;
	float data[] = new float[6];

	data[0] = 2.3f;
	data[1] = 3.4f;
	data[2] = 1.5f;
	data[3] = 30.9f;
	data[4] = 2.1f;
	data[5] = 9.2f;

	for(int i=0; i<data.length; i++){
	    sum += data[i];
	}
	ave = sum / data.length;
	System.out.println(ave);

	if(ave > 5){
	    System.out.println("more");
	}else{
	    System.out.println("less");
	}
    }
    
}