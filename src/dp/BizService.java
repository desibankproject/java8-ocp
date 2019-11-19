package dp;

public class BizService {
	
	private  static BizService bizService = new BizService();

	private BizService() {
		System.out.println(")@)@)@@(Cons is called!!!!!!!!!!!!!!!!!!");
	}

	public static BizService getInstance() {
		return bizService;
	}
}
