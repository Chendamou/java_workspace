package com.chen.two;

public class Land {

	/**
	 * 共饮同井水
	 */
	public static void main(String[] args) {
		Village.setWaterAmount(200);//设置井水量为200升
		int leftWater = Village.waterAmout;
		System.out.println("水井中有 "+leftWater+"升水");
		Village zhaoZhuang  = new Village("赵庄");//创建Village类型的对象zhaozhuang
		Village maJiaHeZi = new Village("马家河子");//创建Village类型的对象majiahezi
		zhaoZhuang.setPeopleNumber(80);//设置赵庄的人数
		maJiaHeZi.setPeopleNumber(120);//设置马家河子的人数
		zhaoZhuang.drinkWater(50);//赵庄的喝水量
		leftWater = maJiaHeZi.lookWaterAmount();//马家河子看井中剩下的水量
		String name  = maJiaHeZi.name;
		System.out.println(name+"发现水井中有 "+leftWater+"升水");
		maJiaHeZi.drinkWater(100);
		leftWater  = zhaoZhuang.lookWaterAmount();
		name = zhaoZhuang.name;
		System.out.println(name+"发现水井中有 "+leftWater+"升水");
		int peopleNumber = zhaoZhuang.getPeopleNumber();//获取赵庄的人数
		System.out.println("赵庄的人口："+peopleNumber);
		peopleNumber = maJiaHeZi.getPeopleNumber();
		System.out.println("马家河子的人口："+peopleNumber);
	
	}

}
