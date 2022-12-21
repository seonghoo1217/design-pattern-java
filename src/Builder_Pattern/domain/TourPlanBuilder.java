package Builder_Pattern.domain;

import java.time.LocalDate;

public interface TourPlanBuilder {
	TourPlanBuilder nightAndDays(int nights,int days);

	TourPlanBuilder title(String title);

	TourPlanBuilder startDate(LocalDate localDate);

	TourPlanBuilder whereToStay(String whereToStay);

	TourPlanBuilder addPlan(int day,String plan);

	TourPlan getPlan();
}
