package anno01;

public class MyFoodMgr {
	private Food favoriteFood;
	private Food unfavoriteFood;
	
	public Food getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	public Food getUnfavoriteFood() {
		return unfavoriteFood;
	}
	public void setUnfavoriteFood(Food unfavoriteFood) {
		this.unfavoriteFood = unfavoriteFood;
	}
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + ", 싫어하는 음식=" + unfavoriteFood + "]";
	}
}
