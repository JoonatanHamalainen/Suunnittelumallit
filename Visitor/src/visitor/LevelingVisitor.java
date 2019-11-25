package visitor;

public class LevelingVisitor implements Visitor {
	
	private int ovrTimesLeveled = 0;

	@Override
	public void visit(Tank tank) {
		
		if(tank.getTimesLeveled() == 5) {
			tank.changeState(new Sleeping());
			tank.setTimesLeveled(0);
		}
		else if(ovrTimesLeveled==2) {
			tank.changeState(new Sleeping());
			ovrTimesLeveled = 0;
		}
		
		tank.levelUp();
		ovrTimesLeveled++;

	}

	@Override
	public void visit(Fighter fighter) {
		if(fighter.getTimesLeveled() == 5) {
			fighter.changeState(new Sleeping());
			fighter.setTimesLeveled(0);
		}
		else if(ovrTimesLeveled==2) {
			fighter.changeState(new Sleeping());
			ovrTimesLeveled = 0;
		}
		
		fighter.levelUp();
		ovrTimesLeveled++;
		
	}

	@Override
	public void visit(Marksman marksman) {
		if(marksman.getTimesLeveled() == 5) {
			marksman.changeState(new Sleeping());
			marksman.setTimesLeveled(0);
		}
		else if(ovrTimesLeveled==2) {
			marksman.changeState(new Sleeping());
			ovrTimesLeveled = 0;
		}
		
		marksman.levelUp();
		ovrTimesLeveled++;
	}

}
