package observer_pattern.test;

public interface Coach {
	void subscribe(Crew crew);
	void unsubscrib(Crew crew);
	void notifyCrew(String msg);

}
