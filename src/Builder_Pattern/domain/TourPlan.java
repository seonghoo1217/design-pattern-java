package Builder_Pattern.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class TourPlan {
	private String title; //여행제목
	private LocalDate startDate; //출발 일
	private int nights;//몇박
	private int days; //며칠
	private String whereToStay; //어디에 머물지
	private List<DetailPlan> plans; //n일차 할 일

	private class DetailPlan {
		private int day; //n일차
		private String plan; //할일
	}

	/**
	 * 기본 생성자 (필수)
	 */
	public TourPlan() {
	}

	/**
	 * 일반적인 여행 계획 생성자
	 *
	 * @param title 여행 제목
	 * @param startDate 출발 일
	 * @param nights n박
	 * @param days m일
	 * @param whereToStay 머물 장소
	 * @param plans n일차 할 일
	 */
	public TourPlan(String title, LocalDate startDate, int nights, int days,
					String whereToStay, List<DetailPlan> plans) {
		this.title = title;
		this.nights = nights;
		this.days = days;
		this.startDate = startDate;
		this.whereToStay = whereToStay;
		this.plans = plans;
	}

	/**
	 * 당일치기 여행 계획 생성자
	 *
	 * @param title 여행 제목
	 * @param startDate 출발 일
	 * @param plans 1일차 할 일
	 */
	public TourPlan(String title, LocalDate startDate, List<DetailPlan> plans) {
		this.title = title;
		this.startDate = startDate;
		this.plans = plans;
	}
}
