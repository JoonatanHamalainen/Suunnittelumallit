package visitor;

public class LevelingVisitor implements Visitor {
	
	private static int ovrTimesLeveled = 0;

	@Override
	public void visit(Tank tank) {
		
		if(tank.getTimesLeveled() == 5) {
			tank.changeState(Sleeping.getInstance());
			tank.setTimesLeveled(0);
		}
		else if(ovrTimesLeveled==2) {
			tank.changeState(Awake.getInstance());
			ovrTimesLeveled = 0;
		}
		
		tank.levelUp();
		ovrTimesLeveled++;

	}

	@Override
	public void visit(Fighter fighter) {
		if(fighter.getTimesLeveled() == 5) {
			fighter.changeState(Sleeping.getInstance());
			fighter.setTimesLeveled(0);
		}
		if(ovrTimesLeveled==2) {
			fighter.changeState(Awake.getInstance());
			ovrTimesLeveled = 0;
		}
		
		fighter.levelUp();
		ovrTimesLeveled++;
		
	}

	@Override
	public void visit(Marksman marksman) {
		if(marksman.getTimesLeveled() == 5) {
			marksman.changeState(Sleeping.getInstance());
			marksman.setTimesLeveled(0);
		}
		else if(ovrTimesLeveled==2) {
			marksman.changeState(Awake.getInstance());
			ovrTimesLeveled = 0;
		}
		
		marksman.levelUp();
		ovrTimesLeveled++;
	}

}
