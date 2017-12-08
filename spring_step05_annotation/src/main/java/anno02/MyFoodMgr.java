package anno02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component	// @Componet인 경우 myFoodMgr로 객체생성(첫번째만 소문자로 변환되어 인식됨)
			// 별도의 이름을 주려면 @(Component(value="myFood))
public class MyFoodMgr {
	@Autowired
	private Food favoriteFood;
	@Autowired
	private Food unfavoriteFood;
	
	@Override
	public String toString() {
		return "[좋아하는 음식=" + favoriteFood + ", 싫어하는 음식=" + unfavoriteFood + "]";
	}
}