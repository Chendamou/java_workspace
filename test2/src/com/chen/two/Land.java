package com.chen.two;

public class Land {

	/**
	 * ����ͬ��ˮ
	 */
	public static void main(String[] args) {
		Village.setWaterAmount(200);//���þ�ˮ��Ϊ200��
		int leftWater = Village.waterAmout;
		System.out.println("ˮ������ "+leftWater+"��ˮ");
		Village zhaoZhuang  = new Village("��ׯ");//����Village���͵Ķ���zhaozhuang
		Village maJiaHeZi = new Village("��Һ���");//����Village���͵Ķ���majiahezi
		zhaoZhuang.setPeopleNumber(80);//������ׯ������
		maJiaHeZi.setPeopleNumber(120);//������Һ��ӵ�����
		zhaoZhuang.drinkWater(50);//��ׯ�ĺ�ˮ��
		leftWater = maJiaHeZi.lookWaterAmount();//��Һ��ӿ�����ʣ�µ�ˮ��
		String name  = maJiaHeZi.name;
		System.out.println(name+"����ˮ������ "+leftWater+"��ˮ");
		maJiaHeZi.drinkWater(100);
		leftWater  = zhaoZhuang.lookWaterAmount();
		name = zhaoZhuang.name;
		System.out.println(name+"����ˮ������ "+leftWater+"��ˮ");
		int peopleNumber = zhaoZhuang.getPeopleNumber();//��ȡ��ׯ������
		System.out.println("��ׯ���˿ڣ�"+peopleNumber);
		peopleNumber = maJiaHeZi.getPeopleNumber();
		System.out.println("��Һ��ӵ��˿ڣ�"+peopleNumber);
	
	}

}
