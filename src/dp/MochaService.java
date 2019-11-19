package dp;

public class MochaService {

	private volatile static MochaService mochaService;

	private MochaService() {
	}

	 public static MochaService getInstance() {
		if(mochaService==null) {
			synchronized (MochaService.class) {
				if(mochaService==null) {
						mochaService=new MochaService();
				}
			}
		}
		return mochaService;
	}
}
