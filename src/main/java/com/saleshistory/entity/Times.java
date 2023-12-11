package com.saleshistory.entity;

import java.time.LocalDate;

import org.hibernate.annotations.JoinColumnOrFormula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Times {
	@Column(name="calendar_month_id")
	private int calendarMonthId;
	@Column(name="calendar_month_int")
	private int calendarMonthInt; 
	@Column(name="calendar_quarter_id")
	private int calendarQuarterId; 
	@Column(name="calendar_quarter_int")
	private int calendarQuarterInt;
	@Column(name="calendar_week_int")
	private int calendarWeekInt; 
	@Column(name="calendar_year")
	private int calendarYear; 
	@Column(name="calendar_year_id")
	private int calendarYearId;
	@Column(name="day_int_in_month")
	private int dayIntInMonth; 
	@Column(name="day_int_in_week")
	private int dayIntInWeek; 
	@Column(name="days_in_cal_month")
	private int daysInCalMonth;
	@Column(name="days_in_cal_quarter")
	private int daysInCalQuarter; 
	@Column(name="days_in_cal_year")
	private int daysInCalYear;
	@Column(name="days_in_fis_month")
	private int daysInFisMonth;  
	@Column(name="days_in_fis_quarter")
	private int daysInFisQuarter;
	@Column(name="days_in_fis_year")
	private int daysInFisYear;
	@Column(name="end_of_cal_month")
	private LocalDate endOfCalMonth; 
	@Column(name="end_of_cal_quarter")
	private LocalDate endOfCalQuarter;
	@Column(name="end_of_cal_year")
	private LocalDate endOfCalYear; 
	@Column(name="end_of_fis_month")
	private LocalDate endOfFisMonth;
	@Column(name="end_of_fis_quarter")
	private LocalDate endOfFisQuarter;
	@Column(name="end_of_fis_year")
	private LocalDate endOfFisYear;
	@Column(name="fiscal_month_id")
	private int fiscalMonthId;
	@Column(name="fiscal_month_int")
	private int fiscalMonthInt; 
	@Column(name="fiscal_quarter_id")
	private int fiscalQuarterId;
	@Column(name="fiscal_quarter_int")
	private int fiscalQuarterInt;
	@Column(name="fiscal_week_int")
	private int fiscalWeekInt; 
	@Column(name="fiscal_year")
	private int fiscalYear; 
	@Column(name="fiscal_year_id")
	private int fiscalYearId; 
	@Id
	@Column(name="time_id")
	private LocalDate timeId;
	@Column(name="week_ending_day")
	private LocalDate weekEndingDay; 
	@Column(name="week_ending_day_id")
	private int weekEndingDayId;
	@Column(name="calendar_month_desc")
	private String calendarMonthDesc; 
	@Column(name="calendar_month_name")
	private String calendarMonthName; 
	@Column(name="calendar_quarter_desc")
	private String calendarQuarterDesc;
	@Column(name="day_name")
	private String dayName;  
	@Column(name="fiscal_month_desc")
	private String fiscalMonthDesc; 
	@Column(name="fiscal_month_name")
	private String fiscalMonthName; 
	@Column(name="fiscal_quarter_desc")
	private String fiscalQuarterDesc;
	
	public Times() {
		super();
	}

	public Times(int calendarMonthId, int calendarMonthInt, int calendarQuarterId, int calendarQuarterInt,
			int calendarWeekInt, int calendarYear, int calendarYearId, int dayIntInMonth, int dayIntInWeek,
			int daysInCalMonth, int daysInCalQuarter, int daysInCalYear, int daysInFisMonth, int daysInFisQuarter,
			int daysInFisYear, LocalDate endOfCalMonth, LocalDate endOfCalQuarter, LocalDate endOfCalYear,
			LocalDate endOfFisMonth, LocalDate endOfFisQuarter, LocalDate endOfFisYear, int fiscalMonthId,
			int fiscalMonthInt, int fiscalQuarterId, int fiscalQuarterInt, int fiscalWeekInt, int fiscalYear,
			int fiscalYearId, LocalDate timeId, LocalDate weekEndingDay, int weekEndingDayId, String calendarMonthDesc,
			String calendarMonthName, String calendarQuarterDesc, String dayName, String fiscalMonthDesc,
			String fiscalMonthName, String fiscalQuarterDesc) {
		super();
		this.calendarMonthId = calendarMonthId;
		this.calendarMonthInt = calendarMonthInt;
		this.calendarQuarterId = calendarQuarterId;
		this.calendarQuarterInt = calendarQuarterInt;
		this.calendarWeekInt = calendarWeekInt;
		this.calendarYear = calendarYear;
		this.calendarYearId = calendarYearId;
		this.dayIntInMonth = dayIntInMonth;
		this.dayIntInWeek = dayIntInWeek;
		this.daysInCalMonth = daysInCalMonth;
		this.daysInCalQuarter = daysInCalQuarter;
		this.daysInCalYear = daysInCalYear;
		this.daysInFisMonth = daysInFisMonth;
		this.daysInFisQuarter = daysInFisQuarter;
		this.daysInFisYear = daysInFisYear;
		this.endOfCalMonth = endOfCalMonth;
		this.endOfCalQuarter = endOfCalQuarter;
		this.endOfCalYear = endOfCalYear;
		this.endOfFisMonth = endOfFisMonth;
		this.endOfFisQuarter = endOfFisQuarter;
		this.endOfFisYear = endOfFisYear;
		this.fiscalMonthId = fiscalMonthId;
		this.fiscalMonthInt = fiscalMonthInt;
		this.fiscalQuarterId = fiscalQuarterId;
		this.fiscalQuarterInt = fiscalQuarterInt;
		this.fiscalWeekInt = fiscalWeekInt;
		this.fiscalYear = fiscalYear;
		this.fiscalYearId = fiscalYearId;
		this.timeId = timeId;
		this.weekEndingDay = weekEndingDay;
		this.weekEndingDayId = weekEndingDayId;
		this.calendarMonthDesc = calendarMonthDesc;
		this.calendarMonthName = calendarMonthName;
		this.calendarQuarterDesc = calendarQuarterDesc;
		this.dayName = dayName;
		this.fiscalMonthDesc = fiscalMonthDesc;
		this.fiscalMonthName = fiscalMonthName;
		this.fiscalQuarterDesc = fiscalQuarterDesc;
	}
	
	public int getCalendarMonthId() {
		return calendarMonthId;
	}
	public void setCalendarMonthId(int calendarMonthId) {
		this.calendarMonthId = calendarMonthId;
	}
	public int getCalendarMonthInt() {
		return calendarMonthInt;
	}
	public void setCalendarMonthInt(int calendarMonthInt) {
		this.calendarMonthInt = calendarMonthInt;
	}
	public int getCalendarQuarterId() {
		return calendarQuarterId;
	}
	public void setCalendarQuarterId(int calendarQuarterId) {
		this.calendarQuarterId = calendarQuarterId;
	}
	public int getCalendarQuarterInt() {
		return calendarQuarterInt;
	}
	public void setCalendarQuarterInt(int calendarQuarterInt) {
		this.calendarQuarterInt = calendarQuarterInt;
	}
	public int getCalendarWeekInt() {
		return calendarWeekInt;
	}
	public void setCalendarWeekInt(int calendarWeekInt) {
		this.calendarWeekInt = calendarWeekInt;
	}
	public int getCalendarYear() {
		return calendarYear;
	}
	public void setCalendarYear(int calendarYear) {
		this.calendarYear = calendarYear;
	}
	public int getCalendarYearId() {
		return calendarYearId;
	}
	public void setCalendarYearId(int calendarYearId) {
		this.calendarYearId = calendarYearId;
	}
	public int getDayIntInMonth() {
		return dayIntInMonth;
	}
	public void setDayIntInMonth(int dayIntInMonth) {
		this.dayIntInMonth = dayIntInMonth;
	}
	public int getDayIntInWeek() {
		return dayIntInWeek;
	}
	public void setDayIntInWeek(int dayIntInWeek) {
		this.dayIntInWeek = dayIntInWeek;
	}
	public int getDaysInCalMonth() {
		return daysInCalMonth;
	}
	public void setDaysInCalMonth(int daysInCalMonth) {
		this.daysInCalMonth = daysInCalMonth;
	}
	public int getDaysInCalQuarter() {
		return daysInCalQuarter;
	}
	public void setDaysInCalQuarter(int daysInCalQuarter) {
		this.daysInCalQuarter = daysInCalQuarter;
	}
	public int getDaysInCalYear() {
		return daysInCalYear;
	}
	public void setDaysInCalYear(int daysInCalYear) {
		this.daysInCalYear = daysInCalYear;
	}
	public int getDaysInFisMonth() {
		return daysInFisMonth;
	}
	public void setDaysInFisMonth(int daysInFisMonth) {
		this.daysInFisMonth = daysInFisMonth;
	}
	public int getDaysInFisQuarter() {
		return daysInFisQuarter;
	}
	public void setDaysInFisQuarter(int daysInFisQuarter) {
		this.daysInFisQuarter = daysInFisQuarter;
	}
	public int getDaysInFisYear() {
		return daysInFisYear;
	}
	public void setDaysInFisYear(int daysInFisYear) {
		this.daysInFisYear = daysInFisYear;
	}
	public LocalDate getEndOfCalMonth() {
		return endOfCalMonth;
	}
	public void setEndOfCalMonth(LocalDate endOfCalMonth) {
		this.endOfCalMonth = endOfCalMonth;
	}
	public LocalDate getEndOfCalQuarter() {
		return endOfCalQuarter;
	}
	public void setEndOfCalQuarter(LocalDate endOfCalQuarter) {
		this.endOfCalQuarter = endOfCalQuarter;
	}
	public LocalDate getEndOfCalYear() {
		return endOfCalYear;
	}
	public void setEndOfCalYear(LocalDate endOfCalYear) {
		this.endOfCalYear = endOfCalYear;
	}
	public LocalDate getEndOfFisMonth() {
		return endOfFisMonth;
	}
	public void setEndOfFisMonth(LocalDate endOfFisMonth) {
		this.endOfFisMonth = endOfFisMonth;
	}
	public LocalDate getEndOfFisQuarter() {
		return endOfFisQuarter;
	}
	public void setEndOfFisQuarter(LocalDate endOfFisQuarter) {
		this.endOfFisQuarter = endOfFisQuarter;
	}
	public LocalDate getEndOfFisYear() {
		return endOfFisYear;
	}
	public void setEndOfFisYear(LocalDate endOfFisYear) {
		this.endOfFisYear = endOfFisYear;
	}
	public int getFiscalMonthId() {
		return fiscalMonthId;
	}
	public void setFiscalMonthId(int fiscalMonthId) {
		this.fiscalMonthId = fiscalMonthId;
	}
	public int getFiscalMonthInt() {
		return fiscalMonthInt;
	}
	public void setFiscalMonthInt(int fiscalMonthInt) {
		this.fiscalMonthInt = fiscalMonthInt;
	}
	public int getFiscalQuarterId() {
		return fiscalQuarterId;
	}
	public void setFiscalQuarterId(int fiscalQuarterId) {
		this.fiscalQuarterId = fiscalQuarterId;
	}
	public int getFiscalQuarterInt() {
		return fiscalQuarterInt;
	}
	public void setFiscalQuarterInt(int fiscalQuarterInt) {
		this.fiscalQuarterInt = fiscalQuarterInt;
	}
	public int getFiscalWeekInt() {
		return fiscalWeekInt;
	}
	public void setFiscalWeekInt(int fiscalWeekInt) {
		this.fiscalWeekInt = fiscalWeekInt;
	}
	public int getFiscalYear() {
		return fiscalYear;
	}
	public void setFiscalYear(int fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
	public int getFiscalYearId() {
		return fiscalYearId;
	}
	public void setFiscalYearId(int fiscalYearId) {
		this.fiscalYearId = fiscalYearId;
	}
	public LocalDate getTimeId() {
		return timeId;
	}
	public void setTimeId(LocalDate timeId) {
		this.timeId = timeId;
	}
	public LocalDate getWeekEndingDay() {
		return weekEndingDay;
	}
	public void setWeekEndingDay(LocalDate weekEndingDay) {
		this.weekEndingDay = weekEndingDay;
	}
	public int getWeekEndingDayId() {
		return weekEndingDayId;
	}
	public void setWeekEndingDayId(int weekEndingDayId) {
		this.weekEndingDayId = weekEndingDayId;
	}
	public String getCalendarMonthDesc() {
		return calendarMonthDesc;
	}
	public void setCalendarMonthDesc(String calendarMonthDesc) {
		this.calendarMonthDesc = calendarMonthDesc;
	}
	public String getCalendarMonthName() {
		return calendarMonthName;
	}
	public void setCalendarMonthName(String calendarMonthName) {
		this.calendarMonthName = calendarMonthName;
	}
	public String getCalendarQuarterDesc() {
		return calendarQuarterDesc;
	}
	public void setCalendarQuarterDesc(String calendarQuarterDesc) {
		this.calendarQuarterDesc = calendarQuarterDesc;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public String getFiscalMonthDesc() {
		return fiscalMonthDesc;
	}
	public void setFiscalMonthDesc(String fiscalMonthDesc) {
		this.fiscalMonthDesc = fiscalMonthDesc;
	}
	public String getFiscalMonthName() {
		return fiscalMonthName;
	}
	public void setFiscalMonthName(String fiscalMonthName) {
		this.fiscalMonthName = fiscalMonthName;
	}
	public String getFiscalQuarterDesc() {
		return fiscalQuarterDesc;
	}
	public void setFiscalQuarterDesc(String fiscalQuarterDesc) {
		this.fiscalQuarterDesc = fiscalQuarterDesc;
	}
	
}
