package _06_duck;

public class monkey {
	
	String favoriteFood;
	int numberOfFriends = 0;
	monkey(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;
        
 }
	void monkeyNoise() {
		System.out.println("monkey says oo oo aa aa");
	}
	void swing() {
		System.out.println("monkey noise monkey noise jump tree swing");
	}
}
