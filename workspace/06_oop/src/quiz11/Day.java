package quiz11;

public class Day {

	private String schedule;

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}// schedule를 저장 해주고 수정할 때 사용
	
	
	public void info() {
		if(schedule == null || schedule.isEmpty()) { //null 또는 빈문자열("")
			System.out.println("없음");
		} else {
			System.out.println("[" + schedule + "]");
		}
	}
}
