package edu.kh.oop.practice.model.vo;

public class Hero {
	private String  nickname;
	private String job;
	private int hp;
	private int mp;
	private int level;
	private double exp;
		
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
	public Hero() {}
	public Hero(String nicknaem,String job,int hp,int mp,int level,double exp) {
		this.nickname=nicknaem;
		this.job=job;
		this.hp=hp;
		this.mp=mp;
		this.level=level;
		this.exp=exp;
		
		System.out.println("============캐릭터 생성============");
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n",this.job,this.nickname);
		System.out.printf("현재 레벨 : %d\n",this.level);
		System.out.printf("현재 hp : %d\n",this.hp);
		System.out.printf("현재 mp : %d\n",this.mp);
		System.out.printf("현재 경험치 : %.1f\n",this.exp);
	}
	
	public void attack(double exp) {
		this.exp+=exp;
		System.out.printf("'%s'은/는 공격을 했다!!! 현재 경험치:%.1f\n",this.nickname,this.exp);
		if (this.exp%300+exp>=300) {
			this.level=(int)(this.exp/300);
			System.out.println("레벨이 올랐습니다!! 현재레벨:"+this.level);
		}
	}
	
	public void dash() {
		if (this.mp<=0) {
			System.out.println("[마력 부족]더 이상 대시 할 수 없어요~!");			
		}else {
			this.mp-=10;
			System.out.printf("%s의 엄청 빠른 대시!!! 남은마력:%d\n",this.nickname,this.mp);			
		}
	}
	
	@Override
	public String toString() {
		System.out.printf("============%s============\n"
				+ "- 현재 레벨 : %d\n"
				+ "- 현재 hp : %d\n"
				+ "- 현재 mp : %d\n"
				+ "- 현재 exp : %.1f\n",nickname,level,hp,mp,exp);
		return "";
	}
	
}
