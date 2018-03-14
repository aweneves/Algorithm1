package sort;
/**
 * 
 * @author Administrator
 *
 */
public class Test2 {
	/**
	 * 
	 * @param m 购物总金额
	 * @param y	邮费
	 * @param t	满100减免金额
	 * @param s	满300减免金额
	 * @return	优惠卷推荐结果
	 */
	private static String recommend(double m, double y, double t, double s){	
		if(m>=100 && m<300){
			if(y > t){
				return "满100包邮";
			}else{
				return "满100减" + t;
			}
		}else if(m>=300){
			if(y > s){
				return "满100包邮";
			}else{
				return "满300减" + s;
			}
		}
		return "未满100，不能使用优惠卷";
	}
	public static void main(String[] args) {
		System.out.println(recommend(150,15,10,20));
		System.out.println(recommend(90,15,10,20));
		System.out.println(recommend(300,30,10,20));
		System.out.println(recommend(300,15,10,20));
	}

}
